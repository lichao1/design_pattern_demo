package cn.lichao.design.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LCProxy {
    private static final String LN="\r\n";

    public  static  Object newProxyInstance(LCClassLoader classLoader,Class<?>[] interfances, LCInvocationHandler h){
        //生成java文件
       String sources= generateSrc(interfances);
        String path = LCProxy.class.getResource("").getPath();
        System.out.println("path="+path);
        //输出到磁盘
        File file = new File(path + "$proxy0.java");
        try {
            FileWriter fw=new FileWriter(file);
            fw.write(sources);
            fw.flush();
            fw.close();
        //编译成calss文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null, null, null, null, null, javaFileObjects);
        task.call();
        standardFileManager.close();


            //加载到JVM
            Class<?> proxyClass = classLoader.findClass("$proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(LCInvocationHandler.class);
            return constructor.newInstance(h);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfances) {

        StringBuffer sb=new StringBuffer();
        sb.append("package cn.lichao.design.proxy.custom;"+LN);
        sb.append("import cn.lichao.design.proxy.statics.IDBQuery;"+LN);
        sb.append("import java.lang.reflect.Method;"+LN);
        sb.append("public class $proxy0 implements "+interfances[0].getName()+" {"+LN);
        sb.append("LCInvocationHandler h;"+LN);
        sb.append("public $proxy0(LCInvocationHandler h){"+LN);
        sb.append("this.h=h;"+LN);
        sb.append("}"+LN);
        for(Method m : interfances[0].getMethods()){
           sb.append("public "+m.getReturnType().getName()+ " "+ m.getName()+"(){"+LN);
           sb.append("try{"+LN);
           sb.append("Method m="+interfances[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});"+LN);
           sb.append("return (String) this.h.invoke(this,m,null);"+LN);
           sb.append("}catch(Throwable e){"+LN);
           sb.append("e.printStackTrace();");
           sb.append("}"+LN);
            sb.append("return null;");
           sb.append("}"+LN);
        }


        sb.append("}"+LN);
        return sb.toString();

    }
}

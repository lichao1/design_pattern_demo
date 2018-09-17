package cn.lichao.design.proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LCClassLoader extends ClassLoader {

    private File classPathFile;

    public LCClassLoader() {
        String path = LCClassLoader.class.getResource("").getPath();
        System.out.println(path);
        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name){
        String className = LCClassLoader.class.getPackage().getName() + "." + name;
        if (null != classPathFile) {
            File classFile = new File(classPathFile + "/" + name + ".class");
            FileInputStream fileInputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                fileInputStream = new FileInputStream(classFile);
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buff = new byte[1024];
                int len;
                while ((len = fileInputStream.read(buff)) != -1) {
                    System.out.println(len);
                    byteArrayOutputStream.write(buff, 0, len);
                }
                System.out.println(className);
                byteArrayOutputStream.flush();
                return defineClass(className, byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        return null;
    }
}

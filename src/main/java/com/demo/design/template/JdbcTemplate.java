package com.demo.design.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * author lichao
 * date  2020/2/23 15:35
 **/
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<?> execcuteQuery(String sql,RowMaper rowMaper, Object[] values){
        try {

        //获取连接
            Connection connection = this.getConnection();
        //创建语句集
            PreparedStatement pstm = this.createPrepareStatement(connection, sql);
        //执行语句集
            ResultSet rs= this.execcuteQuery(pstm,values);
        //处理结果集
           List list= this.paresResultSet(rs,rowMaper);
        //关闭结果
            
            this.close(rs,pstm,connection);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void close(ResultSet rs, PreparedStatement pstm, Connection connection) throws Exception {
        rs.close();
        pstm.close();
        connection.close();
    }

    private List paresResultSet(ResultSet rs, RowMaper rowMaper) throws Exception {

        List<Object> list =new ArrayList<>();
        int rowNum=1;
        while(rs.next()){
          list.add(rowMaper.mapRow(rs,rowNum++));
        }

        return list;
    }

    private ResultSet execcuteQuery(PreparedStatement pstm, Object[] values) throws Exception{

        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql)throws Exception   {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        return preparedStatement;
    }

    public Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }

}

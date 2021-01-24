package com.demo.design.template;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * author lichao
 * date  2020/2/23 16:14
 **/
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){

        String sql ="Select * from Member";
       return this.execcuteQuery(sql, new RowMaper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception{
                Member member = new Member();
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        }, null);
    }
}

package com.demo.design.template;

import java.sql.ResultSet;

/**
 * author lichao
 * date  2020/2/23 15:34
 **/
public interface RowMaper<T> {

    T mapRow(ResultSet rs,int rowNum)throws Exception;
}

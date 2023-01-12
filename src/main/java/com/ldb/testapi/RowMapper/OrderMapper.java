package com.ldb.testapi.RowMapper;

import com.ldb.testapi.Model.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        Order data = new Order();

        try {
            data.setOrderNo(rs.getString("ORDER_NO"));
            data.setOrderDate(rs.getString("ORDER_DATE"));
            data.setProductName(rs.getString("ORDER_PRODUCT_NAME"));
            data.setPriceAmt(rs.getString("ORDER_APPROVED_AMT"));
            data.setOrderAmt(rs.getString("ORDER_AMT"));


        } catch (Exception e){
            e.printStackTrace();
            return data;
        }

        return data;
    }
}

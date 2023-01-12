package com.ldb.testapi.Dao;

import com.ldb.testapi.Model.Card;
import com.ldb.testapi.Model.Order;
import com.ldb.testapi.Model.Test;
import com.ldb.testapi.RowMapper.CardMapper;
import com.ldb.testapi.RowMapper.OrderMapper;
import com.ldb.testapi.RowMapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
@Component
public class ImpDao  implements Dao{

    @Autowired
    @Qualifier("WALLETJdbcTemplate")
     private JdbcTemplate WALLETJdbcTemplate;


    @Override
    public List<Test> getATM( String atmID) {

        List<Test> resutl = new ArrayList<>();
        try {

            String SQL = "SELECT  ATM_ID AS ATM ,ATM_LOCATION FROM onecard.CZ_ATM@onecard_link where ATM_ID = '"+atmID+"'  ";

            System.out.printf(SQL);
            resutl = WALLETJdbcTemplate.query(SQL , new TestMapper());

        }catch (Exception e){
            e.printStackTrace();
            return resutl;
        }
        return resutl;
    }

    @Override
    public List<Card> getCard(String cardNo) {

        List<Card> resultCard = new ArrayList<>();
        try {

            String SQL = "select CARD_NO , CARD_EMBOSSED_NAME , CARD_CUST_ID from onecard.cz_card @onecard_link where CARD_NO = '"+cardNo+"'  ";

            System.out.printf(SQL);
            resultCard = WALLETJdbcTemplate.query(SQL , new CardMapper());

        }catch (Exception e){
            e.printStackTrace();
            return resultCard;
        }
        return resultCard;
    }

    @Override
    public List<Order> getOrder(String OrderNo) {

        List<Order> resultOrder = new ArrayList<>();
        try {

            String SQL = " select ORDER_NO , ORDER_DATE , ORDER_PRODUCT_NAME,ORDER_APPROVED_AMT,ORDER_AMT from fc_order  where Order_NO ='"+OrderNo+"'  ";

            System.out.printf(SQL);
            resultOrder = WALLETJdbcTemplate.query(SQL , new OrderMapper());

        }catch (Exception e){
            e.printStackTrace();
            return resultOrder;
        }
        return resultOrder;
    }




}

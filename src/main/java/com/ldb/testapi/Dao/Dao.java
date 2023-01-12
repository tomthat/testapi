package com.ldb.testapi.Dao;

import com.ldb.testapi.Model.Card;
import com.ldb.testapi.Model.Order;
import com.ldb.testapi.Model.Test;

import java.util.List;

public interface Dao {
    List<Test> getATM ( String atmId);
    List<Card> getCard (String cardNo);

    List<Order> getOrder(String OrderNo);
}

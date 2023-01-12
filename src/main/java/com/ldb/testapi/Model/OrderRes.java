package com.ldb.testapi.Model;

import java.util.List;

public class OrderRes {
    private Message message;
    private List<Order> Order;

    public OrderRes() {
    }

    public OrderRes(Message message, List<Order> Order) {
        this.message = message;
        this.Order = Order;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Order> getOrder() {
        return Order;
    }

    public void setOrder(List<Order> Order) {
        this.Order = Order;
    }

    @Override
    public String toString() {
        return "OrderRes{" +
                "message=" + message +
                ", Order=" + Order +
                '}';
    }
}

package com.ldb.testapi.Model;

import java.util.List;

public class Order {

    private String orderNo;
    private String orderDate;
    private String productName;
    private String productPriceAmt;
    private String orderAmt;

    public Order() {
    }

    public Order(String orderNo) {
        this.orderNo = orderNo;
    }

    public Order(String orderNo, String orderDate, String productName, String productPriceAmt, String orderAmt) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.productName = productName;
        this.productPriceAmt = productPriceAmt;
        this.orderAmt = orderAmt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPriceAmt() {
        return productPriceAmt;
    }

    public void setPriceAmt(String productPriceAmt) {
        this.productPriceAmt = productPriceAmt;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    @Override
    public String toString() {
        return "Card{" +
                "orderNo='" + orderNo + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", productName='" + productName + '\'' +
                ", productPriceAmt='" + productPriceAmt + '\'' +
                ", orderAmt=" + orderAmt +
                '}';
    }


    public void setMessage(Message message) {
    }

    public void setOrder(List<Order> listdata) {
    }
}

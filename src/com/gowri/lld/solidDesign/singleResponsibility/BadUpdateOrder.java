package com.gowri.lld.solidDesign.singleResponsibility;

public class BadUpdateOrder {

    private String orderID;

    public String getOrderID(){
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    //Update order class responsibility is to update the order. Not to print the order. Breaking single responsibility
    public void printOrderID() {
        System.out.println(orderID);
    }
}

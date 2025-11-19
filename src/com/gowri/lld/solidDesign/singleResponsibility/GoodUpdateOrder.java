package com.gowri.lld.solidDesign.singleResponsibility;

public class GoodUpdateOrder {

    private String orderID;

    public String getOrderID(){
        return this.orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    //removed the printOrder ID method to new class
    
}

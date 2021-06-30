/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;

/**
 *
 * @author kasai
 */
public class SalesPerson {
    int salesPersonId;
    ArrayList<Order> orderList = new ArrayList<>();
    
    public SalesPerson(int salesPersonId) {
        this.salesPersonId = salesPersonId;
        this.orderList = new ArrayList<>();
    }

    public int getSalesId() {
        return salesPersonId;
    }

    public void setSalesId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    @Override 
    public String toString(){
        return "{" + "salesPersonId = " + salesPersonId +  ", of Order = " + orderList.size() + "}"; 
    }
}

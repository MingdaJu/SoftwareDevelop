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
public class Customer {
    int CustomerId;
    ArrayList<Order> orderList = new ArrayList<>();
    
    public Customer(int CustomerId) {
        this.CustomerId = CustomerId;
        this.orderList = new ArrayList<>();
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
     @Override
    public String toString(){
        return "{" + "customerId = " + CustomerId + ", of Order = " + orderList.size() + "}"; 
    }
}

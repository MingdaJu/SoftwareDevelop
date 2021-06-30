/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {

    DataReader productReader;
    DataReader orderReader;
    AnalysisHelper helper;

    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        orderReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
    }

    public static void main(String args[]) throws IOException {

        GateWay inst = new GateWay();
        inst.readData();
    }

    private void readData() throws IOException {
        String[] row;
        while ((row = productReader.getNextRow()) != null) {
            generateProduct(row);
        }
        while ((row = orderReader.getNextRow()) != null) {
            Order order = generateOrder(row);
            generateCustomer(row, order);
            generateSalesPerson(row, order);
        }
        runAnalysis();
    }

    private void generateProduct(String[] row) {
        int proId = Integer.parseInt(row[0]);
        int min = Integer.parseInt(row[1]);
        int max = Integer.parseInt(row[2]);
        int target = Integer.parseInt(row[3]);
        Product pro = new Product(proId, min, max, target);
        DataStore.getInstance().getProduct().put(proId, pro);

    }

    private Order generateOrder(String[] row) {
        int orderid = Integer.parseInt(row[0]);
        int itemid = Integer.parseInt(row[1]);
        int proid = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesid = Integer.parseInt(row[4]);
        int custid = Integer.parseInt(row[5]);
        int price = Integer.parseInt(row[6]);
        String segement = row[7];

        Item i = new Item(proid, price, quantity);
        Order o = new Order(orderid, salesid, custid, i);
        DataStore.getInstance().getOrder().put(orderid, o);
        return null;
    }

    private void generateCustomer(String[] row, Order order) {
        int custid = Integer.parseInt(row[5]);

        Map<Integer, Customer> customers = DataStore.getInstance().getCustomer();

        if (customers.containsKey(custid)) {
            customers.get(custid).getOrderList().add(order);
        } else {
            Customer customer = new Customer(custid);
            customer.getOrderList().add(order);
            customers.put(custid, customer);
        }
    }

    private void generateSalesPerson(String[] row, Order order) {
        int salesid = Integer.parseInt(row[4]);

        Map<Integer, SalesPerson> salespeople = DataStore.getInstance().getSalesPerson();

        if (salespeople.containsKey(salesid)) {
            salespeople.get(salesid).getOrderList().add(order);
        } else {
            SalesPerson salesperson = new SalesPerson(salesid);
            salesperson.getOrderList().add(order);
            salespeople.put(salesid, salesperson);
        }
    }

    private void runAnalysis() {
        helper.getThreebestProducts();
        helper.getThreebestCustomer();
        helper.getThreemostProfitPeople();
        helper.getTotalRevenue();
        helper.getAverageprice();
        helper.modify();
    }

    public static void printRow(String[] row) {
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }

}

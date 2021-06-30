/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author jumin
 */
public class AnalysisHelper {

    public void getTotalRevenue() {

        Map<Integer, Product> products = DataStore.getInstance().getProduct();
        Map<Integer, Order> orders = DataStore.getInstance().getOrder();
        int totalRevenue = 0;
        for (Order o : orders.values()) {
            int quantity = o.getItem().getQuantity();
            totalRevenue += (o.getItem().getSalesPrice() - products.get(o.getItem().getProductId()).getTargetPrice()) * quantity;
        }

        System.out.println("****************************************************");
        System.out.println("Total Revenue for the year: " + totalRevenue);
    }

    public void getThreemostProfitPeople() {
        Map<Integer, SalesPerson> salesperson = DataStore.getInstance().getSalesPerson();
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        Map<Integer, Integer> salesprofit = new HashMap<>();
        //List<SalesPerson> salespersonList = new ArrayList<>(salesPerson.values());

        for (Order o : order.values()) {
            int profit = 0;
            int targetprice = 0;
            if (salesprofit.containsKey(o.getSalesPersonId())) {
                profit = salesprofit.get(o.getSalesPersonId());
                for (Product p : product.values()) {
                    if (p.getProductId() == o.getItem().getProductId()) {
                        targetprice = p.getTargetPrice();
                    }
                }
            }

            profit = profit + (o.getItem().getSalesPrice() - targetprice) * o.getItem().getQuantity();
            salesprofit.put(o.getSalesPersonId(), profit);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(salesprofit.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        System.out.println("****************************************************");
        System.out.println("3 sales people who have the most profit : ");

        int i = 0;
        int n = 0;
        int m = 0;
        System.out.println(salesperson.get(list.get(0).getKey()) + " the profit is : " + list.get(0).getValue());
        for (i = 1; i < salesprofit.size(); i++) {
            if (list.get(i).getValue() == list.get(0).getValue()) {
                System.out.println(salesperson.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
                m++;
            }
        }
        System.out.println(salesperson.get(list.get(m + 2).getKey()) + " the profit is : " + list.get(m + 2).getValue());
        for (i = m + 3; i < salesprofit.size(); i++) {
            if (list.get(i).getValue() == list.get(m + 2).getValue()) {
                System.out.println(salesperson.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
                n++;
            }
        }
        System.out.println(salesperson.get(list.get(m + n + 3).getKey()) + " the profit is : " + list.get(m + n + 3).getValue());
        for (i = m + n + 4; i < salesprofit.size(); i++) {
            if (list.get(i).getValue() == list.get(m + n + 3).getValue()) {
                System.out.println(salesperson.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
            }
        }
    }

    public void getThreebestCustomer() {
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        Map<Integer, Customer> customer = DataStore.getInstance().getCustomer();
        Map<Integer, Integer> customerbuy = new HashMap<>();
        //List<Customer> customerList = new ArrayList<>(customer.values());

        for (Order o : order.values()) {
            int customervalue = 0;
            int targetprice = 0;
            if (customerbuy.containsKey(o.getCustomerId())) {
                customervalue = customerbuy.get(o.getCustomerId());
                for (Product p : product.values()) {
                    if (p.getProductId() == o.getItem().getProductId()) {
                        targetprice = p.getTargetPrice();
                    }
                }
            }
            customervalue = customervalue + (o.getItem().getSalesPrice() - targetprice) * o.getItem().getQuantity();
            customerbuy.put(o.getCustomerId(), customervalue);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(customerbuy.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        System.out.println("****************************************************");
        System.out.println("3 best customers who buy about target price: ");

        int i = 0;
        int n = 0;
        int m = 0;
        System.out.println(customer.get(list.get(0).getKey()) + " the profit is : " + list.get(0).getValue());
        for (i = 1; i < customerbuy.size(); i++) {
            if (list.get(i).getValue() == list.get(0).getValue()) {
                System.out.println(customer.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
                m++;
            }
        }
        System.out.println(customer.get(list.get(m + 2).getKey()) + " the profit is : " + list.get(m + 2).getValue());
        for (i = m + 3; i < customerbuy.size(); i++) {
            if (list.get(i).getValue() == list.get(m + 2).getValue()) {
                System.out.println(customer.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
                n++;
            }
        }
        System.out.println(customer.get(list.get(m + n + 3).getKey()) + " the profit is : " + list.get(m + n + 3).getValue());
        for (i = m + n + 4; i < customerbuy.size(); i++) {
            if (list.get(i).getValue() == list.get(m + n + 3).getValue()) {
                System.out.println(customer.get(list.get(i).getKey()) + " the profit is : " + list.get(i).getValue());
            }
        }
    }

    public void getThreebestProducts() {
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        Map<Integer, Integer> bestproduct = new HashMap<>();

        for (Order o : order.values()) {
            int totalquantity = 0;
            if (bestproduct.containsKey(o.getItem().getProductId())) {
                totalquantity = bestproduct.get(o.getItem().getProductId());
            }
            totalquantity = totalquantity + o.getItem().getQuantity();

            bestproduct.put(o.getItem().getProductId(), totalquantity);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(bestproduct.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        System.out.println("****************************************************");
        System.out.println("3 best negotiated products : ");

        int i = 0;
        int n = 0;
        int m = 0;
        System.out.println(product.get(list.get(0).getKey()) + " the quantity of the product sold above the target price is : " + list.get(0).getValue());
        for (i = 1; i < bestproduct.size(); i++) {
            if (list.get(i).getValue() == list.get(0).getValue()) {
                System.out.println(product.get(list.get(i).getKey()) + " the quantity of the product sold above the target price is : " + list.get(i).getValue());
                m++;
            }
        }
        System.out.println(product.get(list.get(m + 2).getKey()) + " the quantity of the product sold above the target price is : " + list.get(m + 2).getValue());
        for (i = m + 3; i < bestproduct.size(); i++) {
            if (list.get(i).getValue() == list.get(m + 2).getValue()) {
                System.out.println(product.get(list.get(i).getKey()) + " the quantity of the product sold above the target price is : " + list.get(i).getValue());
                n++;
            }
        }
        System.out.println(product.get(list.get(m + n + 3).getKey()) + " the quantity of the product sold above the target price is : " + list.get(m + n + 3).getValue());
        for (i = m + n + 4; i < bestproduct.size(); i++) {
            if (list.get(i).getValue() == list.get(m + n + 3).getValue()) {
                System.out.println(product.get(list.get(i).getKey()) + " the quantity of the product sold above the target price is : " + list.get(i).getValue());
            }
        }
    }

    public void getAverageprice() {
                Map<Integer, Order> order = DataStore.getInstance().getOrder();
       Map<Integer, Product> product = DataStore.getInstance().getProduct();
       Map<Integer, Integer> averageprice = new HashMap<>();
       Map<Integer, Integer> totalprice = new HashMap<>();
       Map<Integer, Integer> totalquantity = new HashMap<>();
       
       Map<Integer, Integer> modifiedprice = new HashMap<>();
//        for (Order o : order.values()) {
//            int totalprice = 0;
//            int totalquantity = 0;
//            int averageprice1 = 0;
//            if (averageprice.containsKey(o.getItem().getProductId())) {
//                totalprice = o.getItem().getSalesPrice() * o.getItem().getQuantity();
//                totalquantity = o.getItem().getQuantity();
//                averageprice1 = product.get(o.getItem().getProductId()).getAveragePrice();
//            }
//            totalprice = totalprice + o.getItem().getQuantity() * o.getItem().getSalesPrice();
//            totalquantity = totalquantity + o.getItem().getQuantity();
//            if (totalquantity != 0) {
//                averageprice1 = totalprice / totalquantity;
//            }
//            averageprice.put(o.getItem().getProductId(), averageprice1);
//        }
for (Order o : order.values()) {
            int totalprice1 = 0;
            int totalquantity1 = 0;
            int averageprice1 = 0;
            totalprice1 = o.getItem().getQuantity() * o.getItem().getSalesPrice();
            if (totalprice.containsKey(o.getItem().getProductId())) {
                totalprice1 = totalprice1 + totalprice.get(o.getItem().getProductId());
                totalprice.put(o.getItem().getProductId(), totalprice1);
            } else {
                totalprice.put(o.getItem().getProductId(), totalprice1);
            }

            totalquantity1 = o.getItem().getQuantity();
            if (totalquantity.containsKey(o.getItem().getProductId())) {
                totalquantity1 = totalquantity1 + totalquantity.get(o.getItem().getProductId());
                totalquantity.put(o.getItem().getProductId(), totalquantity1);
            } else {
                totalquantity.put(o.getItem().getProductId(), totalquantity1);
            }
            if (totalquantity.get(o.getItem().getProductId()) != 0) {
                averageprice1 = totalprice.get(o.getItem().getProductId()) / totalquantity.get(o.getItem().getProductId());
                averageprice.put(o.getItem().getProductId(), averageprice1);
            }

        }

        System.out.println("****************************************************");
        System.out.println("Original Data Table:");
        System.out.println("Average sale price higher than the target price:");
        Map<Integer, Integer> differences = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : averageprice.entrySet()) {
            int difference = entry.getValue() - product.get(entry.getKey()).getTargetPrice();
            differences.put(entry.getKey(), difference);
//            System.out.println("product " + entry.getKey() + "      target price is : " + product.get(entry.getKey()).getTargetPrice() + "      average price is : "
//                    + entry.getValue() + "      difference between target price and average price is : " + difference);

        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(differences.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        for (int i = 0; i < differences.size(); i++) {
            if (list.get(i).getValue() > 0 || list.get(i).getValue() == 0) {
                System.out.println("product" + list.get(i).getKey() + "     target price is : " + product.get(list.get(i).getKey()).getTargetPrice()
                        + "     average price is : " + averageprice.get(list.get(i).getKey()) + "      difference of price: " + list.get(i).getValue());
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Average sale price lower than the target price:");
        for (int i = 0; i < differences.size(); i++) {
            if (list.get(i).getValue() < 0) {
                System.out.println("product" + list.get(i).getKey() + "     target price is : " + product.get(list.get(i).getKey()).getTargetPrice()
                        + "     average price is : " + averageprice.get(list.get(i).getKey()) + "      difference of price: " + list.get(i).getValue());
            }
        }

    }

    public void modify() {
        Map<Integer, Order> order = DataStore.getInstance().getOrder();
        Map<Integer, Product> product = DataStore.getInstance().getProduct();
        Map<Integer, Integer> totalprice = new HashMap<>();
        Map<Integer, Integer> totalquantity = new HashMap<>();
        Map<Integer, Integer> averageprice = new HashMap<>();
        Map<Integer, Integer> difference = new HashMap<>();
        Map<Integer, Integer> modifiedprice = new HashMap<>();

        for (Order o : order.values()) {
            int totalprice1 = 0;
            int totalquantity1 = 0;
            int averageprice1 = 0;
            totalprice1 = o.getItem().getQuantity() * o.getItem().getSalesPrice();
            if (totalprice.containsKey(o.getItem().getProductId())) {
                totalprice1 = totalprice1 + totalprice.get(o.getItem().getProductId());
                totalprice.put(o.getItem().getProductId(), totalprice1);
            } else {
                totalprice.put(o.getItem().getProductId(), totalprice1);
            }

            totalquantity1 = o.getItem().getQuantity();
            if (totalquantity.containsKey(o.getItem().getProductId())) {
                totalquantity1 = totalquantity1 + totalquantity.get(o.getItem().getProductId());
                totalquantity.put(o.getItem().getProductId(), totalquantity1);
            } else {
                totalquantity.put(o.getItem().getProductId(), totalquantity1);
            }
            if (totalquantity.get(o.getItem().getProductId()) != 0) {
                averageprice1 = totalprice.get(o.getItem().getProductId()) / totalquantity.get(o.getItem().getProductId());
                averageprice.put(o.getItem().getProductId(), averageprice1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : averageprice.entrySet()) {
//            Random random = new Random();
//            int number = random.nextInt(7)-3;
//            //int mprice = Integer.parseInt(averageprice.get(entry.getKey())*(1+0.01*number));
//            int mprice = (new Double(averageprice.get(entry.getKey())*(1+0.01*number))).intValue();
            int mprice = product.get(entry.getKey()).getTargetPrice();

            if (product.get(entry.getKey()).getTargetPrice() < entry.getValue() * 0.95) {
                mprice = (int) (averageprice.get(entry.getKey()) * 0.95);

            } else if (product.get(entry.getKey()).getTargetPrice() > entry.getValue() * 1.05) {
                mprice = (int) (averageprice.get(entry.getKey()) * 1.05);

            }
            int differences = entry.getValue() - mprice;
            modifiedprice.put(entry.getKey(), mprice);
            difference.put(entry.getKey(), differences);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(difference.entrySet());

        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("****************************************************");
        System.out.println("The average price of each product : ");
        System.out.println("Product No.  |  Average price  |  Modified Price  |  Difference  |  Error");

//        for(int key : averageprice.keySet()){
//            int value = averageprice.get(key);
//            int difference = averageprice.get(key) - product.get(key).getTargetPrice();
//            double modifyPrice = averageprice.get(key)+1;
//            double error = (modifyPrice - averageprice.get(key))/averageprice.get(key);
//            System.out.println(key + "                " + value + "                " + modifyPrice + "                " + difference + "                " + String.format("%.3f", error));
//        }
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i).getKey();
            int value = averageprice.get(key);
            int diff = list.get(i).getValue();
            double modifyPrice = modifiedprice.get(key);
            double error = (modifyPrice - averageprice.get(key)) / averageprice.get(key);
            if (list.get(i).getValue() > 0 || list.get(i).getValue() == 0) {
                System.out.println(key + "                " + value + "                " + modifyPrice + "                " + diff + "       " + String.format("%.3f", error));
            }
        }
        System.out.println("--------------------------------------------------------------------------------------");
        for (int j = 0; j < list.size(); j++) {
            int key = list.get(j).getKey();
            int value = averageprice.get(key);
            int diff = list.get(j).getValue();
            double modifyPrice = modifiedprice.get(key);
            double error = (modifyPrice - averageprice.get(key)) / averageprice.get(key);
            if (list.get(j).getValue() < 0) {
                System.out.println(key + "                " + value + "                " + modifyPrice + "                " + diff + "       " + String.format("%.3f", error));
            }

        }
    }
}

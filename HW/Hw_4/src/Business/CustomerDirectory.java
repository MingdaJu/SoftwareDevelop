/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jumin
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
        this.customerList = new ArrayList<>();
        
        int[] c1= new int[]{0,2};
        Customer customer1 = new Customer("Tom", "HU481", c1);
        int[] c2= new int[]{1,8};
        Customer customer2 = new Customer("Sam", "AA384", c2);
        int[] c3= new int[]{2,4};
        Customer customer3 = new Customer("Jack", "UA121", c3);
        
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
     public Customer addCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
     
        public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
    }

}

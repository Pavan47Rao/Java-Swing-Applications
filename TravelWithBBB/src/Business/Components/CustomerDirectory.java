/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Components;

import Business.Users.Customer;
import Business.Users.TravelAgent;
import java.util.ArrayList;

/**
 *
 * @author Floyed Pinto
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList = new ArrayList<>();

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }
    
}

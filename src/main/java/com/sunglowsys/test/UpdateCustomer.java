package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Tejveer");
        new CustomerServiceImpl().save(customer);
        System.out.println(customer);
    }
}

package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;
import com.sunglowsys.service.OrderServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SaveCustomer {

    public static void main(String[] args) {

        Customer customer = new Customer("Hirdesh","Kumar","hk@gmail.com","975987550");
        Customer customer1 = new CustomerServiceImpl().save(customer);

        Customer customer2 = new Customer("Gulshan", "Kumar",  "gk@gmail.com","9038858573");
        Customer customer3 = new CustomerServiceImpl().save(customer2);

        Order order1 = new Order("mobile","vivo","online");
        Order order2 = new Order("leptop","thinkPad","online");

        Order order3 = new Order("beg", "big","online");
        Order order4 = new Order("Comics", "cartoon", "online");

        order1.setCustomer(customer);
        order2.setCustomer(customer);
        order3.setCustomer(customer);
        order4.setCustomer(customer);

        List<Order> orders = new ArrayList<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        new OrderServiceImpl().save(order1);
        new OrderServiceImpl().save(order2);
        new OrderServiceImpl().save(order3);
        new OrderServiceImpl().save(order4);
    }
}

package com.sunglowsys.test;

import com.sunglowsys.domain.Order;
import com.sunglowsys.service.OrderServiceImpl;

import java.util.List;

public class AllFindOrder {
    public static void main(String[] args) {
        List<Order> orderList = new OrderServiceImpl().findAll();
        for(Order order : orderList){
            System.out.println(order);
        }
    }
}

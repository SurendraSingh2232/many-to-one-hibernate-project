package com.sunglowsys.test;

import com.sunglowsys.service.CustomerServiceImpl;

public class FindById {
    public static void main(String[] args) {
        System.out.println(new CustomerServiceImpl().findById(1L));
    }
}

package com.sunglowsys.service;

import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private static OrderRepository orderRepository = new OrderRepositoryImpl();
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order, Long id) {
        return orderRepository.update(order,id);
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = new OrderRepositoryImpl().findAll();
        return orders;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order deleteById(Long id) {
        return orderRepository.deleteById(id);
    }
}

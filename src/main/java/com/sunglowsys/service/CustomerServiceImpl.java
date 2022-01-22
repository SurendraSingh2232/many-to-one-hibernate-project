package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private static CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer, Long id) {
        return customerRepository.update(customer,id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new CustomerRepositoryImpl().findAll();
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer deleteById(Long id) {
        return customerRepository.deleteById(id);
    }
}

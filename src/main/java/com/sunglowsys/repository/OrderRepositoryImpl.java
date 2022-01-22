package com.sunglowsys.repository;

import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Order save(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(order);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public Order update(Order order, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order1 = session.get(Order.class,id);
        order1.setOrderName(order1.getOrderName());
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public List<Order> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Order");
        List<Order> orders = query.list();
        session.getTransaction().commit();
        session.close();
        return orders;
    }

    @Override
    public Order findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class,id);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public Order deleteById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class,id);
        session.getTransaction().commit();
        session.close();
        return order;
    }
}

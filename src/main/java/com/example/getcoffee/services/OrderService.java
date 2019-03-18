package com.example.getcoffee.services;

import com.example.getcoffee.domain.StarbucksOrder;
import com.example.getcoffee.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<StarbucksOrder> getAllOrders() {
        List<StarbucksOrder> orders = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }

    @Override
    public StarbucksOrder getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void addOrder(StarbucksOrder order) {
        orderRepository.save(order);
    }
}

package com.example.getcoffee.services;

import com.example.getcoffee.domain.StarbucksOrder;

import java.util.List;

public interface IOrderService {

    List<StarbucksOrder> getAllOrders();

    StarbucksOrder getOrderById(Long id);

    void addOrder(StarbucksOrder order);
}

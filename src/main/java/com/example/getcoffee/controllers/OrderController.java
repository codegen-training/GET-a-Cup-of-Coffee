package com.example.getcoffee.controllers;

import com.example.getcoffee.domain.StarbucksOrder;
import com.example.getcoffee.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    void postOrder(@RequestBody StarbucksOrder order) {
        orderService.addOrder(order);
    }

    @GetMapping("/order/all")
    List<StarbucksOrder> getOrders() {
        return orderService.getAllOrders();
    }
}

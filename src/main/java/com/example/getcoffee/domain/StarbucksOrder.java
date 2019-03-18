package com.example.getcoffee.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StarbucksOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Coffee coffee;

    public StarbucksOrder() {
    }

    public StarbucksOrder(Customer customer, Coffee coffee) {
        this.customer = customer;
        this.coffee = coffee;
    }
}

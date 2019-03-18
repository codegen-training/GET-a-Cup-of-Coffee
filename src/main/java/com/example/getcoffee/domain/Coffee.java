package com.example.getcoffee.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;
    private Double price;

    public Coffee() {
    }

    public Coffee(String category, Double price) {
        this.category = category;
        this.price = price;
    }
}

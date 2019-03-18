package com.example.getcoffee.repositories;

import com.example.getcoffee.domain.StarbucksOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<StarbucksOrder, Long> {
}

package com.example.getcoffee.repositories;

import com.example.getcoffee.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}

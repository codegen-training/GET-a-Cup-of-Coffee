package com.example.getcoffee.repositories;

import com.example.getcoffee.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

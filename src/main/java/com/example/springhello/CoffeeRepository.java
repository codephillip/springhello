package com.example.springhello;

import org.springframework.data.repository.CrudRepository;


public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}

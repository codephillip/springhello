package com.example.springhello.initial;

import org.springframework.data.repository.CrudRepository;


public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}

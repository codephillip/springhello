package com.example.springhello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/coffees")
@RestController
public class CoffeeController {
    private final CoffeeRepository repository;

    public CoffeeController(CoffeeRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    Iterable<Coffee> getCoffees() {
        return repository.findAll();
    }

    @PostMapping
    Coffee postCoffee(@RequestBody Coffee coffee) {
        repository.save(coffee);
        return coffee;
    }

    @PutMapping("/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
        return repository.existsById(id) ? new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED) :
                new ResponseEntity<>(repository.save(coffee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteCoffee(@PathVariable String id) {
        repository.deleteById(id);
    }
}

package com.example.springhello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/coffees")
@RestController
public class CoffeeController {
    private final List<Coffee> coffees = new ArrayList<>();

    public CoffeeController() {
        coffees.addAll(List.of(
                new Coffee("Africano"),
                new Coffee("Americano"),
                new Coffee("123124234aqwe", "Indiano")
        ));
    }


    @GetMapping
    Iterable<Coffee> getCoffees() {
        return coffees;
    }

    @PostMapping
    Coffee postCoffee(@RequestBody Coffee coffee) {
        coffees.add(coffee);
        return coffee;
    }

    @PutMapping("/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
        int index = -1;
        for (Coffee c : coffees) {
            if (c.getId().equals(id)) {
                index = coffees.indexOf(c);
                coffees.set(index, coffee);
            }
        }
        return index == -1 ? new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED) :
                new ResponseEntity<>(coffee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteCoffee(@PathVariable String id) {
        coffees.removeIf(coffee -> coffee.getId().equals(id));
    }
}

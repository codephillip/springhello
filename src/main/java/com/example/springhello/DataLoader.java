package com.example.springhello;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {
    private final CoffeeRepository repository;

    public DataLoader(CoffeeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void loadData() {
        repository.saveAll(List.of(
                new Coffee("Africano"),
                new Coffee("Americano"),
                new Coffee("123124234aqwe", "Indiano")
        ));
    }
}


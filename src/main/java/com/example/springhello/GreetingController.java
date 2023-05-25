package com.example.springhello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final static String message = "hello %s";
    private final AtomicLong counter = new AtomicLong();
    @Value("${greeting-name: Tester}")
    private String name;
    @Value("${greeting-coffee: ${greeting-name}, return later}")
    private String coffee;

//    @GetMapping
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "hello") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(message, name));
//    }

    @GetMapping
    String getGreeting() {
        return name;
    }

    @GetMapping("/coffee")
    String getNameAndCoffee() {
        return coffee;
    }
}

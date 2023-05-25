package com.example.springhello.initial;

import com.example.springhello.initial.variables.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    //    @GetMapping
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "hello") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(message, name));
//    }

    @GetMapping
    String getGreeting() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    String getNameAndCoffee() {
        return greeting.getCoffee();
    }
}

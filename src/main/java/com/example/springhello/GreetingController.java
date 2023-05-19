//package com.example.springhello;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.atomic.AtomicLong;
//
//@RestController
//public class GreetingController {
//    private final static String message = "hello %s";
//    private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "hello") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(message, name));
//    }
//}

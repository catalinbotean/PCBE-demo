package com.example.PCBE.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

//    @Autowired
    private Counter counter;

    public CounterController(Counter counter) {
        this.counter = counter;
    }

    @GetMapping("/increment")
    public String incrementCounter(){
        int currentCount = counter.getCount();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        int newCount = counter.increment();
        return "Current count: " + currentCount + ", New count: " + newCount;
    }
}

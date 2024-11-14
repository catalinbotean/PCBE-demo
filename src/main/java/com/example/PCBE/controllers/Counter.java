package com.example.PCBE.controllers;

public class Counter {
    private int count = 0;

    public int increment() {
        return ++count;
    }

    public int getCount() {
        return count;
    }
}

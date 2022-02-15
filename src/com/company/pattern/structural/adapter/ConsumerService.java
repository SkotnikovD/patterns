package com.company.pattern.structural.adapter;

public class ConsumerService {

    void consumeObject(Interface object) {
        System.out.println(object.getData());
    }
}

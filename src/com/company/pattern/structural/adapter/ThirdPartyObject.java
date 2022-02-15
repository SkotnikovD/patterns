package com.company.pattern.structural.adapter;

public class ThirdPartyObject {
    private final int data;

    public ThirdPartyObject(int data) {
        this.data = data;
    }

    int getNumberData() {
        return data;
    }
}

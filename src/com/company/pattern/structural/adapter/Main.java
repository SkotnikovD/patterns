package com.company.pattern.structural.adapter;

public class Main {

    public static void main(String[] args) {
        var thirdPartyObject = new ThirdPartyObject(10);
        ConsumerService consumerService = new ConsumerService();

        consumerService.consumeObject(new Adapter(thirdPartyObject));

    }
}

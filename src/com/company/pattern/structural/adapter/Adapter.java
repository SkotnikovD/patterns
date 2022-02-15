package com.company.pattern.structural.adapter;

public class Adapter implements Interface {

    private ThirdPartyObject thirdPartyObject;

    public Adapter(ThirdPartyObject thirdPartyObject) {
        this.thirdPartyObject = thirdPartyObject;
    }

    @Override
    public String getData() {
        return String.valueOf(thirdPartyObject.getNumberData());
    }
}

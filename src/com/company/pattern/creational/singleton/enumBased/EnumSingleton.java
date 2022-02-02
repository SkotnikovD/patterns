package com.company.pattern.creational.singleton.enumBased;

public enum EnumSingleton {

    INSTANCE("Initial value");

    private String someData;

    private EnumSingleton(String someData) {
        this.someData = someData;
    }

    public void businessMethod1(){
        System.out.println("Do important stuff");
    }

}

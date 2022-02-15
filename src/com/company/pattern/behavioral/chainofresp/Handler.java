package com.company.pattern.behavioral.chainofresp;

import java.util.Map;

public abstract class Handler {

    private int priority;
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Map<String, String> headers) {
        if(nextHandler==null){
            return;
        }
        nextHandler.handle(headers);
    }

    public Handler(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}

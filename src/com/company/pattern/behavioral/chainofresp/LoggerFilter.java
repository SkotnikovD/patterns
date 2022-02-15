package com.company.pattern.behavioral.chainofresp;

import java.util.Map;

public class LoggerFilter extends Handler {

    public LoggerFilter(int priority) {
        super(priority);
    }

    @Override
    public void handle(Map<String, String> headers) {
        System.out.println("LoggerFilter");
        System.out.println("Number of headers:" + headers.size());
        super.handle(headers);
    }
}

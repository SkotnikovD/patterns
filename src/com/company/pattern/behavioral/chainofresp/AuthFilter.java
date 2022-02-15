package com.company.pattern.behavioral.chainofresp;

import java.util.Map;

public class AuthFilter extends Handler {

    public AuthFilter(int priority) {
        super(priority);
    }

    @Override
    public void handle(Map<String, String> headers) {
        System.out.println("AuthFilter");
        if (headers.get("Secret").equals("Pass123")) {
            System.out.println("Success authentication");
            super.handle(headers);
        } else {
            System.out.println("Authentication failed");
        }
    }
}

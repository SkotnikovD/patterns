package com.company.pattern.behavioral.chainofresp;

import com.company.pattern.behavioral.chainofresp.builder.FilterChainBuilder;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("Secret", "Pass123");

        AuthFilter authFilter1 = new AuthFilter(1000);
        LoggerFilter loggerFilter1 = new LoggerFilter(100);

        FilterChainBuilder filterChainBuilder1 = new FilterChainBuilder();
        Handler handler1 = filterChainBuilder1.addFilter(authFilter1).addFilter(loggerFilter1).buildFilterChain();
        handler1.handle(headersMap);

        System.out.println("\n------------------------------\n");

        AuthFilter authFilter2 = new AuthFilter(100);
        LoggerFilter loggerFilter2 = new LoggerFilter(1000);

        FilterChainBuilder filterChainBuilder2 = new FilterChainBuilder();
        Handler handler2 = filterChainBuilder2.addFilter(authFilter2).addFilter(loggerFilter2).buildFilterChain();
        handler2.handle(headersMap);

    }

}

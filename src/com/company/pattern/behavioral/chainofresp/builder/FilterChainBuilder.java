package com.company.pattern.behavioral.chainofresp.builder;

import com.company.pattern.behavioral.chainofresp.Handler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilterChainBuilder {

    private List<Handler> handlers = new ArrayList<>();

    public FilterChainBuilder addFilter(Handler handler) {
        handlers.add(handler);
        return this;
    }

    public Handler buildFilterChain() {
        handlers.sort(Comparator.comparingInt(Handler::getPriority));
        Handler res = null;

        for (Handler h : handlers) {
            if (res != null) {
                h.setNextHandler(res);
            }
            res = h;
        }

        return res;
    }

}

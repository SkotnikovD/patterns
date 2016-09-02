package com.company.blockingQueue;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.08.2016 14:42
 *********************************/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.08.2016.
 */
public class Main {
    public static void main(String[] args){
        ExecutorService es = Executors.newFixedThreadPool(20);
        BlockingQueue<Integer> integerBlockingQueue = new BlockingQueue<>();
        for (int i = 0; i < 5; i++) {
            es.submit(new IntegerProducer(integerBlockingQueue, i*1000, (i+1)*1000));
            es.submit(new Consumer<Integer>(integerBlockingQueue));
        }
    }

}

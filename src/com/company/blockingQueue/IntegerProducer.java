package com.company.blockingQueue;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.08.2016 14:26
 *********************************/

import java.util.stream.IntStream;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.08.2016.
 */
public class IntegerProducer implements Runnable {

    private BlockingQueue<Integer> bc;
    private int lowerBound;
    private int upperBound;

    public IntegerProducer(BlockingQueue<Integer> bc, int lowerBound, int upperBound) {
        this.bc = bc;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public void run() {
        IntStream.range(lowerBound, upperBound).forEach(e->{
            bc.put(e);
            System.out.println("Producer produced val = " + e);
        });
    }
}

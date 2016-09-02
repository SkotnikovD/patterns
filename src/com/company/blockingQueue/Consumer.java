package com.company.blockingQueue;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.08.2016 14:26
 *********************************/

import static java.lang.Thread.sleep;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.08.2016.
 */
public class Consumer<T> implements Runnable{
    private BlockingQueue<T> bc;

    public Consumer(BlockingQueue<T> bc) {
        this.bc = bc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            T val = bc.get();
            System.out.println("Consumer consume val = " + val.toString());
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

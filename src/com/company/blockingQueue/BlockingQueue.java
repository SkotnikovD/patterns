package com.company.blockingQueue;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.08.2016 14:26
 *********************************/

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.08.2016.
 */
public class BlockingQueue<T> {
    private Queue<T> queue = new LinkedList<T>();

    private int MAX_SIZE = 10;

    public synchronized void put(T val){
        while(queue.size()==MAX_SIZE){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        queue.add(val);
        notifyAll();
    }

    public synchronized T get(){
        while(queue.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        }
        T poll = queue.poll();
        notifyAll();
        return poll;
    }
}

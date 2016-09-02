package com.company.pattern.behavioral.strategy;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.07.2016 20:08
 *********************************/

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.07.2016.
 */
public class Tester {
    public static void main(String[] args) {
        AC ac = new AC();
        ac.switchToMode(ACMode.H);
        ac.switchToMode(ACMode.C);
        ac.switchToMode(ACMode.H);
    }
}

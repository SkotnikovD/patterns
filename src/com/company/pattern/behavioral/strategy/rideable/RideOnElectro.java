package com.company.pattern.behavioral.strategy.rideable;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2015 NVision Group, Inc. All rights reserved.
 *
 * 18.09.2015 17:17
 *********************************/

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 18.09.2015.
 */
public class RideOnElectro implements Rideable {
    @Override
    public void ride() {
        System.out.println("I'm riding on electro");
    }
}

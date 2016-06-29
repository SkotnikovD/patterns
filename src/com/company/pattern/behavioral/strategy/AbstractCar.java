package com.company.pattern.behavioral.strategy;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2015 NVision Group, Inc. All rights reserved.
 *
 * 18.09.2015 17:34
 *********************************/

import com.company.pattern.behavioral.strategy.rideable.Rideable;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 18.09.2015.
 */
public class AbstractCar implements Rideable{
    Rideable rideable;

    public AbstractCar(Rideable rideable) {
        this.rideable = rideable;
    }

    public void setRideable(Rideable rideable) {
        this.rideable = rideable;
    }

    @Override
    public void ride() {
        rideable.ride();
    }
}

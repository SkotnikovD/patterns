package com.company.pattern.behavioral.strategy;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2015 NVision Group, Inc. All rights reserved.
 *
 * 18.09.2015 17:37
 *********************************/

import com.company.pattern.behavioral.strategy.rideable.Rideable;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 18.09.2015.
 */
public class FordMustangCar extends AbstractCar{
    public FordMustangCar(Rideable rideable) {
        super(rideable);
    }
}

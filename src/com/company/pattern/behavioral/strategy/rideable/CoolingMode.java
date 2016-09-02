package com.company.pattern.behavioral.strategy.rideable;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 19.07.2016 19:28
 *********************************/

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 19.07.2016.
 */
public class CoolingMode implements ACAction {
    @Override
    public void doAction() {
        System.out.println("Cooling");
    }
}

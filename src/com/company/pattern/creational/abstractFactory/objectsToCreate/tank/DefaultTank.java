package com.company.pattern.creational.abstractFactory.objectsToCreate.tank;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:08
 *********************************/

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public class DefaultTank extends Tank {
    public void attack(){
        System.out.println("DefaultTank attacking!");
    }
}

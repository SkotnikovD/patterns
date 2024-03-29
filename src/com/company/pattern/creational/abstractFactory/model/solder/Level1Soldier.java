package com.company.pattern.creational.abstractFactory.model.solder;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:08
 *********************************/

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) doAction 08.06.2016.
 */
public class Level1Soldier implements Soldier {
    public void attack(){
        System.out.println("Level1Solder attacking!");
    }
}

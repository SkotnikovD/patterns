package com.company.pattern.creational.abstractFactory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:34
 *********************************/

import com.company.pattern.creational.abstractFactory.objectsToCreate.solder.DefaultSoldier;
import com.company.pattern.creational.abstractFactory.objectsToCreate.solder.Soldier;
import com.company.pattern.creational.abstractFactory.objectsToCreate.tank.DefaultTank;
import com.company.pattern.creational.abstractFactory.objectsToCreate.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public class DefaultFactory implements IUnitsFactory {
    @Override
    public Soldier createSolder() {
        return new DefaultSoldier();
    }

    @Override
    public Tank createTank() {
        return new DefaultTank();
    }
}

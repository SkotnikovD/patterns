package com.company.pattern.creational.abstractFactory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:34
 *********************************/

import com.company.pattern.creational.abstractFactory.objectsToCreate.solder.Level1Soldier;
import com.company.pattern.creational.abstractFactory.objectsToCreate.solder.Soldier;
import com.company.pattern.creational.abstractFactory.objectsToCreate.tank.Level1Tank;
import com.company.pattern.creational.abstractFactory.objectsToCreate.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public class Level1PlayerFactory implements IUnitsFactory {
    @Override
    public Soldier createSolder() {
        return new Level1Soldier();
    }

    @Override
    public Tank createTank() {
        return new Level1Tank();
    }
}

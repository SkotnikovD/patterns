package com.company.pattern.creational.abstractFactory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:07
 *********************************/

import com.company.pattern.creational.abstractFactory.objectsToCreate.solder.Soldier;
import com.company.pattern.creational.abstractFactory.objectsToCreate.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public interface IUnitsFactory {
    Soldier createSolder();
    Tank createTank();
}

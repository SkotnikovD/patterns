package com.company.pattern.creational.abstractFactory.factory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:07
 *********************************/

import com.company.pattern.creational.abstractFactory.Player;
import com.company.pattern.creational.abstractFactory.model.solder.Soldier;
import com.company.pattern.creational.abstractFactory.model.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) doAction 08.06.2016.
 */
public interface IUnitsFactory {
    Soldier createSolder(Player player);
    Tank createTank(Player player);
}

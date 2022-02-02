package com.company.pattern.creational.abstractFactory.factory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:34
 *********************************/

import com.company.pattern.creational.abstractFactory.Player;
import com.company.pattern.creational.abstractFactory.model.solder.DefaultSoldier;
import com.company.pattern.creational.abstractFactory.model.solder.Soldier;
import com.company.pattern.creational.abstractFactory.model.tank.DefaultTank;
import com.company.pattern.creational.abstractFactory.model.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) doAction 08.06.2016.
 */
public class DefaultFactory implements IUnitsFactory {
    @Override
    public Soldier createSolder(Player player) {
        player.deductMoney(100); //basically it's not ideal as breaks Single Responsibility concept. Here it's just an example
        return new DefaultSoldier();
    }

    @Override
    public Tank createTank(Player player) {
        player.deductMoney(300);
        return new DefaultTank();
    }
}

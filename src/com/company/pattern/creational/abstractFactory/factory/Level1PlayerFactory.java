package com.company.pattern.creational.abstractFactory.factory;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:34
 *********************************/

import com.company.pattern.creational.abstractFactory.Player;
import com.company.pattern.creational.abstractFactory.model.solder.Level1Soldier;
import com.company.pattern.creational.abstractFactory.model.solder.Soldier;
import com.company.pattern.creational.abstractFactory.model.tank.Level1Tank;
import com.company.pattern.creational.abstractFactory.model.tank.Tank;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) doAction 08.06.2016.
 */
public class Level1PlayerFactory implements IUnitsFactory {
    @Override
    public Soldier createSolder(Player player) {
        player.deductMoney(200);
        return new Level1Soldier();
    }

    @Override
    public Tank createTank(Player player) {
        player.deductMoney(600);
        return new Level1Tank();
    }
}

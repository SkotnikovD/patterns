package com.company.pattern.creational.abstractFactory.tester;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:19
 *********************************/

import com.company.pattern.creational.abstractFactory.DefaultFactory;
import com.company.pattern.creational.abstractFactory.IUnitsFactory;
import com.company.pattern.creational.abstractFactory.Level1PlayerFactory;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        Player player = new Player();
        IUnitsFactory unitsFactory;

        System.out.println("Player has no level. Only default units available");
        unitsFactory = new DefaultFactory();
        player.addUnitToArmy(unitsFactory.createSolder());
        player.addUnitToArmy(unitsFactory.createTank());

        player.attack();

        System.out.println("Well done! You achieve level 1!");
        unitsFactory = new Level1PlayerFactory();
        player.addUnitToArmy(unitsFactory.createSolder());
        player.addUnitToArmy(unitsFactory.createTank());

        player.attack();

        System.out.println("You can notice, that to player with new level we added more powerful units");
    }
}

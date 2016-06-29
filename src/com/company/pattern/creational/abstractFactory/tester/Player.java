package com.company.pattern.creational.abstractFactory.tester;
/*********************************
 * PROPRIETARY/CONFIDENTIAL.  Use of this product is subject to license terms.
 * Copyright (c) 2016 NVision Group, Inc. All rights reserved.
 *
 * 08.06.2016 19:26
 *********************************/

import com.company.pattern.creational.abstractFactory.objectsToCreate.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Skotnikov (DSkotnikov@nvision-group.com) on 08.06.2016.
 */
public class Player {
    List<Unit> army = new ArrayList<>();

    void addUnitToArmy(Unit unit){
        army.add(unit);
    }

    void attack(){
        army.stream().forEach(Unit::attack);
    }
}

package com.company.pattern.creational.abstractFactory.factory;

import com.company.pattern.creational.abstractFactory.Player;


public class UnitFactoryFactory {

    public IUnitsFactory createUnitFactory(int playerLevel) {
        switch (playerLevel) {
            case 0:
                return new DefaultFactory();
            case 1:
                return new Level1PlayerFactory();
            default:
                throw new IllegalArgumentException("Unsupported level");
        }
    }
}

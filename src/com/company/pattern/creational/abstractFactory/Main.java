package com.company.pattern.creational.abstractFactory;

import com.company.pattern.creational.abstractFactory.factory.DefaultFactory;
import com.company.pattern.creational.abstractFactory.factory.IUnitsFactory;
import com.company.pattern.creational.abstractFactory.factory.Level1PlayerFactory;
import com.company.pattern.creational.abstractFactory.factory.UnitFactoryFactory;

public class Main {

    public static UnitFactoryFactory unitFactoryFactory = new UnitFactoryFactory();

    public static void main(String[] args) {

        Player player = new Player(0, 1000); //in real life we'll fetch player from db

        System.out.println("Player has 0 level. Only default units available");
        IUnitsFactory unitFactory = unitFactoryFactory.createUnitFactory(player.getLevel());

        player.addUnitToArmy(unitFactory.createSolder(player));
        player.addUnitToArmy(unitFactory.createTank(player));
        System.out.println("Player's budget: " + player.getMoney());

        player.attack();
        player.promoteToNextLevel();

        unitFactory = unitFactoryFactory.createUnitFactory(player.getLevel());
        player.addUnitToArmy(unitFactory.createSolder(player));
        player.addUnitToArmy(unitFactory.createTank(player));
        System.out.println("Player's budget: " + player.getMoney());


        player.attack();

        System.out.println("You can notice, that to player with new level we added more powerful units");
    }
}

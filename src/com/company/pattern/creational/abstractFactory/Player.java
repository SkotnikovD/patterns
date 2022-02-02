package com.company.pattern.creational.abstractFactory;

import com.company.pattern.creational.abstractFactory.model.Unit;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int level;
    private int money;

    public Player(int level, int money) {
        this.level = level;
        this.money = money;
    }

    public int getLevel() {
        return level;
    }

    public int promoteToNextLevel() {
        System.out.println("Well done! You achieve level 1!");
        return ++level;
    }

    List<Unit> army = new ArrayList<>();

    void addUnitToArmy(Unit unit) {
        army.add(unit);
    }

    void attack() {
        army.stream().forEach(Unit::attack);
    }

    public void deductMoney(int amount) {
        this.money = this.money - amount;
    }

    public int getMoney() {
        return money;
    }
}

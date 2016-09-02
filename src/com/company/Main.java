package com.company;

import com.company.pattern.behavioral.strategy.AC;
import com.company.pattern.behavioral.strategy.ACMode;

public class Main {

    public static void main(String[] args) {
        AC ac = new AC();
        ac.switchToMode(ACMode.H);
        ac.switchToMode(ACMode.C);
        ac.switchToMode(ACMode.H);
}
}

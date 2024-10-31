package subclass;

import enums.*;
import interfaces.*;
import superclass.*;

public class Monster extends Creature{
    private int hitPoints;
    private Species monsterType;

    public Monster(int hitPoints, Species monsterType) {
        this.hitPoints = hitPoints;
        this.monsterType = monsterType;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "hitPoints=" + hitPoints +
                ", monsterType=" + monsterType +
                '}';
    }
}

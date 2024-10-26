package subclass;

import enums.*;
import interfaces.*;
import superclass.*;

public class Monster extends Creature {
    private int hitPoints;
    private Species monsterType;

    public Monster(int hitPoints, String monsterType) {
        this.hitPoints = 4;
        this.monsterType = Species.valueOf(monsterType);
    }


}

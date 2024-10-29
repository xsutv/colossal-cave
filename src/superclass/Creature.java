package superclass;

import interfaces.Interactive;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Creature {
    private int hitPoints;

    public void attack(Creature target){
        int damage = ThreadLocalRandom.current().nextInt(10) + 1;
        target.hitPoints -= damage;
    }

    public void attack(Interactive target){
        int damage = ThreadLocalRandom.current().nextInt(10) + 1;
        System.out.println("unimplemented method, but the damage would have been " + damage);
    }
}

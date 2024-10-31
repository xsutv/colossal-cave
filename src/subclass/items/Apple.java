package subclass.items;

import interfaces.*;
import superclass.*;

public class Apple implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("This red apple looks delicious.");
        player.heal(1);
    }

    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public String getID() {
        return "apple-ID-ertyuik1m234";
    }

    @Override
    public String toString() {
        return "Apple";
    }

    
    // This item should heal a player when interacted with.
}

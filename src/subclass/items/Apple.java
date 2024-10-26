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



    // This item should heal a player when interacted with.
}

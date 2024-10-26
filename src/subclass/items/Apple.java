package subclass.items;

import interfaces.*;
import superclass.*;

public class Apple implements Interactive {

    @Override
    public void interact(Player player) {

    }

    @Override
    public String getName() {

    }

    @Override
    public String getID() {
        return "apple-ID-ertyuik1m234";
    }

    // This item should heal a player when interacted with.
}

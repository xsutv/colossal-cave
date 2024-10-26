package subclass.items;

import java.util.*;

import interfaces.*;
import superclass.*;

public class Chest implements Interactive {
    private List<Interactive> chest = new ArrayList<>();

    public void addItem(Chest item) {
        chest.add(item);
    }

    @Override
    public void interact(Player player) {
        System.out.print("You found a chest :");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getID() {
        return "chest-ID-ertyuik1m234";
    }
}

// Add methods that gives multiple choice looting options. ( Dynamic method in
// Loot class).
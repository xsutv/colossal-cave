package subclass.items;

import java.util.*;

import interfaces.*;
import superclass.*;

public class Chest implements Interactive {
    private List<Chest> chest = new ArrayList<>();

    public void addItem(Chest item) {
        chest.add(item);
    }

    @Override
    public void interact(Player player) {

    }

    @Override
    public String getName() {
        return "";
    }
}

// Add methods that gives multiple choice looting options. ( Dynamic method in
// Loot class).
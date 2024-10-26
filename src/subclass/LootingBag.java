package subclass;

import java.util.*;

import interfaces.*;
import subclass.items.*;

public class LootingBag {
    private List<Interactive> lootingBag = new ArrayList<>(List.of(new Coins(21)));

    public List<Interactive> getLoot() {
        return lootingBag;
    }

    public LootingBag() {

    }

    public void addItem(Interactive item) {
        lootingBag.add(item);
    }

    public void removeItem(String id) {
        for (int i = 0; i < lootingBag.size(); i++) {
            if (lootingBag.get(i).getID() == id) {
                lootingBag.remove(lootingBag.get(i));
            }
        }
    }

    // Add a method where we have a list with several lists inside for different
    // categories, weapons, resources, money etc. Add issue.
}

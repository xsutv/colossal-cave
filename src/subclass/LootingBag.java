package subclass;

import java.util.*;

import interfaces.*;
import subclass.items.*;

public class LootingBag {

    private List<Interactive> lootingBag = new ArrayList<>();

    // Default constructor.
    public LootingBag() {}

    public String getLoot() {
        return lootingBag.toString();
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

    @Override
    public String toString() {
        return "LootingBag [lootingBag=" + lootingBag + "]";
    }

    
    // Add a method where we have a list with several lists inside for different
    // categories, weapons, resources, money etc. Add issue.
}

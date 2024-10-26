package subclass.items;

import java.util.*;

import interfaces.*;

public class Chest implements Interactive {
    private List<Chest> chest = new ArrayList<>();

    public void addItem(Chest item) {
        chest.add(item);
    }

    @Override
    public void interact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interact'");
    }

}

// Add methods that gives multiple choice looting options. ( Dynamic method in
// Loot class).
import java.util.*;

import interfaces.*;
import subclass.*;

public class GameApp {

    public static void main(String[] args) {

        CaveGame game = new CaveGame();

        game.createPlayer();

        // TEST
        LootingBag loot = new LootingBag();
        List<Interactive> looty = loot.getLoot();
        for (Interactive l : looty) {
            System.out.print("loot before: " + l);
        }

        loot.removeItem("coin-ID-ertyuik1m234");

        for (Interactive l : looty) {
            System.out.print("loot after: " + l);
        }
    }

}

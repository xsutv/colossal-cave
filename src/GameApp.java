import java.util.*;

import enums.*;
import interfaces.*;
import subclass.*;
import subclass.items.*;
import superclass.Player;

public class GameApp {

    public static void main(String[] args) {

        // Interactive creation of Player for a game.. should add try-catch handling
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Choose a name for your character: ");
            String name = input.nextLine();

            System.out.print("Choose race of your character: ");

            for (int i = 0; i < Race.values().length; i++) {
                if (i == Race.values().length - 1) {
                    System.out.print(Race.values()[i] + ": ");
                } else {
                    System.out.print(Race.values()[i] + ", ");
                }
            }
            String playerRace = input.nextLine().toUpperCase().trim();

            Player p = new Player(name, playerRace);

            // Testing starts here::

            System.out.println(p);

            Apple apple = new Apple();

            apple.interact(p);

            // loot tests:
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
}
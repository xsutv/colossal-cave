package clazz;

import java.util.*;

import enumz.*;

public class CaveGame {

    private Player player;

    public CaveGame() {
        
    }

    public Player createPlayer() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Choose a name for your character");
            String name = input.nextLine();

            System.out.println("Choose race of your character");

            Race[] races = Race.values();
            for (Race r : races) {
                System.out.printf("" + r + "%n");
            }
            String playerRace = input.nextLine().toUpperCase();

            Player p = new Player(name, playerRace);

            System.out.println(p);

            return p;
        }
    }

}
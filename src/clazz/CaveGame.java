package clazz;

import java.util.*;

import enumz.*;

public class CaveGame {
    private Player player;

    public CaveGame(Player player) {
        this.player = player;
    }

    public void createPlayer() {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.println("Choose race: ");

            // Race[] races = Race.values();
            // for (Race race : races) {
            // System.out.println(race);
            // }

            for (int i = 0; i < Race.values().length; i++) {
                if (i == Race.values().length - 1) {
                    System.out.print(Race.values()[i] + ": ");
                } else {
                    System.out.print(Race.values()[i] + ", ");
                }
            }
            // // Player player = new Player(name, race);
        }
    }

    public void createPlayer2() {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.println("Choose race: ");
            // String choice =
        }
    }
}
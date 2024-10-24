import clazz.*;
import enumz.*;

public class CaveGame {

    @Deprecated
    public static void main(String[] args) {
        System.out.println("Welcome to Cavern Explorer!");
        System.out.println("jumping to method createPlayer()...");
        System.out.println();

        Player player = new Player("Chiko", Race.DWARF);
    }

    public static void createPlayer() {
        System.out.println("Oops, no code here!");
        System.out.println("Exiting...");
        System.exit(0);
    }
}

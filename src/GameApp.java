import clazz.*;
import clazz.Player;
import enumz.*;

public class GameApp {

    @Deprecated
    public static void main(String[] args) {

        Player player = new Player("Chiko", Race.DWARF);

        CaveGame game = new CaveGame(player);

        game.createPlayer();

    }
}

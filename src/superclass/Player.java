package superclass;

import enums.*;

public class Player {

    private String name;
    private int hitPoints;
    private Race race;

    public Player(String name, String playerRace) {
        this.name = name;
        this.hitPoints = 10;
        this.race = Race.valueOf(playerRace);
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", hitPoints=" + hitPoints + ", race=" + race + "]";
    }

    
    
}

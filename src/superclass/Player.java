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

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void damage(int dmg) {
        this.hitPoints-=dmg;
        System.out.println("You took " + dmg + " damage.");
        System.out.println("Health left: " + this.hitPoints);
        if (this.hitPoints < 0) {
            System.out.println("You died u fkn nub");
        } 
    }

    public void heal(int heal) {
        if (this.hitPoints > 1 && this.hitPoints < 10) {
            this.hitPoints+=heal;
            System.out.println("You recieved " + heal + " hitpoints." );
            System.out.println("Health left: " + this.hitPoints);
        }
    }
    
    
}

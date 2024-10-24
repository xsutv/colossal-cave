package subclass;

import enums.*;

public class Weapon {
    private int damage;
    private Weapons wep;

    public Weapon(String weapon) {
        this.wep = Weapons.valueOf(weapon);
    }

    
}

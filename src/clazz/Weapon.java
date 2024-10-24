package clazz;

import enumz.*;

public class Weapon {
    private int damage;
    private Weapons wep;

    public Weapon(String weapon) {
        this.wep = Weapons.valueOf(weapon);
    }

    
}

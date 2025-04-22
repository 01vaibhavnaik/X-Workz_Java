package com.xworkz.external;

import com.xworkz.internal.Weapon;

public class Bow {
    private Weapon weapon;

    public Bow(Weapon weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        if(weapon != null) {
            weapon.harm();
        } else {
            System.out.println("No weapon available");
        }
    }
}

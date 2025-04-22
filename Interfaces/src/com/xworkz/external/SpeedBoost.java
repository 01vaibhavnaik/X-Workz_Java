package com.xworkz.external;

import com.xworkz.internal.PowerUp;

public class SpeedBoost {
    private PowerUp powerUp;

    public SpeedBoost(PowerUp powerUp) {
        this.powerUp = powerUp;
    }

    public void activate() {
        if (powerUp != null) {
            powerUp.powerUp();
        } else {
            System.out.println("PowerUp is not set");
        }
    }
}

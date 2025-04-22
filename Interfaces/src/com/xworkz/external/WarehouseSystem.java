package com.xworkz.external;

import com.xworkz.internal.Mover;

public class WarehouseSystem {
    private Mover mover;

    public WarehouseSystem(Mover mover) {
        this.mover = mover;
    }

    public void moveItems() {
        if (mover != null) {
            mover.move();
        } else {
            System.out.println("Mover is not available.");
        }
    }
}

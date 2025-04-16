package com.xworkz.external;

import com.xworkz.Internal.WashRoomRule;

public class WashRoom implements WashRoomRule {

    @Override
    public void noLittering() {
        System.out.println("No littering in the washroom.");
    }

    @Override
    public void noVandalism() {
        System.out.println("No vandalism in the washroom.");
    }

    @Override
    public void noExcessiveNoise() {
        System.out.println("No excessive noise in the washroom.");
    }
}

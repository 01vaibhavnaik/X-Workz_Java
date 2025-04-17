package com.xworkz.Internal;

public interface WashRoomRule {

    void noLittering();
    void noVandalism();
    void noExcessiveNoise();

    default void washRoomCleanliness() {
        System.out.println("Maintain cleanliness in the washroom.");
    }


}

package com.xworkz.Internal;

public interface SatelliteRule {


    void toWorkWithTeamSatellite();

    void tofocusOnWorkSatellite();

    void toTeachTeamSatellite();

    default void noFakeSatellite() {
        System.out.println("No Fake Satellite");
    }
}

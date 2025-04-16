package com.xworkz.external;

import com.xworkz.Internal.SatelliteRule;

public class Satellite implements SatelliteRule {
    @Override
    public void toWorkWithTeamSatellite() {
        System.out.println("toWorkWithTeamSatellite");
    }

    @Override
    public void tofocusOnWorkSatellite() {
        System.out.println("tofocusOnWorkSatellite");
    }

    @Override
    public void toTeachTeamSatellite() {
        System.out.println("toTeachTeamSatellite");
    }
}

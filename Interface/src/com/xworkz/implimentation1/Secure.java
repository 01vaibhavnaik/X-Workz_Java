package com.xworkz.implimentation1;

import com.xworkz.Internal.SatelliteRule;
import com.xworkz.Internal.SecurityRule;

public class Secure implements SecurityRule, SatelliteRule {
    @Override
    public void toWorkWithTeamSatellite() {
        System.out.println("Working with team satellite");
    }

    @Override
    public void tofocusOnWorkSatellite() {
        System.out.println("Focusing on work satellite");
    }

    @Override
    public void toTeachTeamSatellite() {
        System.out.println("Teaching team satellite");
    }

    @Override
    public void timeToSecureArea() {
        System.out.println("Time to secure area");
    }

    @Override
    public void timeToCheckSecurity() {
        System.out.println("Time to check security");
    }

    @Override
    public void timeToReportIncident() {
        System.out.println("Time to report incident");
    }
}

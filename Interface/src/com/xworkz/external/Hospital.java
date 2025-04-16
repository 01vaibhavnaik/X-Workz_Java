package com.xworkz.external;

import com.xworkz.Internal.HospitalRule;

public class Hospital implements HospitalRule {

    @Override
    public void timeToAdmitPatient() {
        System.out.println("Time to admit patient");
    }

    @Override
    public void timeToDischargePatient() {
        System.out.println("Time to discharge patient");
    }

    @Override
    public void timeToConsultDoctor() {
        System.out.println("Time to consult doctor");
    }
}

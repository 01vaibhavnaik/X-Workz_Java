package com.xworkz.Internal;

public interface HospitalRule {


    void timeToAdmitPatient();

    void timeToDischargePatient();

    void timeToConsultDoctor();
    default void noFakeHospital() {
        System.out.println("No Fake Hospital");
    }


}

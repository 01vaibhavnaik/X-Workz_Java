package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class BirthCertificateDTO implements Serializable {

    private long birthId;
    private String hospitalName;
    private String fatherName;
    private String motherName;
    private LocalDate date;
    private String doctorName;
    private String nurseName;
    private String hospitalType;

//    @Override
//    public String toString() {
//        return "BirthCertificateDTO{" +
//                "birthId=" + birthId +
//                ", hospitalName='" + hospitalName + '\'' +
//                ", fatherName='" + fatherName + '\'' +
//                ", motherName='" + motherName + '\'' +
//                ", date=" + date +
//                ", doctorName='" + doctorName + '\'' +
//                ", nurseName='" + nurseName + '\'' +
//                ", hospitalType='" + hospitalType + '\'' +
//                '}';
//    }

    public long getBirthId() {
        return birthId;
    }

    public void setBirthId(long birthId) {
        this.birthId = birthId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }
}

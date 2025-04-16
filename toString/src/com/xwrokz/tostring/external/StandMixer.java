package com.xwrokz.tostring.external;

public class StandMixer {
    private String brand;
    private int speedLevels;
    private String color;

    public StandMixer(String brand, int speedLevels, String color) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.color = color;
        System.out.println("StandMixer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nSpeed Levels: " + this.speedLevels + "\nColor: " + this.color;
    }
    @Override
    public int hashCode(){
        return -58;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof StandMixer){
            StandMixer standMixer1=this;
            StandMixer standMixer2=(StandMixer) obj;
            if(standMixer1.brand==standMixer2.brand && standMixer1.speedLevels== standMixer2.speedLevels && standMixer1.color ==standMixer2.color){
                return true;
            }
        }
        return false;
    }
}

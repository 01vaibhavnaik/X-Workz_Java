package com.xworkz.external;

import com.xworkz.internal.Sensor;

public class PressureSensor {
    private Sensor sensor;

    public PressureSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    public void readPressure() {
        if(sensor != null) {
            sensor.readValue();
        } else {
            System.out.println("Sensor is not available");
        }
    }
}

package com.xworkz.external;

import com.xworkz.internal.Device;

    public class SmartSpeaker {

        private Device device;

        public SmartSpeaker(Device device) {
            this.device = device;

        }
        public void turnOn() {
            if (device != null) {
                device.turnOn();
            } else {
                System.out.println("Device is not set");
            }
        }
}

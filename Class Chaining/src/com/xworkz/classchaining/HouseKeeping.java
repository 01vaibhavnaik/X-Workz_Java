package com.xworkz.classchaining;

    public class HouseKeeping {
        String housekeeperName;
        Transport transport;

        public HouseKeeping(String housekeeperName, Transport transport){
            this.housekeeperName=housekeeperName;
            this.transport=transport;
        }

        public void housekeeperDisplay() {
            System.out.println("House Kepper Name " + this.housekeeperName);
            if (this.transport != null) {
                this.transport.transportDisplay();
            }
        }

}

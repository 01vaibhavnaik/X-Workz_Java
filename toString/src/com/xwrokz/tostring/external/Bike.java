package com.xwrokz.tostring.external;

    public class Bike {
        private String brand;
        private int gearCount;
        private String type;

        public Bike(String brand, int gearCount, String type) {
            this.brand = brand;
            this.gearCount = gearCount;
            this.type = type;
            System.out.println("Bike class constructor running");
        }

        @Override
        public String toString() {
            return "Brand: " + this.brand + "\nGear Count: " + this.gearCount + "\nType: " + this.type;
        }
        @Override
        public int hashCode(){
            return 652;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj!=null){
                System.out.println("not null");
            }
            if(obj instanceof Bike){
                Bike bike1=this;
                Bike bike2=(Bike) obj;
                if(bike1.gearCount==bike2.gearCount ){
                    return true;
                }
            }
            return false;
        }

}

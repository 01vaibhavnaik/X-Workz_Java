package com.xwrokz.tostring.external;

public class Ostrich {
    private String habitat;
    private int speed;
    private boolean canFly;

    public Ostrich(String habitat, int speed, boolean canFly) {
        this.habitat = habitat;
        this.speed = speed;
        this.canFly = canFly;
        System.out.println("Ostrich class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nSpeed: " + this.speed + " km/h\nCan Fly: " + this.canFly;
    }
    @Override
    public int hashCode(){
        return -86952;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Ostrich){
            Ostrich ostrich1=this;
            Ostrich ostrich2=(Ostrich) obj;
            if(ostrich1.habitat== ostrich2.habitat && ostrich1.speed== ostrich2.speed){
                return true;
            }
        }
        return false;
    }
}

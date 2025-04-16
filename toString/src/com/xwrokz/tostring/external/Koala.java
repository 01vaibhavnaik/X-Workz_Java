package com.xwrokz.tostring.external;

public class Koala {
    private String habitat;
    private String diet;
    private boolean isEndangered;

    public Koala(String habitat, String diet, boolean isEndangered) {
        this.habitat = habitat;
        this.diet = diet;
        this.isEndangered = isEndangered;
        System.out.println("Koala class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nDiet: " + this.diet + "\nEndangered: " + this.isEndangered;
    }
    @Override
    public int hashCode(){
        return 1228;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Koala){
            Koala koala1=this;
            Koala koala2=(Koala) obj;
            if(koala1.diet== koala2.habitat && koala1.isEndangered==koala2.isEndangered){
                return true;
            }
        }
        return false;
    }
}


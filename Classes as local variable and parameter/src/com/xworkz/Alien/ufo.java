package com.xworkz.Alien;

public class ufo {
    public void fly(Alien alien){
        if(alien!=null) {
            System.out.println(alien.getSeenBy());

        }
    }
    public void  land(Alien[] aliens){
        for(Alien ref:aliens){
            System.out.println(ref.getDescribe());
        }
    }
    public void caught(){
       Alien alien=new Alien();
       alien.setDescribe("Some");
       System.out.println(alien.getDescribe());

    }


    public void spot(){
        Alien alien1=new Alien();
        alien1.setSeenBy("vai");
        Alien alien2=new Alien();
        alien2.setSeenBy("rosh");
        Alien[] aliens={alien1,alien2};
        for (Alien aln:aliens){
            System.out.println(aln.getSeenBy());
        }
    }


}

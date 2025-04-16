package com.xworkz.classchaining;

public class Experience {
    ExperienceDetails experienceDetails;
    Experience(ExperienceDetails experienceDetails){
        this.experienceDetails=experienceDetails;
    }



    void experienceDisplay(){
        System.out.println("Experience details");

        if(this.experienceDetails!=null){
            this.experienceDetails.expDisplay();
        }
        else System.err.println("Pointing to null");


    }
}

package com.xworkz.classchaining;

public class Personal {
    String pName;
    Skills skill;
    State state;
    Personal (String pName,Skills skill,State state){
        this.pName=pName;
        this.skill=skill;
        this.state=state;
    }
    void personalDisplay(){
        System.out.println("Personal name "+this.pName);
        if(this.skill!=null){
            this.skill.skillDisplay();
        }if(this.state!=null){
            state.stateDisplay();
        }
        else System.err.println("pointing to null");

    }
}

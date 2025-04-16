package com.xworkz.classchaining;

public class State {
    String stateName;
    District[] districts;

    State(String stateName,District[] districts){
        this.stateName=stateName;
        this.districts=districts;

    }
    void  stateDisplay(){
        System.out.println("Name of the State:"+stateName);
        for (District ref:districts){
            if(ref!=null)
                ref.districtDisplay();
            else {
                System.out.println("pointing to null");
            }
        }

    }



}

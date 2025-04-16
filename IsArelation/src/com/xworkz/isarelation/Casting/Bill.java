package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Light;
import com.xworkz.isarelation.Internal.TubeLight;

public class Bill {
    public void payment(Light light){
        light.turnOn();
        light.color();
        light.brightness();
        light.turnOff();

        if(light instanceof TubeLight){
            TubeLight tubeLight=(TubeLight)light ;
            tubeLight.bill();
        }
    }
}

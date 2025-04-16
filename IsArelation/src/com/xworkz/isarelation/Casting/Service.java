package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Cycle;
import com.xworkz.isarelation.Internal.Motorcycle;

public class Service {
    public void check(Cycle cycle){
        cycle.pedal();
        cycle.brake();
        cycle.stand();
        cycle.wheels();

        if (cycle instanceof Motorcycle){
            Motorcycle motorcycle=(Motorcycle) cycle;
            motorcycle.service();
        }
    }
}

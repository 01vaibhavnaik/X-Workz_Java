package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Airplane;
import com.xworkz.isarelation.Internal.Jet;

public class Space {
    public void spaceOccupy(Airplane airplane){
        airplane.fly();
        airplane.land();
        airplane.fuelCapacity();
        airplane.passengers();
        airplane.takeOff();

        if (airplane instanceof Jet){
            Jet jet=(Jet) airplane;
            jet.space();
        }

    }
}

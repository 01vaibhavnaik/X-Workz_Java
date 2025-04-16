package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bat;
import com.xworkz.isarelation.Internal.SportsEquipment;

public class Durable {
    public void qty(SportsEquipment sportsEquipment){
        sportsEquipment.use();
        sportsEquipment.brand();
        sportsEquipment.cost();
        sportsEquipment.maintenance();

        if (sportsEquipment instanceof Bat){
            Bat bat=(Bat) sportsEquipment;
            bat.durable();
        }
    }
}

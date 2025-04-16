package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Hearts;
import com.xworkz.isarelation.Internal.Organ;

public class Disease {
    public void disease(Organ organ){
        organ.function();
        organ.repair();
        organ.bloodSupply();
        organ.bloodSupply();

        if(organ instanceof Hearts){
            Hearts hearts=(Hearts) organ;
            hearts.nerves();
        }
    }
}

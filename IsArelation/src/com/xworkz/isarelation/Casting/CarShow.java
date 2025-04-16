package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Countrys;
import com.xworkz.isarelation.Internal.Japan;

public class CarShow {
    public void cars(Countrys countrys){
        countrys.population();
        countrys.continent();
        countrys.currency();
        countrys.government();
        countrys.language();

        if(countrys instanceof Japan){
            Japan japan=(Japan) countrys;
            japan.car();
        }
    }
}

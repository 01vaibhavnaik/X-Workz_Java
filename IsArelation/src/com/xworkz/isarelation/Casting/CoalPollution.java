package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Charcoal;
import com.xworkz.isarelation.Internal.Coal;

public class CoalPollution {
    public void displays(Coal coal){
        coal.burn();
        coal.carbonContent();
        coal.extraction();

        if(coal instanceof Charcoal){
            Charcoal charcoal=(Charcoal) coal;
            charcoal.pollution();
        }
    }
}

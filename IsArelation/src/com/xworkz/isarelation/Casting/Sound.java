package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Earbud;
import com.xworkz.isarelation.Internal.OnePlus;

public class Sound {
    public void sound(Earbud earbud){
       earbud.EarBudMfd();
        earbud.EarBudPrice();
        earbud.EarBudType();

        if (earbud instanceof OnePlus){
            OnePlus onePlus=(OnePlus) earbud;
            onePlus.EarBudSound();
        }
    }
}

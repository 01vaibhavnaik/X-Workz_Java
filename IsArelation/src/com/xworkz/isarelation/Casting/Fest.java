package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.ShivTemple;
import com.xworkz.isarelation.Internal.Temple;

public class Fest {
    public void events(Temple temple){
        temple.templeClose();
        temple.templeOpen();
        temple.templePrasad();
        temple.templeTirth();

        if(temple instanceof ShivTemple);
        ShivTemple shivTemple=(ShivTemple) temple;
        shivTemple.templeFest();
    }
}

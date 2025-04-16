package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Cloths;
import com.xworkz.isarelation.Internal.Shirt;

public class Brand {
    public void brands(Cloths cloths){
        cloths.clothThickness();
        cloths.clothBrand();
        cloths.clothPrice();
        cloths.clothQty();

        if (cloths instanceof Shirt){
            Shirt shirt=(Shirt) cloths;
            shirt.clothMfd();
        }
    }
}

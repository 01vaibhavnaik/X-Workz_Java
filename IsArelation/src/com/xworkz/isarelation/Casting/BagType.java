package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bag;
import com.xworkz.isarelation.Internal.SkyBag;

public class BagType {
    public  void types(Bag bag){
        bag.bagBrand();
        bag.bagType();
        bag.bagPrice();
        bag.bagQty();

        if (bag instanceof SkyBag){
            SkyBag skyBag=(SkyBag)bag ;
            skyBag.bagStyle();
        }
    }
}

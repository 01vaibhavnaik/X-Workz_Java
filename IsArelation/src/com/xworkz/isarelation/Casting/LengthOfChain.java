package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Chain;
import com.xworkz.isarelation.Internal.Gold;

public class LengthOfChain {
    public void length(Gold gold){
        gold.goldType();
        gold.goldBrand();
        gold.goldThickness();
        gold.goldType();

        if (gold instanceof Chain){
            Chain chain=(Chain) gold;
            chain.colorofchain();
        }
    }
}

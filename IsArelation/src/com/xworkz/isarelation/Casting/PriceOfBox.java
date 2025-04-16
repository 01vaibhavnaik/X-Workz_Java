package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Boxs;
import com.xworkz.isarelation.Internal.MacBook;
import com.xworkz.isarelation.Internal.MatchBox;

public class PriceOfBox {
    public void priceof(Boxs boxs){
        boxs.close();
        boxs.open();
        if(boxs instanceof MatchBox){
            MatchBox matchBox=(MatchBox) boxs;
            matchBox.price();
        }
    }
}
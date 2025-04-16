package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Hall;
import com.xworkz.isarelation.Internal.Home;

public class Tv {
    public void tv(Home home){
        home.HomeType();
        home.HomePrice();
        home.HomeLocation();
        home.HomeQty();

        if(home instanceof Hall){
            Hall hall=(Hall) home;
            hall.homeArea();
        }
    }
}

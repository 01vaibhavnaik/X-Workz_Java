package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Fastrack;
import com.xworkz.isarelation.Internal.Watch;

public class WatchCmp {
    public void watches(Watch watch){
        watch.date();
        watch.time();
        watch.year();

        if (watch instanceof Fastrack){
            Fastrack fastrack=(Fastrack) watch;
                fastrack.price();

        }
    }
}

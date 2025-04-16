package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Clock;
import com.xworkz.isarelation.Internal.Watchs;

public class Time {
    public void time(Clock clock){
        clock.showTime();
        clock.displayFormat();
        clock.powerSource();

        if (clock instanceof Watchs){
            Watchs watchs=(Watchs) clock;
            watchs.watchCmp();
        }
    }
}

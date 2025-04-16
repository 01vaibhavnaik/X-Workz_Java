package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Display;
import com.xworkz.isarelation.Internal.Monitor;

public class Cpu {
    public void systems(Display display){
        display.showImage();
        display.displayType();
        display.displayType();
        if(display instanceof Monitor){
            Monitor monitor=(Monitor) display;
            monitor.monitorPrice();
        }
    }
}

package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Doors;
import com.xworkz.isarelation.Internal.WoodenDoor;

public class Safety {
    public void secure(Doors doors){
        doors.open();
        doors.lock();
        doors.close();
        doors.unlock();
        if (doors instanceof WoodenDoor){
            WoodenDoor woodenDoor=(WoodenDoor) doors;
            woodenDoor.safety();
        }
    }
}

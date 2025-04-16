package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bathroom;
import com.xworkz.isarelation.Internal.Room;

public class RoomNo {
    public void luxurious(Room room){
        room.openDoor();
        room.clean();
        room.occupy();
        room.ventilate();
        room.closeDoor();

        if (room instanceof Bathroom){
            Bathroom bathroom=(Bathroom) room;
            bathroom.ac();
        }
    }
}

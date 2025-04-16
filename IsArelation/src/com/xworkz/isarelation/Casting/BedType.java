package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bed;
import com.xworkz.isarelation.Internal.SingleBed;

public class BedType {
    public void beds(Bed bed){
        bed.bedMfd();
        bed.bedPrice();
        bed.bedQty();
        bed.bedType();

        if (bed instanceof SingleBed){
            SingleBed singleBed=(SingleBed) bed;
            singleBed.bedSize();
        }

    }
}

package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Drop;
import com.xworkz.isarelation.Internal.Eye;
import com.xworkz.isarelation.Internal.EyeDrop;

public class Vision {
    public void vision(Drop drop){
        drop.liquidType();
        drop.absorption();
        drop.dispense();
        drop.uses();
        if (drop instanceof EyeDrop){
        EyeDrop eyeDrop=(EyeDrop) drop;
        eyeDrop.lens();
        }
    }
}

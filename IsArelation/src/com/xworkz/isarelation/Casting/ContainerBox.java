package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Box;
import com.xworkz.isarelation.Internal.SqureBox;

public class ContainerBox {
    public void circle(Box box){
        box.BoxPrice();
        box.BoxMfd();

        if(box instanceof SqureBox);
        SqureBox squreBox=(SqureBox) box;
        squreBox.CircleBox();
    }
}

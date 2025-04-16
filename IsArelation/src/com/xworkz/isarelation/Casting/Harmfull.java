package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Element;
import com.xworkz.isarelation.Internal.Fire;

public class Harmfull {
    public void warning(Element element){
        element.existInNature();
        element.classifiedByType();
        element.combineWithOtherElements();
        element.hasAtomicStructure();

        if (element instanceof Fire){
            Fire fire=(Fire) element;
            fire.harmfull();
        }

    }
}

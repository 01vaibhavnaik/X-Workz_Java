package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Camera;
import com.xworkz.isarelation.Internal.Canon;

public class Lens {
    public void show(Camera camera){
        camera.lens();
        camera.cameraType();
        camera.focus();
        camera.price();
        camera.resolution();

        if (camera instanceof Canon){
            Canon canon=(Canon) camera;
            ((Canon) camera).cameraPrice();
        }
    }
}

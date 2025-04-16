package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Black;
import com.xworkz.isarelation.Internal.Color;

public class ColorName {
    public  void colors(Color color){
        color.colorPrice();
        color.colorBrand();
        color.colorQty();
        color.colorThickness();
        if(color instanceof Black){
            Black black=(Black) color;
            black.colormfd();
        }
    }
}

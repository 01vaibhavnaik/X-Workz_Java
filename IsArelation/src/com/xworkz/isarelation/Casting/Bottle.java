package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.ColdDrink;
import com.xworkz.isarelation.Internal.Sprite;

public class Bottle {
    public void bottleType(ColdDrink coldDrink){
        coldDrink.drink();
        coldDrink.chill();
        coldDrink.fizz();

        if (coldDrink instanceof Sprite){
            Sprite sprite=(Sprite) coldDrink;
            sprite.alcoholAmt();
        }
    }
}

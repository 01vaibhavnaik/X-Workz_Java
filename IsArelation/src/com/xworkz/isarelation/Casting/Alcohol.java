package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Goa;
import com.xworkz.isarelation.Internal.Place;

public class Alcohol {
    public void alcohol(Place place){
        place.placeOpen();
        place.placeClose();
        place.placeName();
        place.placeLocation();

        if (place instanceof Goa){
            Goa goa=(Goa)place;
            goa.beverage();
        }

    }
}

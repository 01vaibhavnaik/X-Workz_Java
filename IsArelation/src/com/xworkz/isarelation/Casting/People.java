package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Country;
import com.xworkz.isarelation.Internal.India;

public class People {
    public void nationality(Country country){
        country.countryPopulation();
        country.countryLocation();
        country.countryName();
        country.countryBan();

        if (country instanceof India){
            India india=(India) country;
            india.nationAnimal();
        }
    }
}

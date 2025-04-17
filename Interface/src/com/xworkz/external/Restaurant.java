package com.xworkz.external;

import com.xworkz.Internal.RestaurantRule;

public class Restaurant implements RestaurantRule {

    @Override
    public void noUnrulyBehavior() {
        System.out.println("No unruly behavior is allowed in the restaurant.");
    }

    @Override
    public void noUnauthorizedAccess() {
        System.out.println("Unauthorized access to restricted areas is prohibited.");
    }

    @Override
    public void noDamageToProperty() {
        System.out.println("Any damage to property will not be tolerated.");
    }

    @Override
    public void noFakeFood() {
        System.out.println("No fake food is allowed in the restaurant.");
    }
}

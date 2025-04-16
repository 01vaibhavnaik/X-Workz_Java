package com.xworkz.external;

import com.xworkz.Internal.SportCarRule;
import org.omg.PortableServer.ServantRetentionPolicy;

public class BWM implements SportCarRule {

    @Override
    public void noRacing() {
        System.out.println("No racing in BWM");
    }

    @Override
    public void noStreetRacing() {
        System.out.println("No street racing in BWM");
    }

    @Override
    public void noIllegalModifications() {
        System.out.println("No illegal modifications in BWM");
    }
}

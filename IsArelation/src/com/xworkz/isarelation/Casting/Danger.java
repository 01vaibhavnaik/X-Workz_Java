package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Chair;
import com.xworkz.isarelation.Internal.ChiefMinister;
import com.xworkz.isarelation.Internal.Minister;

public class Danger {
    public void danger(Minister minister){
        minister.makePolicies();
        minister.attendMeetings();
        minister.implementLaws();
        minister.manageDepartment();

        if(minister instanceof ChiefMinister){
            ChiefMinister chiefMinister=(ChiefMinister) minister;
            chiefMinister.power();
        }
    }
}

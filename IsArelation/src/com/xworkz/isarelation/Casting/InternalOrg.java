package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Body;
import com.xworkz.isarelation.Internal.Human;
import com.xworkz.isarelation.Internal.SqureBox;

public class InternalOrg {
        public void internals(Human human){
            human.eye();
            human.leg();
            human.hand();
            if(human instanceof Body);
            Body body=(Body) human;
            body.heart();


        }
    }
}

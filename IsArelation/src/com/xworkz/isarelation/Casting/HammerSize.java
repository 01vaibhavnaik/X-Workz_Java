package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Hammer;
import com.xworkz.isarelation.Internal.Tool;

public class HammerSize {
    public void sizes(Tool tool){
        tool.clean();
        tool.maintain();
        tool.repair();
        tool.use();

        if(tool instanceof Hammer){
            Hammer hammer=(Hammer) tool;
            hammer.size();
        }

    }
}

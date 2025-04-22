package com.xworkz.external;

import com.xworkz.internal.Level;
import com.xworkz.internal.Sword;

public class DesertLevel {
    private Level level;

    public DesertLevel(Level level) {
        this.level = level;
    }
    public void level() {
        if(level != null) {
            level.level();
        } else {
            System.out.println("Level is not set");
        }
    }
}

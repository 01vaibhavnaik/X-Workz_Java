package com.xworkz.collection.runner;

import com.xworkz.collection.external.Watch;

import java.util.ArrayList;
import java.util.Collection;

public class WatchRunner implements Watch {

    public static void main(String [] args){

        Collection<String> watchName= new ArrayList<>();

        watchName.add("C-Shock");
        watchName.add("Timax");
        watchName.add("Sonata");
        watchName.add("Titan");
        watchName.add("Fastrack");
        watchName.add("Rolex");
        watchName.add("Casio");
        watchName.add("Fossil");
        watchName.add("Apple");
        watchName.add("Samsung");

        System.out.println("Number Of Watches: " + watchName.size());
        watchName.clear();
        System.out.println("Number Of Watches After Clear: " + watchName.size());
        System.out.println("After clear Adding New Watches...");

        watchName.add("Rolex");
        watchName.add("Seiko");
        watchName.add("Omega");
        watchName.add("Longines");
        watchName.add("Tissot");
        watchName.add("Panerai");
        watchName.add("Bremont");
        watchName.add("IWC Schaffhausen");
        watchName.add("Breitling");
        watchName.add("Tag Heuer");
        System.out.println("Number Of Watches After Adding New Watches: " + watchName.size());

    }
    @Override
    public String watchName() {
        return "";
    }
}

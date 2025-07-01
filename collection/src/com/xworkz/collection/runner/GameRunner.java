package com.xworkz.collection.runner;

import com.xworkz.collection.external.Game;

import java.util.ArrayList;
import java.util.Collection;

public class GameRunner implements Game {

    public static void main(String[] args) {

        Collection<String> games = new ArrayList<>();

        games.add("Cricket");
        games.add("Football");
        games.add("Hockey");
        games.add("Basketball");
        games.add("Tennis");
        games.add("Badminton");
        games.add("Volleyball");
        games.add("Baseball");
        games.add("Rugby");
        games.add("Table Tennis");

        System.out.println("Number Of Games: " + games.size());
        games.clear();
        System.out.println("Number Of Games After Clear: " + games.size());
        System.out.println("After clear Adding New Games...");

        games.add("BGMI");
        games.add("Call of Duty");
        games.add("Tenkaichi");
        games.add("Valorant");
        games.add("Counter-Strike");
        games.add("Dota 2");
        games.add("League of Legends");
        games.add("Apex Legends");
        games.add("COC");
        games.add("Fortnite");
        System.out.println("Number Of Games After Adding New Games: " + games.size());


    }

    @Override
    public String gameName() {
        return "Cricket";
    }
}

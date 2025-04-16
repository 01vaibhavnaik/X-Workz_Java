package com.xworkz.external;

import com.xworkz.Internal.SpeakerRule;

public class Volume implements SpeakerRule {

    @Override
    public void timeToSpeak() {
        System.out.println("Time to speak.");
    }

    @Override
    public void volume() {
        System.out.println("Volume is set.");
    }

    @Override
    public void timeToListen() {
        System.out.println("Time to listen.");
    }
}

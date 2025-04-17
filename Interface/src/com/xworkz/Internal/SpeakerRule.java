package com.xworkz.Internal;

public interface SpeakerRule {
    void timeToSpeak();
    void volume();
    void timeToListen();

    default void noFakeSpeaker() {
        System.out.println("No Fake Speaker");
    }




}

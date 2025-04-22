package com.xworkz.external;

import com.xworkz.internal.MediaPlayer;

public class MP3Player {
    private MediaPlayer mediaPlayer;

    public MP3Player(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    public void show() {
        System.out.println("Playing MP3 file");
        if (mediaPlayer != null) {
            this.mediaPlayer.plays();
        } else {
            System.err.println("Null");
        }
    }
}

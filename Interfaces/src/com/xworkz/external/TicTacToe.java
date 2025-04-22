package com.xworkz.external;

import com.xworkz.internal.Game;

public class TicTacToe {
    private Game game;

    public TicTacToe(Game game) {
        this.game = game;
    }
    public void play() {
        if (game != null) {
            game.startGame();
        } else {
            System.out.println("No game to play");
        }
    }
}

package com.vaibhavmojidra.androidjavademo2dagger2stateofmodule;

import android.util.Log;

import javax.inject.Inject;

public class Game {
    private int gameSize;

    @Inject
    public Game(int gameSize) {
        Log.i("MyTag","Game class initialized.");
        this.gameSize = gameSize;
    }

    void getGameSize() {
        Log.i("MyTag","Game size is "+gameSize+" GB.");
    }

}

package com.vaibhavmojidra.androidjavademo2dagger2stateofmodule;

import android.util.Log;

import javax.inject.Inject;

public class PlayGame {
    private SmartPhone smartPhone;
    private Game game;

    @Inject
    public PlayGame(SmartPhone smartPhone, Game game) {
        this.smartPhone = smartPhone;
        this.game = game;
        smartPhone.isSmartPhoneAvailable();
        game.getGameSize();
        Log.i("MyTag","PlayGame class initialized.");
    }

    void playGame(){
        Log.i("MyTag","Game started...");
    }

}

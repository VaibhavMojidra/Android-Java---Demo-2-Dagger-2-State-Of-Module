package com.vaibhavmojidra.androidjavademo2dagger2stateofmodule;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {
    private int gameSize;

    public GameModule(int gameSize) {
        this.gameSize = gameSize;
    }

    @Provides
    Game providesGame(){
        return new Game(gameSize);
    }
}

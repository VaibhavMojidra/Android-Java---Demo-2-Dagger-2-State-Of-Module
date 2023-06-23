package com.vaibhavmojidra.androidjavademo2dagger2stateofmodule;

import dagger.Component;

@Component(modules = {GameModule.class})
public interface PlayGameComponent {
    PlayGame getPlayGame();
}

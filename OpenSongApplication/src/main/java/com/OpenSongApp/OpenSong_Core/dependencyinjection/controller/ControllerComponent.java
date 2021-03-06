package com.OpenSongApp.OpenSong_Core.dependencyinjection.controller;

import com.OpenSongApp.OpenSong_Core.screens.common.dialogs.info.InfoDialog;
import com.OpenSongApp.OpenSong_Core.screens.common.dialogs.prompt.PromptDialog;
import com.OpenSongApp.OpenSong_Core.screens.example.activities.ExampleActivity;

import dagger.Subcomponent;

@Subcomponent(modules = {ControllerModule.class, ViewMvcModule.class})
public interface ControllerComponent {

    void inject(ExampleActivity exampleActivity);

    void inject(InfoDialog infoDialog);
    void inject(PromptDialog promptDialog);

}

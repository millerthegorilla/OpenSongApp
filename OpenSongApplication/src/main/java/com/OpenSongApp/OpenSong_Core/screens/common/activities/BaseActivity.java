package com.OpenSongApp.OpenSong_Core.screens.common.activities;

import android.support.annotation.UiThread;
import android.support.v4.app.FragmentActivity;

import com.OpenSongApp.OpenSong_Core.OpenSong;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ViewMvcModule;

public abstract class BaseActivity extends FragmentActivity {

    private boolean mIsControllerComponentUsed = false;

    /**
     * @return controller injector of type {@link ControllerComponent}
     */
    @UiThread
    protected ControllerComponent getControllerComponent() {
        if (mIsControllerComponentUsed) {
            throw new IllegalStateException("must not use ControllerComponent more than once");
        }
        mIsControllerComponentUsed = true;
        return ((OpenSong)getApplication())
                .getApplicationComponent()
                .newControllerComponent(new ControllerModule(this), new ViewMvcModule());
    }
}

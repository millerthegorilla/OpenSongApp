package com.OpenSongApp.OpenSong_Core.screens.common.fragments;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;

import com.OpenSongApp.OpenSong_Core.OpenSong;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ViewMvcModule;

public abstract class BaseFragment extends Fragment {

    private boolean mIsControllerComponentUsed = false;

    @UiThread
    @NonNull
    protected ControllerComponent getControllerComponent() {
        if (mIsControllerComponentUsed) {
            throw new IllegalStateException("must not use ControllerComponent more than once");
        }
        mIsControllerComponentUsed = true;
        return ((OpenSong)getActivity().getApplication())
                .getApplicationComponent()
                .newControllerComponent(new ControllerModule(getActivity()), new ViewMvcModule());
    }
}

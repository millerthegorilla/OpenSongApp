package com.OpenSongApp.OpenSong_Core.screens.example.mvcviews;

import com.OpenSongApp.OpenSong_Core.screens.common.mvcviews.ObservableViewMvc;

public interface ExampleViewMvc extends ObservableViewMvc<ExampleViewMvc.ExampleViewMvcListener> {

    interface ExampleViewMvcListener {
        void onShowDialogClicked();
    }

}

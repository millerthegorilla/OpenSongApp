package com.OpenSongApp.OpenSong_Core.screens.common.dialogs.info;

import com.OpenSongApp.OpenSong_Core.screens.common.mvcviews.ObservableViewMvc;

public interface InfoViewMvc extends ObservableViewMvc<InfoViewMvc.InfoViewMvcListener> {

    @SuppressWarnings("UnnecessaryInterfaceModifier")
    public interface InfoViewMvcListener {
        void onDismissClicked();
    }

    void setTitle(String title);
    void setMessage(String message);
    void setDismissCaption(String dismissCaption);

}

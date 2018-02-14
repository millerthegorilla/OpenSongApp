package com.OpenSongApp.OpenSong_Core.screens.common.dialogs.prompt;

import android.annotation.SuppressLint;

import com.OpenSongApp.OpenSong_Core.screens.common.mvcviews.ObservableViewMvc;

public interface PromptViewMvc extends ObservableViewMvc<PromptViewMvc.PromptViewMvcListener> {

    @SuppressWarnings("UnnecessaryInterfaceModifier")
    public interface PromptViewMvcListener {
        void onPositiveButtonClicked();
        void onNegativeButtonClicked();
    }

    void setTitle(String title);
    void setMessage(String message);
    void setPositiveButtonCaption(String positiveButtonCaption);
    void setNegativeButtonCaption(String negativeButtonCaption);

}

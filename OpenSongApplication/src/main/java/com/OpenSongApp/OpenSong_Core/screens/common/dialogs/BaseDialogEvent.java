package com.OpenSongApp.OpenSong_Core.screens.common.dialogs;

/**
 * Base class for all dialogs related events
 */
public abstract class BaseDialogEvent {
    private String mId;

    public BaseDialogEvent(String id) {
        mId = id;
    }

    public String getDialogId() {
        return mId;
    }
}

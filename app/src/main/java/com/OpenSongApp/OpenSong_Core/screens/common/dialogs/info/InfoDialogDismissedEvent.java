package com.OpenSongApp.OpenSong_Core.screens.common.dialogs.info;


import com.OpenSongApp.OpenSong_Core.screens.common.dialogs.BaseDialogEvent;

/**
 * This event will be posted to EventBus when InfoDialog is dismissed
 */
public class InfoDialogDismissedEvent extends BaseDialogEvent {

    public InfoDialogDismissedEvent(String id) {
        super(id);
    }
}

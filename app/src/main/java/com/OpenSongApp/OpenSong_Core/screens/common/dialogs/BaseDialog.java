package com.OpenSongApp.OpenSong_Core.screens.common.dialogs;

import android.support.annotation.UiThread;
import android.support.v4.app.DialogFragment;

import com.OpenSongApp.OpenSong_Core.OpenSong;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ViewMvcModule;

/**
 * Base class for all dialogs
 */
public abstract class BaseDialog extends DialogFragment {

    private boolean mIsControllerComponentUsed = false;

    @UiThread
    protected ControllerComponent getControllerComponent() {
        if (mIsControllerComponentUsed) {
            throw new IllegalStateException("must not use ControllerComponent more than once");
        }
        mIsControllerComponentUsed = true;
        return ((OpenSong)getActivity().getApplication())
                .getApplicationComponent()
                .newControllerComponent(new ControllerModule(getActivity()), new ViewMvcModule());
    }

    /**
     * Get this dialog's ID that was supplied with a call to
     * {@link DialogsManager#showRetainedDialogWithId(DialogFragment, String)}
     * @return dialog's ID, or null if none was set
     */
    protected String getDialogId() {
        if (getArguments() == null) {
            return null;
        } else {
            return getArguments().getString(DialogsManager.ARGUMENT_DIALOG_ID);
        }
    }

}

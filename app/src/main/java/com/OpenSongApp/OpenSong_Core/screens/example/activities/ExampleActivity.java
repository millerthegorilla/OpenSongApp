package com.OpenSongApp.OpenSong_Core.screens.example.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import com.OpenSongApp.OpenSong_Core.R;
import com.OpenSongApp.OpenSong_Core.screens.common.dialogs.DialogsFactory;
import com.OpenSongApp.OpenSong_Core.screens.common.dialogs.DialogsManager;
import com.OpenSongApp.OpenSong_Core.screens.common.activities.BaseActivity;
import com.OpenSongApp.OpenSong_Core.screens.common.mvcviews.ViewMvcFactory;
import com.OpenSongApp.OpenSong_Core.screens.example.mvcviews.ExampleViewMvc;

import javax.inject.Inject;

public class ExampleActivity extends BaseActivity implements ExampleViewMvc.ExampleViewMvcListener {

    @Inject DialogsManager mDialogsManager;
    @Inject DialogsFactory mDialogsFactory;
    @Inject ViewMvcFactory mViewMvcFactory;

    private ExampleViewMvc mViewMvc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getControllerComponent().inject(this);

        super.onCreate(savedInstanceState);

        mViewMvc = mViewMvcFactory.newMvcView(ExampleViewMvc.class, null);
        mViewMvc.registerListener(this);

        setContentView(mViewMvc.getRootView());
    }

    @Override
    public void onShowDialogClicked() {
        DialogFragment dialog = mDialogsFactory.newInfoDialog(
                getString(R.string.dialog_title),
                getString(R.string.dialog_message),
                getString(R.string.dialog_button_caption));
        mDialogsManager.showRetainedDialogWithId(dialog, null);
    }
}

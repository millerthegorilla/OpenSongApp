package com.OpenSongApp.OpenSong_Core.dependencyinjection.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.OpenSongApp.OpenSong_Core.common.Constants;
import com.OpenSongApp.OpenSong_Core.common.settings.SettingsManager;
import com.OpenSongApp.OpenSong_Core.common.settings.sharedpreferences.SharedPrefsSettingsEntryFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsModule {

    @Provides
    @ApplicationScope
    SettingsManager settingsManager(Application application) {
        SharedPreferences sharedPreferences = application
                .getSharedPreferences(Constants.SHARED_PREFS_FILE, Context.MODE_PRIVATE);
        return new SettingsManager(new SharedPrefsSettingsEntryFactory(sharedPreferences));
    }

}

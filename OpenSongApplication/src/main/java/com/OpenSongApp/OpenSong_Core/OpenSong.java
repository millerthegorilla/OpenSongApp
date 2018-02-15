package com.OpenSongApp.OpenSong_Core;

import android.app.Application;
import android.support.annotation.UiThread;

import com.OpenSongApp.OpenSong_Core.dependencyinjection.application.ApplicationComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.application.ApplicationModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.application.DaggerApplicationComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.application.SettingsModule;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class OpenSong extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {

        super.onCreate();
        if ( BuildConfig.FLAVOR == "crashlytics") {
            Fabric.with( this, new Crashlytics() );
        }
    }

    /**
     * @return application injector of type {@link ApplicationComponent}
     */
    @UiThread
    public ApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .settingsModule(new SettingsModule())
                    .build();
        }
        return mApplicationComponent;
    }
}

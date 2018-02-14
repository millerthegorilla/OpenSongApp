package com.OpenSongApp.OpenSong_Core.dependencyinjection.application;

import android.app.Application;

import com.OpenSongApp.OpenSong_Core.common.logging.MyLogger;
import com.OpenSongApp.OpenSong_Core.common.multithreading.BackgroundThreadPoster;
import com.OpenSongApp.OpenSong_Core.common.multithreading.MainThreadPoster;

import org.greenrobot.eventbus.EventBus;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationScope
    Application application() {
        return mApplication;
    }

    @Provides
    @ApplicationScope
    MyLogger logger() {
        return new MyLogger();
    }

    @Provides
    @ApplicationScope
    EventBus eventBus() {
        return EventBus.getDefault();
    }

    @Provides
    @ApplicationScope
    MainThreadPoster mainThreadPoster() {
        return new MainThreadPoster();
    }

    @Provides
    @ApplicationScope
    BackgroundThreadPoster backgroundThreadPoster() {
        return new BackgroundThreadPoster();
    }
}

package com.OpenSongApp.OpenSong_Core.common.logging;

import android.support.annotation.NonNull;
import android.util.Log;

import com.OpenSongApp.OpenSong_Core.BuildConfig;

import timber.log.Timber;

/**
 * This class is a non-static wrapper around {@link Log} class
 */
public class MyLogger {

    public MyLogger()
    {
        if ( BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportingTree());
        }
    }

    /** A tree which logs important information for crash reporting. */
    private class CrashReportingTree extends Timber.Tree {
        @Override protected void log( int priority, String tag, @NonNull String message, Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return;
            }


            //FakeCrashLibrary.log(priority, tag, message);

            if (t != null) {
                if (priority == Log.ERROR) {
              //      FakeCrashLibrary.logError(t);
                } else if (priority == Log.WARN) {
                //    FakeCrashLibrary.logWarning(t);
                }
            }
        }
    }

    public void e(String tag, String message) {
        Timber.e(tag, message);
    }

    public void w(String tag, String message) {
        Timber.w(tag, message);
    }

    public void v(String tag, String message) {
        Timber.v(tag, message);
    }

    public void d(String tag, String message) {
        Timber.d(tag, message);
    }
}

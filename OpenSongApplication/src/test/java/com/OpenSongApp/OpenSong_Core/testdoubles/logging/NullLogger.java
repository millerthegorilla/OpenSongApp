package com.OpenSongApp.OpenSong_Core.testdoubles.logging;

import com.OpenSongApp.OpenSong_Core.common.logging.MyLogger;

/**
 * No op logger for testing
 */
public class NullLogger extends MyLogger {

    @Override
    public void e(String tag, String message) {

    }

    @Override
    public void w(String tag, String message) {

    }

    @Override
    public void v(String tag, String message) {

    }

    @Override
    public void d(String tag, String message) {

    }
}

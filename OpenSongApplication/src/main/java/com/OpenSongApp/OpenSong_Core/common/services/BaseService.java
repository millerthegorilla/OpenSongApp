package com.OpenSongApp.OpenSong_Core.common.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

import com.OpenSongApp.OpenSong_Core.OpenSong;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.service.ServiceComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.service.ServiceModule;

/**
 * The base class for services to implement
 *
 * I have disabled this by default in the manifest
 */
public class BaseService extends Service {

    private ServiceComponent mServiceComponent;
    
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * @return service injector of type {@link ServiceComponent}
     */
    @UiThread
    protected ServiceComponent getServiceComponent() {
        if (mServiceComponent == null) {
            mServiceComponent =
                    ((OpenSong)getApplication()).getApplicationComponent()
                            .newServiceComponent(new ServiceModule(this));
        }
        return mServiceComponent;
    }
}

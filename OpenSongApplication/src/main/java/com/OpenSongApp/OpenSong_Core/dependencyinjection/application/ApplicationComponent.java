package com.OpenSongApp.OpenSong_Core.dependencyinjection.application;

import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ControllerModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.controller.ViewMvcModule;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.service.ServiceComponent;
import com.OpenSongApp.OpenSong_Core.dependencyinjection.service.ServiceModule;

import dagger.Component;

@ApplicationScope
@Component(
        modules = {
                ApplicationModule.class,
                SettingsModule.class
        }
)
public interface ApplicationComponent {

    ControllerComponent newControllerComponent(
            ControllerModule controllerModule,
            ViewMvcModule viewMvcModule);

    ServiceComponent newServiceComponent(ServiceModule serviceModule);

}
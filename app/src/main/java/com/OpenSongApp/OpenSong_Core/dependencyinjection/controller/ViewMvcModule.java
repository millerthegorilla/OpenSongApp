package com.OpenSongApp.OpenSong_Core.dependencyinjection.controller;

import android.content.Context;
import android.view.LayoutInflater;

import com.OpenSongApp.OpenSong_Core.screens.common.mvcviews.ViewMvcFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewMvcModule {

    @Provides
    LayoutInflater layoutInflater(Context context) {
        return LayoutInflater.from(context);
    }

    @Provides
    ViewMvcFactory viewMvcFactory(LayoutInflater layoutInflater) {
        return new ViewMvcFactory(layoutInflater);
    }

}

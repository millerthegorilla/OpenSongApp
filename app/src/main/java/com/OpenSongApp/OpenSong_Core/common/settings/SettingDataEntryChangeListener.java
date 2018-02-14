package com.OpenSongApp.OpenSong_Core.common.settings;


public interface SettingDataEntryChangeListener<T> {

    void onValueChanged(SettingDataEntry settingDataEntry, T value);

}

package com.wiseassblog.fountaindayplanner;

import android.app.Application;

public class FountainApp extends Application {

    private StorageServiceLocator locator;

    @Override
    public void onCreate() {
        super.onCreate();

        locator = new StorageServiceLocator(this);
    }

    public StorageServiceLocator getServiceLocator() {
        return locator;
    }
}

package com.robotnec.reactivetodo.core.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {

    private final Context context;

    public AndroidModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return context;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}

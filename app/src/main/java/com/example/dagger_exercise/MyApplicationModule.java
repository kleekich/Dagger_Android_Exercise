package com.example.dagger_exercise;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by kangsik_kevin_lee on 2/1/18.
 */

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}

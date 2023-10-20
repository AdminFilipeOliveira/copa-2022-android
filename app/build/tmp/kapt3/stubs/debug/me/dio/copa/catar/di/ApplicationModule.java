package me.dio.copa.catar.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lme/dio/copa/catar/di/ApplicationModule;", "", "()V", "bindContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module(includes = {me.dio.copa.catar.data.di.DataModule.class, me.dio.copa.catar.local.di.LocalModule.class, me.dio.copa.catar.remote.di.RemoteModule.class, me.dio.copa.catar.remote.di.NetworkModule.class, me.dio.copa.catar.remote.di.ServiceModules.class})
public abstract class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull
    android.app.Application application);
}
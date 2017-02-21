package com.asyraf.pokemon.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.asyraf.pokemon.data.DataManager;
import com.asyraf.pokemon.data.remote.MvpStarterService;
import com.asyraf.pokemon.injection.ApplicationContext;
import com.asyraf.pokemon.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager dataManager();

    MvpStarterService mvpBoilerplateService();
}

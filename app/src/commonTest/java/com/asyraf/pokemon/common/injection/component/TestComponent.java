package com.asyraf.pokemon.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import com.asyraf.pokemon.common.injection.module.ApplicationTestModule;
import com.asyraf.pokemon.injection.component.ApplicationComponent;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
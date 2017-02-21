package com.asyraf.pokemon.injection.component;

import dagger.Subcomponent;
import com.asyraf.pokemon.injection.PerFragment;
import com.asyraf.pokemon.injection.module.FragmentModule;

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

}
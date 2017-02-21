package com.asyraf.pokemon.injection.component;

import dagger.Subcomponent;
import com.asyraf.pokemon.injection.PerActivity;
import com.asyraf.pokemon.injection.module.ActivityModule;
import com.asyraf.pokemon.ui.base.BaseActivity;
import com.asyraf.pokemon.ui.detail.DetailActivity;
import com.asyraf.pokemon.ui.main.MainActivity;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity baseActivity);

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);
}

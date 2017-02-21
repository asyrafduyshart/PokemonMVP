package com.asyraf.pokemon.ui.detail;

import com.asyraf.pokemon.data.model.Pokemon;
import com.asyraf.pokemon.data.model.Statistic;
import com.asyraf.pokemon.ui.base.MvpView;

public interface DetailMvpView extends MvpView {

    void showPokemon(Pokemon pokemon);

    void showStat(Statistic statistic);

    void showProgress(boolean show);

    void showError(Throwable error);

}
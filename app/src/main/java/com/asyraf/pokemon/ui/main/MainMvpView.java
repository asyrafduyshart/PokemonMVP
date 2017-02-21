package com.asyraf.pokemon.ui.main;

import java.util.List;

import com.asyraf.pokemon.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showPokemon(List<String> pokemon);

    void showProgress(boolean show);

    void showError(Throwable error);

}
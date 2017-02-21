package com.asyraf.pokemon.ui.main;

import javax.inject.Inject;

import com.asyraf.pokemon.data.DataManager;
import com.asyraf.pokemon.injection.ConfigPersistent;
import com.asyraf.pokemon.ui.base.BasePresenter;
import com.asyraf.pokemon.util.rx.scheduler.SchedulerUtils;

@ConfigPersistent
public class MainPresenter extends BasePresenter<MainMvpView> {

    private final DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    public void getPokemon(int limit) {
        checkViewAttached();
        getMvpView().showProgress(true);
        mDataManager.getPokemonList(limit)
                .compose(SchedulerUtils.ioToMain())
                .subscribe(pokemons -> {
                    getMvpView().showProgress(false);
                    getMvpView().showPokemon(pokemons);
                }, throwable -> {
                    getMvpView().showProgress(false);
                    getMvpView().showError(throwable);
                });
    }

}
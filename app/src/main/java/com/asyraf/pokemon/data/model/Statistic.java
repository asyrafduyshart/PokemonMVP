package com.asyraf.pokemon.data.model;

import com.google.gson.annotations.SerializedName;

public class Statistic {
    public NamedResource stat;
    @SerializedName("base_stat")
    public int baseStat;
}

package com.busin.myapplication;

import com.google.gson.annotations.SerializedName;

public class Pokemon {

    public Pokemon(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @SerializedName("number")
    String id;

    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

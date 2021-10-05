package com.busin.myapplication;

import java.io.Serializable;

public class Voiture implements Serializable {

    String color;
    String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

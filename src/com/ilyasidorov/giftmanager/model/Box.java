package com.ilyasidorov.giftmanager.model;

import com.ilyasidorov.giftmanager.model.sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private static final double BOX_WEIGHT = 0.1;

    private String name;
    private List<Sweet> sweets = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

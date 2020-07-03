package com.ilyasidorov.giftmanager.model.sweets;

public class Cake extends Sweet{

    private boolean isVegetarian;

    public Cake(String name, double weight, double price, boolean isVegetarian) {
        super(name, weight, price);
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return String.format(Cake.class.getSimpleName() + ": %s, %.1f kg, %.2f USD, isVegetarian: %s", getName(), getWeight(), getPrice(), isVegetarian);
    }
}

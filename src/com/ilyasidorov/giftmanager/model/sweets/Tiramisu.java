package com.ilyasidorov.giftmanager.model.sweets;

public class Tiramisu extends Sweet {

    private int freshnessCategory;

    public Tiramisu(String name, double weight, double price, int freshnessCategory) {
        super(name, weight, price);
        this.freshnessCategory = freshnessCategory;
    }

    @Override
    public String toString() {
        return String.format(Tiramisu.class.getSimpleName() + ": %s, %.1f kg, %.2f USD, category: %d", getName(), getWeight(), getPrice(), freshnessCategory);
    }


}

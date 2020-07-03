package com.ilyasidorov.giftmanager.model.sweets;

public class Brownie extends Sweet {

        private String color;

        public Brownie(String name, double weight, double price, String color) {
            super(name, weight, price);
            this.color = color;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }


    @Override
    public String toString() {
        return String.format(Brownie.class.getSimpleName() + ": %s, %.1f kg, %.2f USD, color: %s", getName(), getWeight(), getPrice(), color);
    }
}

package com.ilyasidorov.giftmanager.service;

import com.ilyasidorov.giftmanager.model.Box;
import com.ilyasidorov.giftmanager.model.sweets.Sweet;
import com.ilyasidorov.giftmanager.repository.BoxRepository;

import java.util.Comparator;
import java.util.List;

public class BoxService implements BoxRepository {

    //logic methods
    @Override
    public void addSweet(Box box, Sweet sweet) {
        box.getSweets().add(sweet);
    }

    @Override
    public List<Sweet> findAllSweets(Box box) {
        return box.getSweets();
    }

    @Override
    public void removeSweet(Box box, Sweet sweet) {
        box.getSweets().remove(sweet);
    }

    @Override
    public double getBoxWeight(Box box) {
        return box.getSweets().stream()
                .mapToDouble(Sweet::getWeight)
                .sum();
    }

    @Override
    public double getBoxPrice(Box box) {
        return box.getSweets().stream()
                .mapToDouble(Sweet::getPrice)
                .sum();
    }

    @Override
    public void reduceBoxWeight(Box box, double limitWeight) {
            List<Sweet> allSweets = box.getSweets();
            double boxWeight = getBoxWeight(box);

            while (limitWeight < boxWeight) {
                Sweet sweetWithMinWeight = allSweets.stream()
                        .sorted(Comparator.comparing(Sweet::getWeight))
                        .findFirst()
                        .get();
                boxWeight = boxWeight - sweetWithMinWeight.getWeight();
                allSweets.remove(sweetWithMinWeight);
            }

            System.out.println("The weight of the box was reduced to " + boxWeight);
            System.out.println("The remaining sweets in the box: ");
            for (Sweet sweet : allSweets) {
                System.out.println(sweet);
            }
    }

    @Override
    public void reduceBoxPrice(Box box, double limitPrice) {
        List<Sweet> allSweets = box.getSweets();
        double boxPrice = getBoxPrice(box);

            while (limitPrice < boxPrice) {
                Sweet sweetWithMinPrice = allSweets.stream()
                        .sorted(Comparator.comparing(Sweet::getPrice))
                        .findFirst()
                        .get();
                boxPrice = boxPrice - sweetWithMinPrice.getPrice();
                allSweets.remove(sweetWithMinPrice);
            }

        System.out.println("The price of the box was reduced to " + boxPrice);
        System.out.println("The remaining sweets in the box: ");
        for (Sweet sweet : allSweets) {
            System.out.println(sweet);
        }
    }

    //display methods

    @Override
    public void displayAllSweets(Box box) {
        System.out.println(box + ":");
        for (Sweet sweet : box.getSweets()) {
            System.out.println(sweet);
        }
    }

    @Override
    public void displayBoxWeight(Box box) {
        System.out.print("The weight of the " + box + " : " + getBoxWeight(box) + " kg\n");
    }

    @Override
    public void displayBoxPrice(Box box) {
        System.out.print("The price of the " + box + " : " + getBoxPrice(box) + " USD\n");

    }
}

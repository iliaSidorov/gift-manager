package com.ilyasidorov.giftmanager.repository;

import com.ilyasidorov.giftmanager.model.Box;
import com.ilyasidorov.giftmanager.model.sweets.Sweet;

import java.util.List;

public interface BoxRepository {

    //logic
    void addSweet(Box box, Sweet sweet);
    List<Sweet> findAllSweets(Box box);
    void removeSweet(Box box, Sweet sweet);
    double getBoxWeight(Box box);
    double getBoxPrice(Box box);
    void reduceBoxWeight(Box box, double limitWeight);
    void reduceBoxPrice(Box box, double limitPrice);

    //display
    void displayAllSweets(Box box);
    void displayBoxWeight(Box box);
    void displayBoxPrice(Box box);
}

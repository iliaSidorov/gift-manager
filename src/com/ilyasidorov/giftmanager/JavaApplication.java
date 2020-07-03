package com.ilyasidorov.giftmanager;

import com.ilyasidorov.giftmanager.model.Box;
import com.ilyasidorov.giftmanager.model.sweets.Brownie;
import com.ilyasidorov.giftmanager.model.sweets.Cake;
import com.ilyasidorov.giftmanager.model.sweets.Tiramisu;
import com.ilyasidorov.giftmanager.service.BoxService;

public class JavaApplication {

    public static BoxService boxService = new BoxService();

    public static void main(String[] args) {

        //create data
        Brownie brownie1 = new Brownie("The Bartholomew Night", 0.2, 1.50, "black");
        Brownie brownie2 = new Brownie("The Spirit Of Melany", 0.1, 1.20, "white");
        Tiramisu tiramisu1 = new Tiramisu("The Light That Failed", 0.3, 2.10, 1);
        Cake cake1 = new Cake("The Fat Joe", 1, 5.45, false);
        Cake cake2 = new Cake("The Tiny Piggy", 0.4, 3.08, true);

        //create new box for a gift
        Box maryGift = new Box("Gift for Mary");

        //add sweets into the box
        boxService.addSweet(maryGift, brownie1);
        boxService.addSweet(maryGift, brownie2);
        boxService.addSweet(maryGift, tiramisu1);
        boxService.addSweet(maryGift, cake1);
        boxService.addSweet(maryGift, cake2);

        //display list of all sweets in the box
        boxService.displayAllSweets(maryGift);

        System.out.println();

        //display the weight of the box
        boxService.displayBoxWeight(maryGift);

        //display the price of the box
        boxService.displayBoxPrice(maryGift);

        //remove a sweet from the box
        boxService.removeSweet(maryGift, tiramisu1);

        //limit the weight
        boxService.reduceBoxWeight(maryGift, 1.7);

        //limit the price
        boxService.reduceBoxPrice(maryGift, 10);

    }
}

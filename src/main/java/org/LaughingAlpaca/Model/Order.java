package org.LaughingAlpaca.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    List<Beverage> items = new ArrayList<>();

    public void addBeverage(Beverage beverage) {
        this.items.add(beverage);
    }

    public abstract void displayOrder();
}

package org.LaughingAlpaca.Model;

public class WalkInOrder extends Order {

    @Override
    public void displayOrder() {
        System.out.println("---THIS IS A WALK-IN ORDER---");
        for (Beverage beverage : this.items) {
            System.out.println(beverage.toString());
        }
    }
}

package org.LaughingAlpaca.Model;

public class MobileOrder extends Order {
    @Override
    public void displayOrder() {
        System.out.println("---THIS IS AN ONLINE ORDER---");
        for (Beverage beverage : this.items) {
            System.out.println(beverage.toString());
        }
    }
}

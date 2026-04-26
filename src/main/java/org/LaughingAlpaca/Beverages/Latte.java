package org.LaughingAlpaca.Beverages;

import org.LaughingAlpaca.Model.Beverage;

public class Latte extends Beverage {
    //this stores the espresso shot count for this drink.
    private int shotsCount;

    //this lets the espresso drink expose and validate its shot count.
    public int getShotsCount() {
        return shotsCount;
    }

    public void setShotsCount(int shotsCount) {
        if (shotsCount < 1 || shotsCount > 3) {
            throw new IllegalArgumentException("Latte shots must be between 1 and 3.");
        }

        this.shotsCount = shotsCount;
    }

    //this adds shot details to the drink output when set.
    @Override
    public String toString() {
        String baseDescription = super.toString();
        if (shotsCount == 0) {
            return baseDescription;
        }

        return baseDescription.substring(0, baseDescription.length() - 1)
                + ", Shots: " + shotsCount + "]";
    }
}

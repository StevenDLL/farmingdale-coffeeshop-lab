package org.LaughingAlpaca.Factories;

import org.LaughingAlpaca.Builders.BeverageBuilder;
import org.LaughingAlpaca.Builders.CappuccinoBuilder;
import org.LaughingAlpaca.Builders.CoffeeBuilder;
import org.LaughingAlpaca.Builders.LatteBuilder;
import org.LaughingAlpaca.Builders.TeaBuilder;

public class BeverageFactory {
    //this returns the correct builder for the selected beverage type.
    public static BeverageBuilder getBuilder(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Unknown beverage type: null");
        }

        String normalizedType = type.trim().toLowerCase();

        return switch (normalizedType) {
            case "coffee" -> new CoffeeBuilder();
            case "tea" -> new TeaBuilder();
            case "latte" -> new LatteBuilder();
            case "cappuccino" -> new CappuccinoBuilder();
            default -> throw new IllegalArgumentException("Unknown beverage type: " + type);
        };
    }
}

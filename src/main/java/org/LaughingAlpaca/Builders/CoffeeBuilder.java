package org.LaughingAlpaca.Builders;

import org.LaughingAlpaca.Beverages.Coffee;
import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;

public class CoffeeBuilder implements BeverageBuilder {
    //this stores the beverage being built.
    private final Coffee coffee = new Coffee();

    //this applies the shared beverage options for chaining.
    @Override
    public CoffeeBuilder setSize(SizeType size) {
        coffee.setSize(size);
        return this;
    }

    @Override
    public CoffeeBuilder setMilk(MilkType milk) {
        coffee.setMilk(milk);
        return this;
    }

    @Override
    public CoffeeBuilder setSweetener(SweetenerType sweetener) {
        coffee.setSweetener(sweetener);
        return this;
    }

    @Override
    public CoffeeBuilder setTemperature(TemperatureType temperature) {
        coffee.setTemperature(temperature);
        return this;
    }

    //this returns the finished beverage.
    @Override
    public Coffee build() {
        return coffee;
    }
}

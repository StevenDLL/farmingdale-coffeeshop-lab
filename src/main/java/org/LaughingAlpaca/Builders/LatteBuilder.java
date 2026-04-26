package org.LaughingAlpaca.Builders;

import org.LaughingAlpaca.Beverages.Latte;
import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;

public class LatteBuilder implements BeverageBuilder {
    //this stores the beverage being built.
    private final Latte latte = new Latte();

    //this applies the shared beverage options for chaining.
    @Override
    public LatteBuilder setSize(SizeType size) {
        latte.setSize(size);
        return this;
    }

    @Override
    public LatteBuilder setMilk(MilkType milk) {
        latte.setMilk(milk);
        return this;
    }

    @Override
    public LatteBuilder setSweetener(SweetenerType sweetener) {
        latte.setSweetener(sweetener);
        return this;
    }

    @Override
    public LatteBuilder setTemperature(TemperatureType temperature) {
        latte.setTemperature(temperature);
        return this;
    }

    //this applies espresso shots for this drink.
    public LatteBuilder setShots(int shots) {
        latte.setShotsCount(shots);
        return this;
    }

    //this returns the finished beverage.
    @Override
    public Latte build() {
        return latte;
    }
}

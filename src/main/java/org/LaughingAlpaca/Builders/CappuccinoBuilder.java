package org.LaughingAlpaca.Builders;

import org.LaughingAlpaca.Beverages.Cappuccino;
import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;

public class CappuccinoBuilder implements BeverageBuilder {
    //this stores the beverage being built.
    private final Cappuccino cappuccino = new Cappuccino();

    //this applies the shared beverage options for chaining.
    @Override
    public CappuccinoBuilder setSize(SizeType size) {
        cappuccino.setSize(size);
        return this;
    }

    @Override
    public CappuccinoBuilder setMilk(MilkType milk) {
        cappuccino.setMilk(milk);
        return this;
    }

    @Override
    public CappuccinoBuilder setSweetener(SweetenerType sweetener) {
        cappuccino.setSweetener(sweetener);
        return this;
    }

    @Override
    public CappuccinoBuilder setTemperature(TemperatureType temperature) {
        cappuccino.setTemperature(temperature);
        return this;
    }

    //this applies espresso shots for this drink.
    public CappuccinoBuilder setShots(int shots) {
        cappuccino.setShotsCount(shots);
        return this;
    }

    //this returns the finished beverage.
    @Override
    public Cappuccino build() {
        return cappuccino;
    }
}

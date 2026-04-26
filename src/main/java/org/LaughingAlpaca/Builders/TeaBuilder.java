package org.LaughingAlpaca.Builders;

import org.LaughingAlpaca.Beverages.Tea;
import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;

public class TeaBuilder implements BeverageBuilder {
    //this stores the beverage being built.
    private final Tea tea = new Tea();

    //this applies the shared beverage options for chaining.
    @Override
    public TeaBuilder setSize(SizeType size) {
        tea.setSize(size);
        return this;
    }

    @Override
    public TeaBuilder setMilk(MilkType milk) {
        tea.setMilk(milk);
        return this;
    }

    @Override
    public TeaBuilder setSweetener(SweetenerType sweetener) {
        tea.setSweetener(sweetener);
        return this;
    }

    @Override
    public TeaBuilder setTemperature(TemperatureType temperature) {
        tea.setTemperature(temperature);
        return this;
    }

    //this returns the finished beverage.
    @Override
    public Tea build() {
        return tea;
    }
}

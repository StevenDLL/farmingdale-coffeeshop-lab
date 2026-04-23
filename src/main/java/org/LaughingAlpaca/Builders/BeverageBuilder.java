package org.LaughingAlpaca.Builders;

import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;
import org.LaughingAlpaca.Model.Beverage;

public interface BeverageBuilder {
    BeverageBuilder setSize(SizeType size);

    BeverageBuilder setMilk(MilkType milk);

    BeverageBuilder setSweetener(SweetenerType sweetener);

    BeverageBuilder setTemperature(TemperatureType temperature);

    Beverage build();
}

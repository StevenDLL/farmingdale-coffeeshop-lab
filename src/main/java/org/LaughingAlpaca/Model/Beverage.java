package org.LaughingAlpaca.Model;

import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;

public abstract class Beverage {
    //this stores the shared beverage options.
    private SizeType size;
    private MilkType milk;
    private SweetenerType sweetener;
    private TemperatureType temperature;

    //this lets builders update and read the shared beverage data.
    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public MilkType getMilk() {
        return milk;
    }

    public void setMilk(MilkType milk) {
        this.milk = milk;
    }

    public SweetenerType getSweetener() {
        return sweetener;
    }

    public void setSweetener(SweetenerType sweetener) {
        this.sweetener = sweetener;
    }

    public TemperatureType getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureType temperature) {
        this.temperature = temperature;
    }

    //this formats enum values for clean order output.
    private String formatValue(Enum<?> value) {
        if (value == null) {
            return "Not Set";
        }

        String lowerCaseValue = value.name().toLowerCase();
        return Character.toUpperCase(lowerCaseValue.charAt(0)) + lowerCaseValue.substring(1);
    }

    //this builds the shared beverage description.
    @Override
    public String toString() {
        return String.format(
                "%s: \t [Size: %s, Temperature: %s, Milk: %s, Sweetener: %s]",
                this.getClass().getSimpleName(),
                formatValue(size),
                formatValue(temperature),
                formatValue(milk),
                formatValue(sweetener)
        );
    }
}

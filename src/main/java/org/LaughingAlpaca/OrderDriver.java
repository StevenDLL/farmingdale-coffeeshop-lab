package org.LaughingAlpaca;

import org.LaughingAlpaca.Builders.BeverageBuilder;
import org.LaughingAlpaca.Builders.LatteBuilder;
import org.LaughingAlpaca.Builders.TeaBuilder;
import org.LaughingAlpaca.Enums.MilkType;
import org.LaughingAlpaca.Enums.SizeType;
import org.LaughingAlpaca.Enums.SweetenerType;
import org.LaughingAlpaca.Enums.TemperatureType;
import org.LaughingAlpaca.Factories.BeverageFactory;
import org.LaughingAlpaca.Model.Beverage;
import org.LaughingAlpaca.Model.MobileOrder;
import org.LaughingAlpaca.Model.Order;
import org.LaughingAlpaca.Model.WalkInOrder;

public class OrderDriver {
    public static void main(String[] args) {
        doWalkInExample();
        System.out.println();
        doOnlineExample();
    }

    private static void doWalkInExample() {
        Order walkInOrder = new WalkInOrder();
        Beverage walkInLatte = ((LatteBuilder) BeverageFactory.getBuilder("latte")).setSize(SizeType.MEDIUM).setMilk(MilkType.ALMOND).setShots(2).setSweetener(SweetenerType.SUGAR).setTemperature(TemperatureType.HOT).build();
        Beverage walkInTea = BeverageFactory.getBuilder("tea").setSize(SizeType.SMALL).setSweetener(SweetenerType.HONEY).setTemperature(TemperatureType.HOT).build();
        walkInOrder.addBeverage(walkInLatte);
        walkInOrder.addBeverage(walkInTea);
        walkInOrder.displayOrder();
    }

    private static void doOnlineExample() {
        Order mobileOrder = new MobileOrder();
        Beverage onlineCoffee = BeverageFactory.getBuilder("coffee").setSize(SizeType.LARGE).setMilk(MilkType.WHOLE).setSweetener(SweetenerType.STEVIA).setTemperature(TemperatureType.HOT).build();
        Beverage onlineCappuccino = BeverageFactory.getBuilder("cappuccino").setSize(SizeType.MEDIUM).setSweetener(SweetenerType.NONE).setTemperature(TemperatureType.HOT).build();
        mobileOrder.addBeverage(onlineCoffee);
        mobileOrder.addBeverage(onlineCappuccino);
        mobileOrder.displayOrder();
    }
}
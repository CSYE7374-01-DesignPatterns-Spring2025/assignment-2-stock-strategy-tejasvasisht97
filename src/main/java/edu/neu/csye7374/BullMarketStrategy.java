package edu.neu.csye7374;

import java.util.Random;

public class BullMarketStrategy implements  PriceCalculationStrategy{
    private static BullMarketStrategy instance = new BullMarketStrategy();

    private BullMarketStrategy() {
        
    }

    public static BullMarketStrategy getInstance() {
        return instance;
    }

    @Override
    public void computeNewPrice(Stock stock) {

        stock.price += 10;
    }
}

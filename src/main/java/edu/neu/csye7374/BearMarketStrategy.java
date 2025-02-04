package edu.neu.csye7374;

import java.util.Random;

public class BearMarketStrategy implements PriceCalculationStrategy{
    private static BearMarketStrategy instance = new BearMarketStrategy();

    private BearMarketStrategy() {
        
    }

    public static BearMarketStrategy getInstance() {
        return instance;
    }

    @Override
    public void computeNewPrice(Stock stock) {

        stock.price -= 10;
    }
}

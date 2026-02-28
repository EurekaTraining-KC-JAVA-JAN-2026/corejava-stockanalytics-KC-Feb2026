package com.EurekaAccounts.stocks;


import com.EurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;

public class StocksAnyalitics {
    static void main(String[] args)throws SQLException {
        MarketAnalyticsService marketAnyaliticsService=new MarketAnalyticsService();
        //System.out.println(marketAnyaliticsService.getAllSectors());
        MarketAnalyticsService marketAnyaliticsService2=new MarketAnalyticsService();

       // System.out.println(marketAnyaliticsService2.getSpecificSectors());
        MarketAnalyticsService marketAnyaliticsService3=new MarketAnalyticsService();

        //System.out.println(marketAnyaliticsService3.getAllSubSectors());

        MarketAnalyticsService marketAnyaliticsService4=new MarketAnalyticsService();
       // System.out.println(marketAnyaliticsService4.getAllStockFundamentals());


        //System.out.println(marketAnyaliticsService.getAllSubSectors());
        //System.out.println(marketAnyaliticsService.getAllSectorsMap());
//        System.out.println(marketAnyaliticsService.getTop5HealthCareStocksTraditional());
//        System.out.println(marketAnyaliticsService.getSumOfMktCapOfHealthCareStocks());






        //get the stock price history for tesla for alast 3  months
        marketAnyaliticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now());

    }
}

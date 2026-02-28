package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {

    public static void main(String args[]) throws SQLException {
//        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getAllSector());

//        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService1.getAllSubSectors());

        //MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService1.getAllSubSectorsService());

//        MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService2.getTopFiveStoack());

//        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getFewSectors());

//        MarketAnalyticsService marketAnalyticsService5 = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService5.getLocation());

        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService.getCount());

       // System.out.println(marketAnalyticsService.getAllHealthCareSectors());

       //marketAnalyticsService.getSumOfMarketCapOfHealthCareSectors();
       // System.out.println(marketAnalyticsService.getAllSectorsMap());

       // marketAnalyticsService.getAllSubsectorNameWithId();
       // marketAnalyticsService.getAllSubsectorNameWithId();

       // System.out.println(marketAnalyticsService.getTopHealthCareTikerSymbols());

        //get the stock prise history for tesla for last 3 months.
       //marketAnalyticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now());

       System.out.println(marketAnalyticsService.getAveMarketCap());

    }
}

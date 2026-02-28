package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
        // System.out.println(marketAnalyticsService.getAllSectors());
       // MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService2.getSpecificSectors());
        //MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllSubSectors());
        MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService4.getAllStockFundementals());
        //System.out.println(marketAnalyticsService2.getCount());
       // System.out.println(marketAnalyticsService.getAllHealthCareSectors());
        //marketAnalyticsService.getSumOfMktCapOfHealthCareStocks();
      //  marketAnalyticsService.getMapOfSubSectors();
        //get the stockprice history for Tesla for last 3 months
        MarketAnalyticsService marketAnalyticsService5 = new MarketAnalyticsService();
        //marketAnalyticsService.getTeslaStockPriceHistory();
        //System.out.println(marketAnalyticsService5.getTeslaStockPriceHistory("TSLA" , LocalDate.now()));
        //System.out.println(marketAnalyticsService4.getBlueChipStocks());
        MarketAnalyticsService marketAnalyticsService11 = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService11.getAvgMarketCap());


    }
}
package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {
    static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService.getAllSectors());
        MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService2.getSpecificSectors());
        MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllSubSectors());
        MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService4.getAllStockFundementals());
        MarketAnalyticsService marketAnalyticsService5 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService5.getAppleStock());
        MarketAnalyticsService marketAnalyticsService6 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService5.getTopStockFundementals());
        MarketAnalyticsService marketAnalyticsService7 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService7.getStateCount());
        MarketAnalyticsService marketAnalyticsService8 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService7.getAllHealthCareSectors());
        //marketAnalyticsService8.getSumOfMktCapOfHealthCareStocks();
        //System.out.println(marketAnalyticsService.getAllSectorsMap());
        //System.out.println(marketAnalyticsService.getSubSectorIdGroup());
        MarketAnalyticsService marketAnalyticsService9 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService9.getGroupOfTickerSymbols());
        System.out.println(marketAnalyticsService9.getBlueChipStocks());

    }
}

package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;

public class StockAnalytics {
    static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
        // System.out.println(marketAnalyticsService.getAllSectors());
        MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService2.getSpecificSectors());
        MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService3.getAllSubSectors());
        MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService4.getAllStockFundementals());
        //System.out.println(marketAnalyticsService4.Companydata());
        System.out.println(marketAnalyticsService.getAllHealthCareSectors());

        //get the stockprice history for tesla foe last 3 months
        marketAnalyticsService.getTeslaStockpricehistory("TSLA", LocalDate.now().minusMonths(10));
    }

}
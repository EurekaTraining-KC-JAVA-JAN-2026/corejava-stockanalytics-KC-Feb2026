package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {
    static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getAllSectors());
        MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService2.getSpecificSectors());
        MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService3.getAllSubSectors());
        MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
        System.out.println(marketAnalyticsService4.getAllStockFundementals());
    }
}

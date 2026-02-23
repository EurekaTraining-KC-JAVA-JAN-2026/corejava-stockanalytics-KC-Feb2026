package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
//like user
public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAllSectors());

        MarketAnyaliticsService marketAnalyticsService2 = new MarketAnyaliticsService();
        System.out.println(marketAnalyticsService2.getAllSubSectors());

        MarketAnyaliticsService marketAnalyticsService3 = new MarketAnyaliticsService();
        System.out.println(marketAnalyticsService3.getAllStockFundementals());
    }
}
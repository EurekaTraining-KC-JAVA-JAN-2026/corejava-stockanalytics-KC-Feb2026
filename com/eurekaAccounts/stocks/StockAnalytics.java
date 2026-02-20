package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {

    public static void main(String args[]) throws SQLException {

        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService.getAllSubSectors());

        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService1.getAllSubSectorsService());
    }
}

package com.eurekaAccount.stocks;

import com.eurekaAccount.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {

    public static void main(String args[]) throws SQLException {

        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService.getAllSubSectors());

        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService1.getAllSubSectorsService());

        MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService2.getAllStockFundamental());
    }

}
package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {

    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService.getAllSectors());
        //calling market analytics of getallsectors

        MarketAnalyticsService marketAnalyticsService1= new MarketAnalyticsService();
        System.out.println(marketAnalyticsService1.getAllSubSectors());
    }
}



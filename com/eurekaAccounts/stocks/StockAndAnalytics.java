package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;


import java.sql.SQLException;

public class StockAndAnalytics {
    public static void main(String[] args) throws SQLException {

        MarketAnalyticsService service = new MarketAnalyticsService();
        System.out.println(service.getAllSectorsService());


        MarketAnalyticsService service2 = new MarketAnalyticsService();
        System.out.println(service2.getAllSubSectorsService());
    }
}

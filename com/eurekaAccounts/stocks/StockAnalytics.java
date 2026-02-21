package com.eurekaAccounts.stocks;



import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.util.Map;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        System.out.println(marketAnalyticsService.getAllSectors());
        System.out.println(marketAnalyticsService.getAllSubSectors());
        System.out.println("Stock Fundamentals sorting market cap in descending \n");
        System.out.println(marketAnalyticsService.getAllStockFundamentals());
    }
}

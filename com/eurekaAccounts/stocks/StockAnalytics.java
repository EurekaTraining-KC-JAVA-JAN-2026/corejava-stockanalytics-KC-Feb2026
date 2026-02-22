package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {
    public static void main(String[] args) {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getAllSectors());

        System.out.println(marketAnalyticsService.getAllSubSectors());
//        System.out.println(marketAnalyticsService.getAllStockFundamentals());

    }
}

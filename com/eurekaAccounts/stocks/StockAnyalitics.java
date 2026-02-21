package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
//like user
public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService2 = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService3 = new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAllSectors());
        System.out.println(marketAnyaliticsService2.getAllSubSectors());
        System.out.println(marketAnyaliticsService3.getAllStockFundementals());
    }
}

package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
//like user
public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAllSectors());
        System.out.println(marketAnyaliticsService.getAllSubSectors());
    }
}

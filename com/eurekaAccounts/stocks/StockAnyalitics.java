package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;

public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAllSectorsService());

        MarketAnyaliticsService marketAnyaliticsService1 = new MarketAnyaliticsService();
        //System.out.println(marketAnyaliticsService1.getAllSubSectorsService());
    }
}

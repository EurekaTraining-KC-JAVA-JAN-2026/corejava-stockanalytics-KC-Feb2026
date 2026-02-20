package com.EurekaAccounts.stocks;

import com.EurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;

public class StocksAnyalitics {
    static void main(String[] args)throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService=new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAllSectors());
        System.out.println(marketAnyaliticsService.getAllSubSectors());

    }
}

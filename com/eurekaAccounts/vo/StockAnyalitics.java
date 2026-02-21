package com.eurekaAccounts.vo;

import com.eurekaAccounts.service.MarketAnyaliticsservices;

import java.sql.SQLException;

public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsservices marketAnyaliticsservices = new MarketAnyaliticsservices();
        System.out.println(marketAnyaliticsservices.getAllSectors());
        MarketAnyaliticsservices marketAnyaliticsservices2 = new MarketAnyaliticsservices();
        System.out.println(marketAnyaliticsservices2.getSpecificSectors());
        MarketAnyaliticsservices marketAnyaliticsservices3 = new MarketAnyaliticsservices();
        System.out.println(marketAnyaliticsservices3.getAllSubSectors());
        MarketAnyaliticsservices marketAnyaliticsservices4 = new MarketAnyaliticsservices();
        //System.out.println(marketAnyaliticsservices4.getAllStockFundementals());

    }
}

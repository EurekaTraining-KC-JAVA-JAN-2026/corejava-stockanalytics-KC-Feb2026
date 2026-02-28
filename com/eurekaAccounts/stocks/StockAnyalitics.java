package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
import java.time.LocalDate;

public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
       // System.out.println(marketAnyaliticsService.getAllSectorsService());

        MarketAnyaliticsService marketAnyaliticsService1 = new MarketAnyaliticsService();
        //System.out.println(marketAnyaliticsService1.getAllSubSectorsService());

        MarketAnyaliticsService marketAnyaliticsService2 = new MarketAnyaliticsService();
        //System.out.println(marketAnyaliticsService2.getStockFundamentals());

        //System.out.println(marketAnyaliticsService1.getAllHealthCareSectors());
        //marketAnyaliticsService.getSumOfMktCapOfHealthCareStocks();
        //System.out.println(marketAnyaliticsService.getAllSectorsMap());
        marketAnyaliticsService1.getMapOfSubSectors();

        //get the stockprice history for tesla for last 3 months
        //marketAnyaliticsService1.getTelsaStockPriceHistory("TSLA", LocalDate.now().minusYears(2));
        //get the avg marketCap for each sector
    }
}

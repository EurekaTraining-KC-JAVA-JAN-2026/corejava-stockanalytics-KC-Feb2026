package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService.getAllSectorsService());

        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService1.getAllSubSectorsService());

        MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();

       // System.out.println(marketAnalyticsService2.getStockFundamental());
        //MarketAnalyticsService marketAnalyticsService3 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllStockLookUpsService());

        MarketAnalyticsService marketAnalyticsService4 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService4.getCompanyLocationService());

        //MarketAnalyticsService marketAnalyticsService5 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService1.getAllHealthCareSectors());
        //marketAnalyticsService.getSumOfMktCapOfHealthCareStocks();

        //System.out.println(marketAnalyticsService2.getAllSectorsMap());

        //get the stockprice history for tesla for last 3 months
      marketAnalyticsService1.getTeslaStockPriceHistory("TSLA", LocalDate.now());

        List<String> allBlueChipTickers = marketAnalyticsService2.getAllBlueTickers();
        System.out.println(allBlueChipTickers);


    }
}

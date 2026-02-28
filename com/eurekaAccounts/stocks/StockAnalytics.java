package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException{
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService.getAllSectorService());

        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService1.getAllSubSectorsService());

        //MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();

        //System.out.println(marketAnalyticsService2.getStockFundamentals());

        //MarketAnalyticsService marketAnalyticsService3 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllCompanyLocationsService());

        //System.out.println(marketAnalyticsService1.getAllHealthCareSectors());
        //marketAnalyticsService.getSumOfMktCapOfHealthCareStocks();
        //System.out.println(marketAnalyticsService.getAllSectorsMap());

        //bluechipTickers
        List<String> allBlueChipTickers = marketAnalyticsService1.getAllBlueChipTickers();
        System.out.println(allBlueChipTickers);
        //get the stock price history for tesla for last 3 months
        //marketAnalyticsService1.getTeslaStockPriceHistory("TSLA", LocalDate.now());

        //get the avg marketCap for each sector-- map of integers and bigdecimal
    }
}

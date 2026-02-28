package com.eurekaAccounts.stocks;



import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        /*System.out.println(marketAnalyticsService.getAllSectors());
        System.out.println(marketAnalyticsService.getAllSubSectors());
        System.out.println("Stock Fundamentals sorting market cap in descending \n");
        System.out.println(marketAnalyticsService.getAllStockFundamentals());*/

        //System.out.println(marketAnalyticsService.getAllLocations());
        System.out.println(marketAnalyticsService.getAllHealthCareSectors());
        marketAnalyticsService.getSumOfMktCapOfHealthCarestocks();
        Map<Integer, String> allSectorsMap = marketAnalyticsService.getAllSectorsMap();
        System.out.println(allSectorsMap);
        Map<Integer, List<String>> allStockFundamentalsMap = marketAnalyticsService.getAllStockFundamentalsMap();
        System.out.println(allStockFundamentalsMap);
        System.out.println("blue chip companies");
        System.out.println(marketAnalyticsService.getBlueChipTickers());

        System.out.println("last 3 months tesla stocks");
        //get the stock price history for tesla for the last 3 months
        System.out.println(marketAnalyticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now().minusMonths(7)));

        System.out.println("Avg of MarketCaps");
        System.out.println(marketAnalyticsService.getAvgMarketCap());

        //get the avg market cap of each sector id

    }
}

package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class StockAnalytics {
    static void main(String[] args) throws SQLException {
       MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
        // System.out.println(marketAnalyticsService.getAllSectors());
        //MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService2.getSpecificSectors());
        //MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllSubSectors());
        //MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService4.getAllStockFundementals());**/

       // MarketAnalyticsService marketAnalyticsService1=new MarketAnalyticsService();
       // System.out.println((marketAnalyticsService.getAllHealthCareSectors()));
        // marketAnalyticsService.getSumOfMktCapOfHealthCareStocks();


        //Map<Integer, String> allSectorsMap = marketAnalyticsService.getAllSectorsMap();

       // System.out.println(allSectorsMap);

       // Map<BigDecimal, List<String>> allSubSectorsMap = marketAnalyticsService.getAllSubSectorsMap();

        //System.out.println(allSubSectorsMap);
       // List<String> allBlueChipTickers = marketAnalyticsService.getAllBlueChipTickers();
        //System.out.println(allBlueChipTickers);

        //get the stockprice history for tesla for last 3 months
        marketAnalyticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now().minusMonths(12));
    }
}







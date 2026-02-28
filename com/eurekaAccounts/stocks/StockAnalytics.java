package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;
import java.time.LocalDate;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getAllSectors());

//        System.out.println(marketAnalyticsService.getAllSubSectors());
//        System.out.println(marketAnalyticsService.getAllStockFundamentals());
//        System.out.println(marketAnalyticsService.getallcomp());
//        System.out.println(marketAnalyticsService.getallstatecount());
//        System.out.println(marketAnalyticsService.getAllhealthSectors());
//        marketAnalyticsService.getSumofMktcapofHealthStocks();
//        System.out.println(marketAnalyticsService.getAllSectorsMap());
//        System.out.println(marketAnalyticsService.getallBluechipHealthStocks());
//        System.out.println(marketAnalyticsService.getSubSectorMap());
//        System.out.println(marketAnalyticsService.getallSubSectorsMap());
//        System.out.println(marketAnalyticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now().minusMonths(12)));
//        System.out.println(marketAnalyticsService.getallsph());
        System.out.println(marketAnalyticsService.getallSectoravgMktCap());


    }
}

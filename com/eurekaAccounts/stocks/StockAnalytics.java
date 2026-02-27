package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.SQLException;
import java.util.List;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
        MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();
        //String sectors = marketAnalyticsService.getAllSectorService();
        //System.out.println(sectors);
//        System.out.println(marketAnalyticsService1.getAllSubSectorService());
//        System.out.println(marketAnalyticsService2.getStockFundamentals());
        //System.out.println(marketAnalyticsService2.getAllHealthCareSectors());
        //marketAnalyticsService2.getSumOfMktCapOfHealthCareStocks();
        //System.out.println(marketAnalyticsService2.getAllSubSectorsMap());
        //System.out.println( marketAnalyticsService2.getGroupOfTickerSymbols());
        System.out.println(marketAnalyticsService2.getBlueChipTickerSymbols());
    }
}

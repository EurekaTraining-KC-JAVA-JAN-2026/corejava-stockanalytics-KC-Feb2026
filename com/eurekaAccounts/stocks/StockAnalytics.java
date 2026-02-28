package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;
import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
import java.time.LocalDate;

//like user
public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
//       MarketAnalyticsService marketAnaliticsService = new MarketAnaliticsService();
//       // System.out.println(marketAnyaliticsService.getAllSectors());
//
//        MarketAnalyticsService marketAnalyticsService2 = new MarketAnaliticsService();
//       // System.out.println(marketAnalyticsService2.getAllSubSectors());
//
//        MarketAnalyticsService marketAnalyticsService3 = new MarketAnyaliticsService();
//       // System.out.println(marketAnalyticsService3.getAllStockFundementals());
//
//        MarketAnalyticsService marketAnalyticsService14 = new MarketAnyaliticsService();
//       // System.out.println(marketAnyaliticsService4.getLookUpCompanyLocationsDAO());

//        MarketAnyaliticsService marketAnaliticsService11 = new MarketAnyaliticsService();
////        System.out.println(marketAnyaliticsService11.getCountOfStates());
////          System.out.println(marketAnaliticsService11.getAllHealthSector());
// //         System.out.println(marketAnaliticsService11.getAllSectorsMap());
//        System.out.println(marketAnaliticsService11.getBlueChipHealthcareMap());

        // get stockprice history for tesla for last 3 months
      //  MarketAnyaliticsService.getTeslaStockPriceHistory("TSLA", LocalDate.now().minusMonths(11));
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        System.out.println(marketAnyaliticsService.getAverageMarketCapBySector());
}}
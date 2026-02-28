package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StockAnalytics {
    static void main(String[] args) throws SQLException {
        MarketAnalyticsService marketAnalyticsService =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService.getAllSectors());
        MarketAnalyticsService marketAnalyticsService2 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService2.getSpecificSectors());
        MarketAnalyticsService marketAnalyticsService3 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService3.getAllSubSectors());
        MarketAnalyticsService marketAnalyticsService4 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService4.getAllStockFundementals());

        MarketAnalyticsService marketAnalyticsService5 =  new MarketAnalyticsService();
//        System.out.println(marketAnalyticsService5.getLookUpCompany());
//        System.out.println(marketAnalyticsService5.getAllHealthCAreSectors());
//      marketAnalyticsService5.getSumofMaktCapofHelathCareStocks();
//
        //System.out.println(marketAnalyticsService5.getAllSectors());
//        System.out.println(marketAnalyticsService3.getAllTopHealthSectorTickers());


        //get StockPrice History for Tesla for last 3 months
        //marketAnalyticsService5.getTeslaStockPriceHistory ("TSLA", LocalDate.now());
        System.out.println(marketAnalyticsService5.getTeslaStockPriceHistory());
    }
}

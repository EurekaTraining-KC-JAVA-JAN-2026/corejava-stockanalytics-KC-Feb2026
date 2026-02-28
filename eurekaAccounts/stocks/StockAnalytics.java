package eurekaAccounts.stocks;

import eurekaAccounts.stocks.service.MarketAnalyticsService;

import java.sql.SQLException;

public class StockAnalytics {
    public static void main(String[] args) throws SQLException {
//        MarketAnalyticsService marketAnalyticsService = new MarketAnalyticsService();
//       System.out.println(marketAnalyticsService.getAllSectorsService());

        MarketAnalyticsService marketAnalyticsService1 = new MarketAnalyticsService();
      //  System.out.println(marketAnalyticsService1.getAllSubSectorsService());

        MarketAnalyticsService marketAnalyticsService2 = new MarketAnalyticsService();
      //System.out.println(marketAnalyticsService2.getStockFundamental());

       // MarketAnalyticsService marketAnalyticsService3 = new MarketAnalyticsService();
        //System.out.println(marketAnalyticsService3.getAllCompanyLocations());
        System.out.println(marketAnalyticsService1.getAllStockFundamentals());
        marketAnalyticsService1.getSumOfMarketCapOfHealthCareStocks();


        //get the market cap of each sector

    }
}
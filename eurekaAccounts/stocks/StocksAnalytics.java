package eurekaAccounts.stocks;

import eurekaAccounts.stocks.Service.MarketAnalyticsService;

import java.sql.SQLException;

public class StocksAnalytics {
     public static void main(String[] args) throws SQLException {
//         MarketAnalyticsService marketAnalyticsService=new MarketAnalyticsService();
//         System.out.println(marketAnalyticsService.getAllSectorsServices());

          MarketAnalyticsService marketAnalyticsService1=new MarketAnalyticsService();
          //System.out.println(marketAnalyticsService1.getALlSubSectorServices());
         //System.out.println(marketAnalyticsService1.getCompanyLocationServices());

         //System.out.println(marketAnalyticsService1.getAllstockfundamentalsService());
         System.out.println(marketAnalyticsService1.getCompanyLocationServices());


//          MarketAnalyticsService marketAnalyticsService2=new MarketAnalyticsService();
//         System.out.println(marketAnalyticsService2.getAllstockfundamentalsService());



    }
}

package Eurekaaccounts.stocks;

import Eurekaaccounts.stocks.service.MarketAnalyticsservice;

import java.sql.SQLException;
import java.time.LocalDate;

public class StockAnalytics {
   public static void main(String[] args) throws SQLException {
//       MarketAnalyticsservice marketAnalyticsservice=new MarketAnalyticsservice();
//       System.out.println(marketAnalyticsservice.getAllsectorservices());
//
//       MarketAnalyticsservice marketAnalyticsservice1=new MarketAnalyticsservice();
//       System.out.println(marketAnalyticsservice1.getAllsubsectorservices());
//       MarketAnalyticsservice marketAnalyticsservice12=new MarketAnalyticsservice();
//       System.out.println(marketAnalyticsservice12.getspecifclocation());


//
       MarketAnalyticsservice marketAnalyticsservice2=new MarketAnalyticsservice();
//       System.out.println(marketAnalyticsservice2.getstockfundamental());
//       System.out.println(marketAnalyticsservice2. getallhealthsector());
//       System.out.println(marketAnalyticsservice2.getsumofmarketcapofhealthcarestocks());
//       System.out.println(marketAnalyticsservice2.getallsectorMap());
       System.out.println(marketAnalyticsservice2.getbluechiphealthcaresector());
 //get the stockprice history for telsa last three months
//       marketAnalyticsservice2.getallhealthsector("TESLA", LocalDate.now());
//       System.out.println(marketAnalyticsservice2.getallstockpricehistoryy());
       //market cap of average for each sector list of sector correspoint key sector id value marketcap map(integer,bigdecimal
    }
}

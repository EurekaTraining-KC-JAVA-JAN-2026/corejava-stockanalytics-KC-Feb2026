package Eurekaaccounts.stocks;

import Eurekaaccounts.stocks.service.MarketAnalyticsservice;

import java.sql.SQLException;

public class StockAnalytics {
   public static void main(String[] args) throws SQLException {
       MarketAnalyticsservice marketAnalyticsservice=new MarketAnalyticsservice();
       System.out.println(marketAnalyticsservice.getAllsectorservices());

       MarketAnalyticsservice marketAnalyticsservice1=new MarketAnalyticsservice();
       System.out.println(marketAnalyticsservice1.getAllsubsectorservices());

    }
}

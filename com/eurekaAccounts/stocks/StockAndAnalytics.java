package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnalyticsService;


import java.sql.SQLException;
import java.time.LocalDate;

public class StockAndAnalytics {
    public static void main(String[] args) throws SQLException {

        MarketAnalyticsService service = new MarketAnalyticsService();
        System.out.println(service.getAllSectorsService());

//
//        MarketAnalyticsService service2 = new MarketAnalyticsService();
//        System.out.println(service2.getAllSubSectorsService());
//
//        service2.getAStockWithReq();
//
//        System.out.println(service2.getAStockWithReq());
//
////        service2.getAllHealthCareSectors();
//
//
//
//        //System.out.println(service.getAllStockFundamentalsService());
//
//        System.out.println(service.getAllSectorsMap());
//
//        System.out.println(service.getAllSubSectorsMap());

        service.getAllStocksBlue();

        service.getStockPriceHistoryStocks("TSLA",LocalDate.now().minusMonths(10));

        //get the stock price history for tesla for last 3 months



    }
}

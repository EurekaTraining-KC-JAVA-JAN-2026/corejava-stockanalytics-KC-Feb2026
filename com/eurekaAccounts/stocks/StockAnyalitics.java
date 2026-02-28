package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocks.service.MarketAnyaliticsService;

import java.sql.SQLException;
import java.time.LocalDate;

//like user
public class StockAnyalitics {
    public static void main(String[] args) throws SQLException {
        MarketAnyaliticsService marketAnyaliticsService = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService2 = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService3 = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService4 = new MarketAnyaliticsService();
        MarketAnyaliticsService marketAnyaliticsService5 = new MarketAnyaliticsService();
       // System.out.println(marketAnyaliticsService.getAllSectors());
      //  System.out.println(marketAnyaliticsService2.getAllSubSectors());
    //    System.out.println(marketAnyaliticsService3.getAllStockFundementals());
      // MarketAnyaliticsService marketAnyaliticsService4 = new MarketAnyaliticsService();
      //  System.out.println(marketAnyaliticsService4.getallSectorsFromPractise());
      //  System.out.println(marketAnyaliticsService4.getAllCompanyLocations());
      //  System.out.println(marketAnyaliticsService4.getStatesCount());
        //System.out.println("Checking for healthSectors");
        //System.out.println(marketAnyaliticsService4.getAllHealthcareSectors());
        //System.out.println(marketAnyaliticsService4.getAllHealthcareSectors());
        //marketAnyaliticsService4.getSumOfMarketCapofHealthcareStocks();
       // System.out.println(marketAnyaliticsService4.getAllSectorsMAp());
        System.out.println(marketAnyaliticsService4.getBlueChipHealthcareSectors());
        System.out.println(marketAnyaliticsService4.getStockPriceHistory("TSLA",LocalDate.now()));
    }
}

package com.eurekaAccounts.MarketCap.Control;

import com.eurekaAccounts.MarketCap.Service.MarketCapService;

import java.sql.SQLException;

public class MarketCapControl {

    public static void main(String[] args) throws SQLException {
        MarketCapService marketCapService = new MarketCapService();
        //System.out.println(marketCapService.getHighestMarketCap());
        //System.out.println(marketCapService.getCompanyLocation());
        System.out.println(marketCapService.getHighestMarketCap());
        System.out.println(marketCapService.getNumberOfStates());
        System.out.println(marketCapService.getCount());
    }
}

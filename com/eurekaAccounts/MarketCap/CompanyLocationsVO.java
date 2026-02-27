package com.eurekaAccounts.MarketCap;

public class CompanyLocationsVO {

    private String tickerSymbol;
    private String address;

    public CompanyLocationsVO() {
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


package com.eurekaAccounts.stocks.vo;

public class CompanyLocationsVO {

    public String tickerSymbol;
    public String address;
    public String zip;

    public CompanyLocationsVO(String tickerSymbol, String address, String zip) {
        this.tickerSymbol = tickerSymbol;
        this.address = address;
        this.zip = zip;
    }

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}

package com.eurekaAccounts.stocks.vo;

public class CompanyLocationsVO {
    public CompanyLocationsVO() {
    }
    public String ticker_symbol;
    public String address;
    public String city;
    public String zip;

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}' +'\n';
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class CompanyLocationsVO {
    public String tickerSymbol;
    public String address;
    public String city;
    public String state;
    public BigDecimal zipCode;

    public CompanyLocationsVO(String tickerSymbol, String address, String city, String state, BigDecimal zipCode) {
        this.tickerSymbol = tickerSymbol;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getZipCode() {
        return zipCode;
    }

    public void setZipCode(BigDecimal zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "ComanyLocationsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}

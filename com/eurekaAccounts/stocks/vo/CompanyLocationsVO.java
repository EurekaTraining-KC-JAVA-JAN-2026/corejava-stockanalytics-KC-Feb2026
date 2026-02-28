package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class CompanyLocationsVO {
    public String ticker_symbol;
    public String address;
    public String city;
    public String state;
    public BigDecimal zipcode;
    public String country;

    public CompanyLocationsVO() {
    }

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }

    public CompanyLocationsVO(String ticker_symbol, String address, String city, String state, BigDecimal zipcode, String country) {
        this.ticker_symbol = ticker_symbol;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getZipcode() {
        return zipcode;
    }

    public void setZipcode(BigDecimal zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

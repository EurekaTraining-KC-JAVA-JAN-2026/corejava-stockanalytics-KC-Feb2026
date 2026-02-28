package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class CompanyLocationsVO {
    private String tickerSymbol;
    private String address;
    private String city;
    private String state;
    private String country;
    private BigDecimal zip;

    public CompanyLocationsVO() {

    }

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}'+"\n";
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getZip() {
        return zip;
    }

    public void setZip(BigDecimal zip) {
        this.zip = zip;
    }

    public CompanyLocationsVO(String tickerSymbol, String address, String city, String state, String country, BigDecimal zip) {
        this.tickerSymbol = tickerSymbol;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }


}

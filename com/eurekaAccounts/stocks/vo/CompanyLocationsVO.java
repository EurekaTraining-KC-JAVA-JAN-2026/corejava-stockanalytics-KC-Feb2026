package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class CompanyLocationsVO {
    public String tickerSymbol;
    public String adress;
    public String city;
    public String state;
    public BigDecimal Zipcode;
    public  String country;

    @Override
    public String toString() {
        return "CompanyLocationsVO{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Zipcode=" + Zipcode +
                ", country='" + country + '\'' +
                '}';
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
        return Zipcode;
    }

    public void setZipcode(BigDecimal zipcode) {
        Zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CompanyLocationsVO(String tickerSymbol, String adress, String city, String state, BigDecimal zipcode, String country) {
        this.tickerSymbol = tickerSymbol;
        this.adress = adress;
        this.city = city;
        this.state = state;
        Zipcode = zipcode;
        this.country = country;
    }
}

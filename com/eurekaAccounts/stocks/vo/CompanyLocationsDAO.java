package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class CompanyLocationsDAO {
    String ticker_symbol;
    String address;
    String State;
    BigDecimal zip;
    String country;

    @Override
    public String toString() {
        return "CompanyLocationsDAO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", address='" + address + '\'' +
                ", State='" + State + '\'' +
                ", zip=" + zip +
                ", country='" + country + '\'' +
                '}';
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

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public BigDecimal getZip() {
        return zip;
    }

    public void setZip(BigDecimal zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

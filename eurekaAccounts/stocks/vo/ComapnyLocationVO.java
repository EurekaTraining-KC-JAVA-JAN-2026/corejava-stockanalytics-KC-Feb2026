package eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class ComapnyLocationVO {
    public String ticker_symbol;
    public String address;

    public ComapnyLocationVO(String address) {
        this.address = address;
    }

    public String city;
    public String state;

    @Override
    public String toString() {
        return "ComapnyLocationVO{" +
                "address='" + address + '\'' +
                '}';
    }

    public BigDecimal Zip;
    public String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public BigDecimal getZip() {
        return Zip;
    }

    public void setZip(BigDecimal zip) {
        Zip = zip;
    }



    public ComapnyLocationVO(String address, String city, String country, String state, String ticker_symbol, BigDecimal zip) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.state = state;
        this.ticker_symbol = ticker_symbol;
        Zip = zip;
    }

}

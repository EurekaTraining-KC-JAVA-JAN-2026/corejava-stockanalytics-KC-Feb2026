package com.eurekaAccounts.stocks.stocksVO;

public class CompanyLocationVO {
    public CompanyLocationVO(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int count;
    public CompanyLocationVO(String tickersymbol, String state, String city, Integer zip) {
        this.tickersymbol = tickersymbol;
        this.state = state;
        this.city = city;
        this.zip= zip;

    }

    public CompanyLocationVO() {

    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    String tickersymbol;
    String state;
    String city;
    Integer zip;

    @Override
    public String toString() {
        return "CompanyLocationVO{" +
//                "tickersymbol='" + tickersymbol + '\'' +
//                ", state='" + state + '\'' +
//                ", city='" + city + '\'' +
//                ", zip=" + zip +
                ",count="+count+
                '}';
    }


}

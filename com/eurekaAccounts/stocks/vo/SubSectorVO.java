package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class SubSectorVO implements Comparable<SubSectorVO>{
    public String subsectorName;
    public int subsectorId;
    public int sectorid;
    public String address;
    public String city;
    public String state;
    public int zip;
    public int count;
    public int sectorId;

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "marketcap=" + marketcap +
                ", tickername='" + tickername + '\'' +
                ", tickersymbol='" + tickersymbol + '\'' +
                ", sectorid=" + sectorid +
                ", subsectorId=" + subsectorId +
                '}';
    }

    public String tickersymbol;

    public String getTickername() {
        return tickername;
    }

    public void setTickername(String tickername) {
        this.tickername = tickername;
    }

    public String tickername;


    public SubSectorVO(String tickername){
        this.tickername=tickername;

    }
//    public SubSectorVO(String address) {
//        this.address = address;
//    }


    public BigDecimal marketcap;

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public BigDecimal getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(BigDecimal marketcap) {
        this.marketcap = marketcap;
    }



    public SubSectorVO(String tickersymbol, BigDecimal marketcap) {
        this.tickersymbol = tickersymbol;
        this.marketcap = marketcap;
    }




    public SubSectorVO(String city, String state, int zip, String country) {
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String country;





    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public SubSectorVO(String subsectorName, int subsectorId, int sectorid) {
        this.subsectorName = subsectorName;
        this.subsectorId = subsectorId;
        this.sectorid = sectorid;
    }

    public SubSectorVO() {
    }

    public String getSubsectorName() {
        return subsectorName;
    }

    public void setSubsectorName(String subsectorName) {
        this.subsectorName = subsectorName;
    }

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
    }

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subsectorName.compareTo(o.getSubsectorName());
    }

    public void setCount(int count) {
    }
}
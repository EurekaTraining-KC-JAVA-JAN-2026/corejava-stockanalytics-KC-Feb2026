package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int subSectorId;
    public String subSectorName;
    public int sectorId;

    public String ticker_name;

    public String getTicker_name() {
        return ticker_name;
    }

    public void setTicker_name(String ticker_name) {
        this.ticker_name = ticker_name;
    }

    public SubSectorVO() {
    }



    @Override
    public String toString() {
        return "SubSectorVO{" + "\n" +
                "sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", sunSectorName='" + subSectorName + '\'' +
                ", ticker_name='" + ticker_name+'\n'+
                '}'+'\n';
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public SubSectorVO(int sectorId, int subSectorId, String sunSectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.subSectorName = sunSectorName; // fixed
    }

    public SubSectorVO(int subSectorId, String subSectorName, String ticker_name) {
        this.subSectorId = subSectorId;
        this.subSectorName = subSectorName;
        this.ticker_name = ticker_name;
    }
}
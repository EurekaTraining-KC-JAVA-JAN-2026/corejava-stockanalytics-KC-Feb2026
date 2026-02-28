package com.eurekaAccounts.stocks.vo;

import java.math.BigDecimal;

public class SectorVO implements Comparable<SectorVO>{
    public int sectorId;
    public String sectorName;
    public BigDecimal marketcap;
    public  String tickername;
    public int subsectorid;

    public int getSubsectorid() {
        return subsectorid;
    }

    public void setSubsectorid(int subsectorid) {
        this.subsectorid = subsectorid;
    }

    public String getTickername() {
        return tickername;
    }

    public void setTickername(String tickername) {
        this.tickername = tickername;
    }

    public BigDecimal getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(BigDecimal marketcap) {
        this.marketcap = marketcap;
    }

    @Override
    public String toString() {
        return "SectorVO{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                ", marketcap=" + marketcap +
                ", tickername='" + tickername + '\'' +
                ", subsectorid=" + subsectorid +
                '}';
    }



    public SectorVO(BigDecimal marketcap, String tickername, int subsectorid) {
        this.marketcap = marketcap;
        this.tickername = tickername;
        this.subsectorid = subsectorid;
    }



    public SectorVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVO() {
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public int compareTo(SectorVO o) {
        //return o.sectorId > this.getSectorId()
        if(o.sectorId > this.getSectorId()){
            return 1;
        } else if (o.sectorId < this.getSectorId()) {
            return -1;
        }else {
            return 0;
        }
    }
}
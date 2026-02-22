package com.eurekaAccounts.stocks.stocksVO;

public class SectorVO implements Comparable <SectorVO>{
    public SectorVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVO() {

    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public int getSectorId() {
        return this.sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int sectorId;
    public String sectorName;

    @Override
    public String toString() {
        return "StocksVO{" +
                "sectorId=" + sectorId +
                ", sectorName=" + sectorName +
                '}';
    }


    @Override
    public int compareTo(SectorVO o) {
        if(o.sectorId > this.getSectorId()) {
            return 1;
        }
        else if (o.sectorId < this.getSectorId()) {
            return -1;
        }else {
            return 0;
        }
    }
}

package com.eurekaAccounts.stocksVO;

public class SectorVO {
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

    public int getSectorId(int sectorId) {
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


}

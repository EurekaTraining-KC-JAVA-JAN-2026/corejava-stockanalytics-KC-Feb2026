package com.eurekaAccounts.stocks.vo;

public class SectorVO {
    public int sectorId;
    public String sectorName;

    public SectorVO() {

    }

    public SectorVO(int sectorId, String subsectorName, int subsectorId) {
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

    public SectorVO(String sectorName) {
        this.sectorName = sectorName;

    }

    @Override
    public String toString() {
        return "SectorVO{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }
}

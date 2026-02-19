package com.eurekaAccounts.stocks.vo;

public class SectorVO {
    public String sectorName;
    public int sectorId;

    public SectorVO(String sectorName, int sectorId) {
        this.sectorName = sectorName;
        this.sectorId = sectorId;
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
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    @Override
    public String toString() {
        return "SectorVO{" +
                "sectorName='" + sectorName + '\'' +
                ", sectorId=" + sectorId +
                '}'+'\n';
    }
}

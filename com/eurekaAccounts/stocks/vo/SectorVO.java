package com.eurekaAccounts.stocks.vo;

public class SectorVO {
    public int sectorId;
    public String sectorName;

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
    public String toString() {
        return "sectorVO{" +
                "sectorId=" + sectorId +
                ", sectorName=" + sectorName  +
                '}'+ "\n";
    }
}

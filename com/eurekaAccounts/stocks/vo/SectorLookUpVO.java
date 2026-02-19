package com.eurekaAccounts.stocks.vo;

public class SectorLookUpVO {
    public int sectorId;
    public String sectorName;

    public SectorLookUpVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "SectorLookUp{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}' + '\n';
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

    public SectorLookUpVO() {
    }
}

package com.eurekaAccounts.stocks.vo;

public class SectLookVO {
    public int sectorId;
    public String sectorName;

    public SectLookVO() {
    }

    public SectLookVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
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
        return "SectLook{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}'+'\n';
    }
}





package com.eurekaAccounts.stocks.vo;

public class SectorVO {
    public int sectorId;
    public String sectorName;
    public int subsectorId;

    public SectorVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVO(int subsectorId, String sectorName, int sectorId) {
        this.subsectorId = subsectorId;
        this.sectorName = sectorName;
        this.sectorId = sectorId;
    }

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
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
        return "SectorVO{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                ", subsectorId=" + subsectorId +
                '}'+"\n";
    }
}

package com.eurekaAccounts.stocks.vo;

public class SubSector {
    public int subsectorId;
    public String subSectorName;

    public SubSector() {
    }

    public int sectorId;
    public int getSubsectorId() {
        return subsectorId;
    }

    @Override
    public String toString() {
        return "SubSector{" +
                "subsectorId=" + subsectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}' +'\n';
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }


}

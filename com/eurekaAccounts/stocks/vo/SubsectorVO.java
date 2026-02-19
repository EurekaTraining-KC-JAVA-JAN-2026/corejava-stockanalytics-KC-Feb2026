package com.eurekaAccounts.stocks.vo;

public class SubsectorVO {

    public int subSectorId;
    public String subSectorName;
    public int sectorId;

    public SubsectorVO() {
    }

    public SubsectorVO(int subSectorId, String subSectorName, int sectorId) {
        this.subSectorId = subSectorId;
        this.subSectorName = subSectorName;
        this.sectorId = sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
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

    @Override
    public String toString() {
        return "SubsectorVO{" +
                "subSectorId=" + subSectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}' + '\n';
    }
}

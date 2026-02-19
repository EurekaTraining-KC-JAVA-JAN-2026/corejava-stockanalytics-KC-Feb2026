package com.eurekaAccounts.stocks.vo;

public class SubsectorVO {
    public int subSectorId;
    public String subSectorName;
    public int sectorId;

    public SubsectorVO(int subSectorId, String sectorName, int sectorId) {
        this.subSectorId = subSectorId;
        this.subSectorName = sectorName;
        this.sectorId = sectorId;
    }

    public SubsectorVO() {
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public String getSectorName() {
        return subSectorName;
    }

    public void setSectorName(String sectorName) {
        this.subSectorName = sectorName;
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
                ", sectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}'+'\n';
    }

    public void subSectorName(String subsectorName) {
    }
}

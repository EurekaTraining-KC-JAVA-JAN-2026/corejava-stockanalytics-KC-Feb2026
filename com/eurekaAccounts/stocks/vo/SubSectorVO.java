package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO>{
    public String subSectorName;
    public int subSectorId;
    public int sectorId;

    public SubSectorVO(String subSectorName, int subSectorId, int sectorId) {
        this.subSectorName = subSectorName;
        this.subSectorId = subSectorId;
        this.sectorId = sectorId;
    }

    public SubSectorVO() {
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public int getSectorId() {
        return subSectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "subsectorName='" + subSectorName + '\'' +
                ", subsectorId=" + subSectorId +
                ", sectorid=" + sectorId +
                '}' + '\n';
    }

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subSectorName.compareTo(getSubSectorName());
    }
}
package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO>{
    public int subSectorId;
    public String subSectorName;
    public int sectorId;

    public SubSectorVO() {
    }

    public SubSectorVO(int sectorId, int subSectorId, String sunSectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.subSectorName = sunSectorName;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
               "sectorId=" + sectorId +
               ", subSectorId=" + subSectorId +
               ", sunSectorName='" + subSectorName + '\'' +
               '}'+'\n';
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
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

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subSectorName.compareTo(o.subSectorName);
    }
}
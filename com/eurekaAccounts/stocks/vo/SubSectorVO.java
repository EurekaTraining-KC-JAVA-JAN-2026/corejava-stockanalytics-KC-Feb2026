package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int subSectorId;
    public String sunSectorName;
    public int sectorId;

    public SubSectorVO() {
    }

    public SubSectorVO(int sectorId, int subSectorId, String sunSectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.sunSectorName = sunSectorName;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", sunSectorName='" + sunSectorName + '\'' +
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

    public String getSunSectorName() {
        return sunSectorName;
    }

    public void setSunSectorName(String sunSectorName) {
        this.sunSectorName = sunSectorName;
    }
}

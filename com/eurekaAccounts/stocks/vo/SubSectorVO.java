package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO>{
    public int sectorId;
    public int subSectorId;
    public String subSectorName;

    public SubSectorVO(int sectorId, int subSectorId, String subSectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.subSectorName = subSectorName;
    }

    public SubSectorVO() {
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
    public String toString() {
        return "SubSectorVO{" +
                "sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", subSectorName='" + subSectorName + '\'' +
                '}'+'\n';
    }


    @Override
    public int compareTo(SubSectorVO o) {
        return this.subSectorName.compareTo(o.subSectorName);
    }
}

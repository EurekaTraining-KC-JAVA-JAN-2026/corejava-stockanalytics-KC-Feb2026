package com.EurekaAccounts.stocks.vo;

public class SubSectorVo {
    public int sectorId;
    public int subSectorId;
    public String sectorName;

    public SubSectorVo(int sectorId, int subSectorId, String sectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.sectorName = sectorName;
    }

    public SubSectorVo() {
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

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "SubSectorVo{" +
                "sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }

}

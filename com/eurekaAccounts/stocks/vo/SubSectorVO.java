package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int subsectorId;
    public String subSectorName;
    public int sectorId;

    public SubSectorVO() {
    }

    public int getSubsectorId() {
        return subsectorId;
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

    public SubSectorVO(int subsectorId, String subSectorName, int sectorId) {
        this.subsectorId = subsectorId;
        this.subSectorName = subSectorName;
        this.sectorId = sectorId;
    }

    public void getSubSectorId(int subsectorId) {

    }

    @Override
    public String toString() {
        return "SubsectorVO{" +
                "subsectorId=" + subsectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}' + '\n';
    }
}
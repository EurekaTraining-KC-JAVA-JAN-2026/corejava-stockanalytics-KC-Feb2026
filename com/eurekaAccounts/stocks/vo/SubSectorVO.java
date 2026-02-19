package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    private int subSectorId;
    private String subSectorName;
    private int sectorId;

    public SubSectorVO(int subSectorId, String subSectorName, int sectorId) {
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
        return "SubSectorVO{" +
                "subSectorId=" + subSectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}' +'\n';
    }

    public SubSectorVO(){



    }

}

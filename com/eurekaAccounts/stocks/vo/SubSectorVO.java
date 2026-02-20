package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int sectorId;
    public int SubSectorId;
    public String SubSectorName;
    public SubSectorVO(int sectorId, int SubSectorId, String SubSectorName) {
        this.sectorId = sectorId;
        this.SubSectorId = SubSectorId;
        this.SubSectorName = SubSectorName;
    }

    public SubSectorVO() {
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getSubSectorName() {
        return SubSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        SubSectorName = subSectorName;
    }

    public int getSubSectorId() {
        return SubSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        SubSectorId = subSectorId;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "sectorId=" + sectorId +
                ", SubSectorId=" + SubSectorId +
                ", SubSectorName='" + SubSectorName  +
                '}' + "\n";
    }
}

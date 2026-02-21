package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO>{
    public String subsectorName;
    public int subsectorId;
    public int sectorid;

    public SubSectorVO(String subsectorName, int subsectorId, int sectorid) {
        this.subsectorName = subsectorName;
        this.subsectorId = subsectorId;
        this.sectorid = sectorid;
    }

    public SubSectorVO() {
    }

    public String getSubsectorName() {
        return subsectorName;
    }

    public void setSubsectorName(String subsectorName) {
        this.subsectorName = subsectorName;
    }

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "subsectorName='" + subsectorName + '\'' +
                ", subsectorId=" + subsectorId +
                ", sectorid=" + sectorid +
                '}' + '\n';
    }

    @Override
    public int compareTo(SubSectorVO o) {
       return this.subsectorName.compareTo(o.getSubsectorName());
    }
}

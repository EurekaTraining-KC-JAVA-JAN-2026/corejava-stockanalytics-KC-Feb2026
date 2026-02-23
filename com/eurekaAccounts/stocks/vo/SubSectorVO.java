package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable  <SubSectorVO>{

    public SubSectorVO(int subsectorId, String subsectorName, int sectorId) {
        this.subsectorId = subsectorId;
        this.subsectorName = subsectorName;
        this.sectorId = sectorId;
    }

    public SubSectorVO() {
    }

    public int subsectorId;

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "subsectorId=" + subsectorId +
                ", subsectorName='" + subsectorName + '\'' +
                ", sectorId=" + sectorId +
                '}'+"\n";
    }

    public String getSubsectorName() {
        return subsectorName;
    }

    public void setSubsectorName(String subsectorName) {
        this.subsectorName = subsectorName;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String subsectorName;
    public int sectorId;

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subsectorName.compareTo(o.subsectorName);
    }

}

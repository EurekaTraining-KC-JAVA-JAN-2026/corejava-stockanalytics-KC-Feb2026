package com.eurekaAccounts.stocks.vo;

public class SubSector implements Comparable<SubSector> {
    public int subsectorId;
    public String subSectorName;

    public SubSector() {
    }

    public SubSector(int subsectorId, String subSectorName, int sectorId) {
        this.subsectorId = subsectorId;
        this.subSectorName = subSectorName;
        this.sectorId = sectorId;
    }

    public int sectorId;

    public int getSubsectorId() {
        return subsectorId;
    }

    @Override
    public String toString() {
        return "SubSector{" +
                "subsectorId=" + subsectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}' + '\n';
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


    @Override
    public int compareTo(SubSector o) {
        return this.subSectorName.compareTo(o.getSubSectorName());
    }
}

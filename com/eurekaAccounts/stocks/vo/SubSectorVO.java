package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public SubSectorVO(String subsectorname, int subsectorId, int sectorId) {
        this.subsectorname = subsectorname;
        this.subsectorId = subsectorId;
        this.sectorId = sectorId;
    }

    public SubSectorVO(int sectorId, String subsectorName, int subsectorId) {
    }

    public int getSubsectorId() {
        return subsectorId;
    }

    public void setSubsectorId(int subsectorId) {
        this.subsectorId = subsectorId;
    }

    public String getSubsectorname() {
        return subsectorname;
    }

    public void setSubsectorname(String subsectorname) {
        this.subsectorname = subsectorname;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int subsectorId;
    public String subsectorname;
    public int sectorId;


    @Override
    public String toString() {
        return "SubSectorVO{" +
                "subsectorId=" + subsectorId +
                ", subsectorname='" + subsectorname + '\'' +
                ", sectorId=" + sectorId +
                '}' + '\n';
    }
}

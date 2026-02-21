package com.eurekaAccounts.stocksVO;

public class SubSectorVO implements Comparable<SubSectorVO> {
    public SubSectorVO(int subsectorid, String subsectorname, int sectorId) {
        this.subsectorid = subsectorid;
        this.subsectorname = subsectorname;
        this.sectorId = sectorId;
    }

    public SubSectorVO() {

    }

    public int getSubsectorid() {
        return subsectorid;
    }

    public void setSubsectorid(int subsectorid) {
        this.subsectorid = subsectorid;
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

    public int subsectorid;
    public String subsectorname;
    public int sectorId;

    @Override
    public String toString() {
        return "SubSectorVo{" +
                "subsectorid=" + subsectorid +
                ", subsectorname='" + subsectorname + '\'' +
                ", sectorId=" + sectorId +
                '}';
    }

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subsectorname.compareTo(o.getSubsectorname());
    }
}

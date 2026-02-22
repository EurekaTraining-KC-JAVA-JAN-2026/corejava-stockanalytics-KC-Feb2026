package com.eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO>{

    public int sectorId;
    public int subSectorId;
    public String subSectorName;

    public SubSectorVO(int subSectorId, int sectorId, String subSectorName) {
        this.subSectorId = subSectorId;
        this.sectorId = sectorId;
        this.subSectorName = subSectorName;
    }

    public SubSectorVO() {
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
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
//        if(o.sectorId > this.getSectorId()){
//            return 1;
//        }else if(o.sectorId< this.getSectorId()){
//            return -1;
//        }else {
//            return 0;
//        }

        return this.subSectorName.compareTo(o.getSubSectorName());
    }
}

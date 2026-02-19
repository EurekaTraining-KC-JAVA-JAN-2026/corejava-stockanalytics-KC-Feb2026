package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int sector_id;
    public int subSector_id;
    public String subSector_name;

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "sector_id=" + sector_id +
                ", subSector_id=" + subSector_id +
                ", subSector_name='" + subSector_name + '\'' +
                '}' +"\n";
    }

    public SubSectorVO() {
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public int getSubSector_id() {
        return subSector_id;
    }

    public void setSubSector_id(int subSector_id) {
        this.subSector_id = subSector_id;
    }

    public String getSubSector_name() {
        return subSector_name;
    }

    public void setSubSector_name(String subSector_name) {
        this.subSector_name = subSector_name;
    }

    public SubSectorVO(int sector_id, int subSector_id, String subSector_name) {
        this.sector_id = sector_id;
        this.subSector_id = subSector_id;
        this.subSector_name = subSector_name;
    }
}

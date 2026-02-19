package com.eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int subsector_id;
    public String subsector_name;
    public int sector_id;

    public SubSectorVO(int subsector_id, String subsector_name, int sector_id) {
        this.subsector_id = subsector_id;
        this.subsector_name = subsector_name;
        this.sector_id = sector_id;
    }

    public SubSectorVO() {
    }

    public int getSubsector_id() {
        return subsector_id;
    }

    public void setSubsector_id(int subsector_id) {
        this.subsector_id = subsector_id;
    }

    public String getSubsector_name() {
        return subsector_name;
    }

    public void setSubsector_name(String subsector_name) {
        this.subsector_name = subsector_name;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "subsector_id=" + subsector_id +
                ", subsector_name='" + subsector_name  +
                ", sector_id=" + sector_id +
                '}' + "\n";
    }
}

package com.eurekaAccounts.stocks.vo;

public class SectorVVo implements Comparable<SectorVVo>{

    public int sector_id;
    public String sector_name;

    public SectorVVo(int sector_id, String sector_name) {
        this.sector_id = sector_id;
        this.sector_name = sector_name;
    }

    public SectorVVo() {
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public String getSector_name() {
        return sector_name;
    }

    public void setSector_name(String sector_name) {
        this.sector_name = sector_name;
    }

    @Override
    public String toString() {
        return "SectorVVo{" +
                "sector_id=" + sector_id +
                ", sector_name='" + sector_name + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(SectorVVo o) {
        return this.sector_id - o.sector_id;
    }
}

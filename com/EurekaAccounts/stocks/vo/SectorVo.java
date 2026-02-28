package com.EurekaAccounts.stocks.vo;

public class SectorVo implements Comparable<SectorVo>{
    public int sectorId;
    public String sectorName;


    public SectorVo(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVo() {
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }


    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "SectorVo{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }


    @Override
    public int compareTo(SectorVo o) {

        if(o.sectorId>this.getSectorId()){
            return 1;
        }else if(o.sectorId<this.getSectorId()){
            return -1;
        }else{
            return 0;
        }
    }


    private long getMarketCap() {
        return 0;
    }

}

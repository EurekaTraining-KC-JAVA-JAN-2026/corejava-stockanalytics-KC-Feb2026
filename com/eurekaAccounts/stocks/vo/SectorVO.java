package com.eurekaAccounts.stocks.vo;

public class SectorVO implements Comparable<SectorVO>{
    public int sectorId;
    public String sectorName;

    public SectorVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVO() {
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
        return "SectorVO{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }
//we need toovverride comparato to override its an interface
    @Override
    public int compareTo(SectorVO o) {
        if(o.sectorId >this.getSectorId()){
            return 1;//1 one means kept top (it checks
        } else if (o.sectorId<this.getSectorId()) {
            return -1;//-1 will k
        }else{
        return 0;
        }
    }
}

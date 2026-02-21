package com.eurekaAccounts.stocks.vo;

public class SectorVO implements Comparable<SectorVO> {
    public int sectorId;
    public String sectorName;


    public SectorVO(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public SectorVO() {
    }

    public SectorVO(String sectorName) {
        this.sectorName = sectorName;
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
                '}' + '\n';
    }

    @Override
    public int compareTo(SectorVO o) {
       if(o.sectorId > this.getSectorId()) {
            return -1;
        } else if (o.sectorId < this.getSectorId()) {
            return 1;
        } else {
            return 0;
        }

    }
}


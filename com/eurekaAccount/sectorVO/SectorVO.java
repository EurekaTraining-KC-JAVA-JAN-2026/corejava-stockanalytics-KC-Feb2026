package com.eurekaAccount.sectorVO;

public class SectorVO {
    public SectorVO(int sectorId, String sectorname) {
        this.sectorId = sectorId;
        this.sectorname = sectorname;
    }

    public SectorVO() {

    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getSectorname() {
        return sectorname;
    }

    public void setSectorname(String sectorname) {
        this.sectorname = sectorname;
    }

    public int sectorId;
    public String sectorname;

    @Override
    public String toString() {
        return "SectorVO{" +
               "sectorId=" + sectorId +
               ", sectorname='" + sectorname + '\'' +
               '}';
    }

    public void setSectorName(String sectorName) {
    }
}
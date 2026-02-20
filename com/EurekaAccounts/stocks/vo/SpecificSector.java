package com.EurekaAccounts.stocks.vo;

public class SpecificSector {
    public int sectorId;
    public String sectorName;

    public SpecificSector() {
    }

    public SpecificSector(int sectorId, String sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public static void add(SpecificStockFundamental specificStockFundamental) {
    }

    public int getSectorId() {
        return 0;
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
        return "SpecificSector{" +
                "sectorId=" + sectorId +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }
}

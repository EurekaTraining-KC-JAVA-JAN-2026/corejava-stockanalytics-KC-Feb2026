package eurekaAccounts.stocks.vo;

public class SectorVO {
    public int sector_id;
    public String sector_name;

    public int getSectorId() {
        return sector_id;
    }

    public void setSectorId(int sector_id) {
        this.sector_id = sector_id;
    }

    public String getSectorName() {
        return sector_name;
    }

    public void setSectorName(String sector_name) {
        this.sector_name = sector_name;
    }

    public SectorVO(int sector_id, String sector_name) {
        this.sector_id = sector_id;
        this.sector_name = sector_name;
    }

    public SectorVO() {
    }

    @Override
    public String toString() {
        return "SectorVO{" +
                "sector_id=" + sector_id +
                ", sector_name='" + sector_name + '\'' +
                '}' +'\n';
    }
}

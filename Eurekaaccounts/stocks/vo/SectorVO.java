package Eurekaaccounts.stocks.vo;

public class SectorVO {
    public int sector_id;
    public String sector_name;


    public SectorVO(String sector_name, int sector_id) {
        this.sector_name = sector_name;
        this.sector_id = sector_id;
    }

    public SectorVO() {

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
        return "SectorVO{" +
                "sector_id=" + sector_id +
                ", sector_name='" + sector_name + '\'' +
                '}';
    }




}

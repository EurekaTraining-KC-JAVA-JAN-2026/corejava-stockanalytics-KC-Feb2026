package eurekaAccounts.stocks.vo;

public class SectorVO implements Comparable<SectorVO> {
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


    @Override
    public int compareTo(SectorVO o) {
       if(o.sector_id > this.getSectorId()){
          return 1;
       } else if (o.sector_id<this.getSectorId()) {
           return -1;
       }
       else{
           return 0;
       }
    }
}

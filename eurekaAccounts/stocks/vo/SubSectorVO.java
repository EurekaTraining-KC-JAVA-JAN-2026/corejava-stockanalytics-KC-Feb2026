package eurekaAccounts.stocks.vo;

public class SubSectorVO implements Comparable<SubSectorVO> {
    public int subsector_id;
    public String subsector_name;
    public int Sector_id;

    public int getSector_id() {
        return Sector_id;
    }

    public void setSector_id(int sector_id) {
        Sector_id = sector_id;
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

    public SubSectorVO(int sector_id, int subsector_id, String subsector_name) {
        Sector_id = sector_id;
        this.subsector_id = subsector_id;
        this.subsector_name = subsector_name;
    }

    public SubSectorVO() {
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "Sector_id=" + Sector_id +
                ", subsector_id=" + subsector_id +
                ", subsector_name='" + subsector_name + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(SubSectorVO o) {
        return this.subsector_name.compareTo(o.subsector_name);
    }
}



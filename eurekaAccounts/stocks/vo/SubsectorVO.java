package eurekaAccounts.stocks.vo;

public class SubsectorVO implements Comparable<SubsectorVO>{
    public int subSectorId;
    public String subSectorName;
    public int sectorId;

    public SubsectorVO() {
    }

    public SubsectorVO(int subSectorId, String subSectorName, int sectorId) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.subSectorName = subSectorName;
    }




    @Override
    public String toString() {
        return "SubsectorVO{" +
                "subSectorId=" + subSectorId +
                ", sectorName='" + subSectorName + '\'' +
                ", sectorId=" + sectorId +
                '}'+'\n';
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }


    @Override
    public int compareTo(SubsectorVO o) {
        return this.subSectorName.compareTo(o.subSectorName);
    }


}
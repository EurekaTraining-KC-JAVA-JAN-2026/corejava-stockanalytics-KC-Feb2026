package eurekaAccounts.stocks.vo;

public class SubSectorVO {
    public int sectorId;
    public String subSectorName;
    public int subSectorId;

    public SubSectorVO() {
        this.sectorId = sectorId;
        this.subSectorName = subSectorName;
        this.subSectorId = subSectorId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getSubSectorName() {
        return subSectorName;
    }

    public void setSubSectorName(String subSectorName) {
        this.subSectorName = subSectorName;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    @Override
    public String toString() {
        return "SubSectorVO{" +
                "sectorId=" + sectorId +
                ", subSectorName='" + subSectorName + '\'' +
                ", subSectorId=" + subSectorId + '\'' +
                '}' + '\n';
    }
}

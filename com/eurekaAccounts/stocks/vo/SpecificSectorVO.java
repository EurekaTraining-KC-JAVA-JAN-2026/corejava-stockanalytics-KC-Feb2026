package com.eurekaAccounts.stocks.vo;


public class SpecificSectorVO {
    public int sectorid;
    public float currentratio;
    public int subsectorid;
    public String tickername;

    public SpecificSectorVO(float currentratio, int sectorid, int subsectorid, String tickername) {
        this.currentratio = currentratio;
        this.sectorid = sectorid;
        this.subsectorid = subsectorid;
        this.tickername = tickername;
    }


    public SpecificSectorVO() {

    }

    public int getSectorid() {
        return sectorid;
    }

    public void setSectorid(int sectorid) {
        this.sectorid = sectorid;
    }

    public float getCurrentratio() {
        return currentratio;
    }

    public void setCurrentratio(float currentratio) {
        this.currentratio = currentratio;
    }

    public int getSubsectorid() {
        return subsectorid;
    }

    public void setSubsectorid(int subsectorid) {
        this.subsectorid = subsectorid;
    }

    public String getTickername() {
        return tickername;
    }

    public void setTickername(String tickername) {
        this.tickername = tickername;
    }



    @Override
    public String toString() {
        return "Demo{" +
               "sectorid=" + sectorid +
               ", currentratio=" + currentratio +
               ", subsectorid=" + subsectorid +
               ", tickername='" + tickername + '\'' +
               '}'+'\n';
    }

}

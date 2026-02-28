package com.EurekaAccounts.stocks.vo;

public class SubSectorVo implements Comparable<SubSectorVo>{
    public int sectorId;
    public int subSectorId;
    public String sectorName;
    public String address;
    public String city;


    public SubSectorVo(String address, String city, String state, int zipcode) {
        this.address = address;
        this.city=city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String state;
    public int zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SubSectorVo{" +
                "sectorId=" + sectorId +
                ", subSectorId=" + subSectorId +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }



    public SubSectorVo(String city, String state, int zipcode) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public SubSectorVo(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public SubSectorVo(int sectorId, int subSectorId, String sectorName) {
        this.sectorId = sectorId;
        this.subSectorId = subSectorId;
        this.sectorName = sectorName;
    }

    public SubSectorVo() {
    }


    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public int compareTo(SubSectorVo o) {
        return this.sectorName.compareTo(o.sectorName);
    }

}

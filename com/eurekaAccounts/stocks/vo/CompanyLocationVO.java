package com.eurekaAccounts.stocks.vo;

import com.eurekaAccounts.stocks.dao.BaseDAO;

import java.sql.SQLException;

public class CompanyLocationVO  {
    public String tickersymbol;
    public int zip;

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }



    public CompanyLocationVO() throws SQLException {
    }

    public CompanyLocationVO(String tickersymbol, int zip) throws SQLException {
        this.tickersymbol = tickersymbol;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CompanyLocationVO{" +
                "tickersymbol='" + tickersymbol + '\'' +
                ", zip=" + zip +
                '}';
    }


}

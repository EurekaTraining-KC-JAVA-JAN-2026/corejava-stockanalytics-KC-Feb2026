package com.eurekaAccounts.stocks.MVC;

import java.sql.SQLException;
import java.util.List;

public class Service {

    public Service() {
    }

    LookUpSPH lookUpSPH = new LookUpSPH();
    public String getallsph() throws SQLException {
        List<SPHVO> sphvo = lookUpSPH.getallsph();
        return sphvo.toString();
    }
}

package Eurekaaccounts.stocks.service;

import Eurekaaccounts.stocks.dao.LookupDAO;
import Eurekaaccounts.stocks.dao.LookupsubsectorDAO;
import Eurekaaccounts.stocks.vo.SectorVO;
import Eurekaaccounts.stocks.vo.SubsectorVO;
import jdk.dynalink.linker.support.Lookup;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnalyticsservice {
    LookupDAO lookup = new LookupDAO();
    LookupsubsectorDAO lookupsubsectorDAO = new LookupsubsectorDAO();
    public MarketAnalyticsservice() throws SQLException {
    }
    public String getAllsectorservices() throws SQLException{
        List<SectorVO> AllSectors=lookup.getAllSectors(34);
        return AllSectors.toString();
    }

    public String tostring() {
        List<SectorVO> allSectors =lookup.getAllSectors(30);
        return allSectors.toString();
    }

    public String getAllsubsectorservices() {
        List<SubsectorVO> AllSubSectors=lookupsubsectorDAO.getAllSubsectors(34);
        return AllSubSectors.toString();
    }

}

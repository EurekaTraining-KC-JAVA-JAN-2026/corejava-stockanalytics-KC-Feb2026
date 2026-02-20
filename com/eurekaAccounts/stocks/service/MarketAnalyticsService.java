package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpAllSubSectorDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {
LookUpDAO lookupDAO = new LookUpDAO();
LookUpDAO lookupDAO2 = new LookUpDAO();
LookUpAllSubSectorDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorDAO();
public String getAllSectors() throws SQLException {
    List<SectorVO> allSectors = lookupDAO.getAllSectors();
    return allSectors.toString();


}
    public String getSpecificSectors() throws SQLException {
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();


    }
    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        return allSubSectors.toString();


    }

public MarketAnalyticsService() throws SQLException {
    }
}

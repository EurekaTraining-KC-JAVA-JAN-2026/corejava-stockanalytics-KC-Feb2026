package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpSubSectorDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnalyticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpSubSectorDAO lookUpSubSectorDAO = new LookUpSubSectorDAO();

    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllSectors(){

        List<SectorVO> allSectors = lookUpDAO.getAllSectors(35);
        return allSectors.toString();
    }
    public String getAllSubSectors() throws SQLException {

        List<SubSectorVO> allSubSectors = lookUpSubSectorDAO.getAllSubSectors();
        return allSubSectors.toString();
    }
}

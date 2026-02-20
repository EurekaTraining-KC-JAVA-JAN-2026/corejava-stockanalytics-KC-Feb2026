package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnalyticsService {
    LookUpDAO lookupDAO = new LookUpDAO();
    public String getAllSectors() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        return allSectors.toString();

    }

    public MarketAnalyticsService() throws SQLException {
    }
}
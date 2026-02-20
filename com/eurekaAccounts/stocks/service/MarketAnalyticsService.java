package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MarketAnalyticsService {
    public MarketAnalyticsService() throws SQLException {
    }
    LookUpDAO lookupDAO = new LookUpDAO();
    // public String getAllSectorsService(){}

    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();

    public List<SubSectorVO> getAllSubSectorServices()  throws SQLException {
        List<SubSectorVO> allSectors = lookupDAO.getAllSectorsDAO(35);

        return allSectors;
    }

}

package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    public String getAllSectorsService(){
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO(35);
        return allSectors.toString();

    }

    public List<SubsectorVO> getAllSubSectorsService() throws SQLException {
        List<SubsectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        return allSubSectorsDAO;

    }

}

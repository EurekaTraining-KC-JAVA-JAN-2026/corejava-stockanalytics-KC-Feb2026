package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {
    public MarketAnalyticsService() throws SQLException{
    }
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    public List<SectorVO> getAllSectorsService() throws SQLException {
        //some operations as per requirement
        List<SectorVO> allsectors= lookUpDAO.getAllSectorsDAO(34);
        return allsectors;
    }
    public List<SubSectorVO> getAllSubSectorsService() throws SQLException{
        List<SubSectorVO> allSubSectorDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        return allSubSectorDAO;
    }
}

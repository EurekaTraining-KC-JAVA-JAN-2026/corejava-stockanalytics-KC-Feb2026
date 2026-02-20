package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnyaliticsService {
    public MarketAnyaliticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    public String getAllSectorsService(){
        //some opertaions as per requirement
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO(35);
        return allSectors.toString();
    }

    public List<SubSectorVO> getAllSubSectorsService() throws SQLException {
        return lookupAllSubSectorsDAO.getAllSubSectorsDAO();
    }
}
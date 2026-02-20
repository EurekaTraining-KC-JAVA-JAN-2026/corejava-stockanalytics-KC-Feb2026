package com.eurekaAccounts.service;

import com.eurekaAccounts.DAO.LookupAllSubSectorsDAO;
import com.eurekaAccounts.DAO.LookupDAO;
import com.eurekaAccounts.stocksVO.SectorVO;
import com.eurekaAccounts.stocksVO.SubSectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnyaliticsservices {
    LookupDAO lookupDAO = new LookupDAO();
    LookupDAO lookupDAO2 = new LookupDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    public String getAllSectors() throws SQLException{
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        return allSectors.toString();
    }
    public String getSpecificSectors() throws SQLException{
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();
    }
    public String getAllSubSector() throws SQLException{
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSector();
        return allSubSectors.toString();
    }

    public MarketAnyaliticsservices() throws SQLException {

    }


}

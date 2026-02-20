package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarketAnyaliticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO= new LookupAllSubSectorsDAO();
     public String getAllSectors()throws SQLException{


        List<SectorVO>  allSectors = lookUpDAO.getAllSectors();
        return allSectors.toString();

        //List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAll;
    }
    public String getAllSubSectors()throws SQLException{
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        return allSubSectors.toString();
    }
    public MarketAnyaliticsService()throws SQLException{

    }

}

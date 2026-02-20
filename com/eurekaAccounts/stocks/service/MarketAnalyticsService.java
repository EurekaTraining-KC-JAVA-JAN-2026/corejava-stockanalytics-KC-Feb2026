package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorDAO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {

    /**
     * using the service layer we fetch the data from DAO, and here we perform
     * some logic like converting the list to string or just get the data as usual
     * from DAO and pass it to main, or to filter the data
     */

    //Means this class depends on DAO
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorDAO lookupAllSubSectorDAO = new LookupAllSubSectorDAO();

     public String getAllSubSectors() throws SQLException {
         List<SubsectorVO> allSubSectors = lookUpDAO.getAllSubSectors(34);
         return allSubSectors.toString();
     }

    public List<SubsectorVO> getAllSubSectorsService() throws SQLException {
        List<SubsectorVO> allsub =  lookupAllSubSectorDAO.getAllSubSectorsDAO();
        return allsub;
    }
}

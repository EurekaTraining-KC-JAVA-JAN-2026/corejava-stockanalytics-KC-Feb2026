package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {

    /**
     * using the service layer we fetch the data from DAO, and here we perform
     * some logic like converting the list to string or just get the data as usual
     * from DAO and pass it to main, or to filter the data
     */



    //Means this class depends on DAO
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();

    public String getAllSector() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Collections.sort(allSectors);
        return allSectors.toString();
    }

    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpDAO.getAllSubSectors();
        //Collections.sort(allSubSectors);
        /**
         * USING comparable is like using natural order.
         * Here we are printing the seco
         */
        Collections.sort(allSubSectors);
        return allSubSectors.toString();
    }

    public String getAllSubSectorsService() throws SQLException {
        List<SubSectorVO> allsubSectorDAO =  lookupAllSubSectorDAO.getAllSubSectorsDAO();
        // Collections.sort(allsubSectorDAO);
        //allsubSectorDAO.sort(SubsectorVO::compareTo);
        //Collections.sort(allsubSectorDAO, new SubSectorsNameComparator());
//         allsubSectorDAO.sort(Comparator.comparing(SubsectorVO::getSectorId)
//                 .thenComparing(SubsectorVO::getSubSectorName)
//                 .thenComparing(SubsectorVO::getSubSectorId));
        //Collections.sort(allsubSectorDAO);
        Collections.sort(allsubSectorDAO, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        return allsubSectorDAO.toString();
    }

    public String getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals =   lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundamentalsVO stockFundamentalVO = allStockFundamentals.get(0);
        return stockFundamentalVO.toString();
    }
}
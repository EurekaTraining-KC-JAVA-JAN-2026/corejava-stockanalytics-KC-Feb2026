package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;
import com.eurekaAccounts.stocks.dao.lookUpAllSubSectorDAO;

import java.sql.SQLException;
import java.util.*;

public class MarketAnalyticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    lookUpAllSubSectorDAO lookupAllSubSectorsDAO1 = new lookUpAllSubSectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();

    public String getAllSectorService() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getSpecificSector(35);
        return allSectors.toString();
    }


    public List<SubSectorVO>  getAllSubSectorService() {
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO1.getAllSubSectors();
        Collections.sort(allSubSectors);
        Collections.sort(allSubSectors,new SubSectorNameComparator());
        //allSubSectors.sort(Comparator.comparing(SubSectorVO ::toString));
        allSubSectors.sort(Comparator.comparing(SubSectorVO::getSectorId).
                thenComparing(SubSectorVO::getSubSectorName).
                thenComparing(SubSectorVO::getSubSectorId));
        return allSubSectors;
    }

    public List<StockFundamentalsVO> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        return allStockFundamentals;
    }
}

package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpAllSubSectorDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {
    LookUpDAO lookupDAO = new LookUpDAO();
    LookUpDAO lookupDAO2 = new LookUpDAO();
    LookUpAllSubSectorDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    public String getAllSectors() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        Collections.sort(allSectors);

        // used comparable interface by overriding compareTo and did descending order
        // comparable to perform natural sorting order
        return allSectors.toString();


    }
    public String getSpecificSectors() throws SQLException {
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();


    }
    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        //Collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
        // Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        return allSubSectors.toString();
        //return allSubSectorsDAO;
        //return allSubSectors.


    }
    public String getAllStockFundementals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundamentalsVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }

    public MarketAnalyticsService() throws SQLException {
    }

}
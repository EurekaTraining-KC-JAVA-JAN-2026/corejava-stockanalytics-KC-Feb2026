package com.eurekaAccounts.service;

import com.eurekaAccounts.DAO.LookupAllSubSectorsDAO;
import com.eurekaAccounts.DAO.LookupDAO;
import com.eurekaAccounts.stocks.SubSectorNameComparator;
import com.eurekaAccounts.stocksVO.SectorVO;
import com.eurekaAccounts.stocksVO.StocksectorVO;
import com.eurekaAccounts.stocksVO.SubSectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnyaliticsservices {
    LookupDAO lookupDAO = new LookupDAO();
    LookupDAO lookupDAO2 = new LookupDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();

    public MarketAnyaliticsservices() throws SQLException {
    }

    public String getAllSectors() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        Collections.sort(allSectors);
        /**
         * using comparable is like using natural order
         * //here we are printing the sectors in desc order by implementing comparable
         *
         */
        return allSectors.toString();
    }

    public String getSpecificSectors() throws SQLException {
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();
    }

    public String getAllSubSector() throws SQLException {
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSector();
        return allSubSectors.toString();
    }

    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSector();
        //collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
        // Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        Collections.sort(allSubSectors, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorname));
        return allSubSectors.toString();
        //return allSubSectorsDAO;
        //return allSubSectors.
    }

//    public String getAllStockFundementals() throws SQLException {
//        List<StocksectorVO> allStockFundamentals = LookupAllSubSectorsDAO.getStockSector();
        //Collections.sort(allStockFundamentals);
        //StocksectorVO highestStock = allStockFundamentals.get(0);
        //return highestStock.toString();

    }
    //public MarketAnyaliticsservices() throws SQLException{




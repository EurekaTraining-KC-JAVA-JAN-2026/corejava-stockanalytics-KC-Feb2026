package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockfundamentalVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketAnalyticsService {
    // this service layer is for doing operations as per requirement
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentals = new LookUpStockFundamentalsDAO();


    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

    }

    public List<SubsectorVO> getAllSubSectorsService() throws SQLException {
        List<SubsectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::toString));

        //Collections.sort(allSubSectorsDAO);
        //allSubSectorsDAO.sort(SubsectorVO::compareTo);
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::getSectorId).thenComparing(SubsectorVO::getSectorName).thenComparing(SubsectorVO::getSubSectorId));
        //allSubSectorsDAO.sort(allSubSectorsDAO, new SubSectorNameComparator());
        Collections.sort(allSubSectorsDAO, new SubSectorNameComparator().thenComparing(SubsectorVO::getSubSectorName));
        return allSubSectorsDAO;
        //return allSubSectors.toString();

    }

    public String getStockFundamental() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockfundamentalVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();

    }
}






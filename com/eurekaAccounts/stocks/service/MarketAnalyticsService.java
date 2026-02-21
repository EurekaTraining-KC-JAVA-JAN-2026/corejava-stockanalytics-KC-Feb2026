package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpAllSubSectorsDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockfundamentalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {
    //this service layer is for doing operations as per requirement
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpAllSubSectorsDAO lookUpAllSubSectorsDAO = new LookUpAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();

    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

    }

    public List<SubSectorVO> getAllSubSectorsService() throws SQLException {
        List<SubSectorVO> allSubSectorDAO = lookUpAllSubSectorsDAO.getAllSubSectorsDAO();
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::toString));

        //Collections.sort(allSectorsDAO);
        //allSubSectorsDAO.sort(SubsectorVO::compareTo);
        //allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::getSectorId).thenComparing(SubSectorVO::getSectorName).thenComparing(SubSectorVO::getSubSectorId));
        //allSubSectorDAO.sort(allSubSectorDAO, new SubSectorNameComparator());
        Collections.sort(allSubSectorDAO, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        return allSubSectorDAO;
        //return allSubSectors.toString();
    }

    public String getStockFundamentals() throws SQLException{
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockfundamentalVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();
    }
}
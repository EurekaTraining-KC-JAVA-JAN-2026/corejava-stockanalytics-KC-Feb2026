package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.*;

public class MarketAnalyticsService {
    public MarketAnalyticsService() {
    }

    LookUpDAO lookUpDAO=new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO=new LookupAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO=new LookUpStockFundamentalsDAO();
    public List<SectorVO> getAllSectorService() throws SQLException {
        List<SectorVO> allsectors=lookUpDAO.getAllSectorsDAO();
        Collections.sort(allsectors);// here we are printing sectors in descending order with comparable interface
        return allsectors;
    }

    public List<SubSectorVO> getAllSubSectorService() throws SQLException {
        List<SubSectorVO> allsubsectors=lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //Collections.sort(allsubsectors);
//
        allsubsectors.sort(new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        //Collections.sort(allsubsectors,new SubSectorNameComparator());
        return allsubsectors;
    }

    public List<StockFundamentalsVO> getAllStockFundamentalService() throws SQLException {
        List<StockFundamentalsVO> allstockfundamentals=lookUpStockFundamentalsDAO.getAllStockFundamentals();
        Collections.sort(allstockfundamentals);

        return allstockfundamentals.reversed();
    }

}

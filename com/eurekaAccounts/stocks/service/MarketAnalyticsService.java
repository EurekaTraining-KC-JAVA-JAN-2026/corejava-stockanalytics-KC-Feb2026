package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUPSubDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
//import com.eurekaAccounts.stocks.dao.LookUpStockFundamnetalsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
//import com.eurekaAccounts.stocks.vo.StockFundamentalsDAO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Collections;

public class MarketAnalyticsService {

    private final LookUpDAO lookUpDAO = new LookUpDAO();
    private final LookUPSubDAO lookUpSubDAO = new LookUPSubDAO();


    public MarketAnalyticsService() throws SQLException {
    }

    public List<SectorVO> getAllSectorsService() throws SQLException {

        return lookUpDAO.getAllSectorsDAO();
    }

    public List<SubSectorVO> getAllSubSectorsService() {

        List<SubSectorVO> allSubSectorsVO = lookUpSubDAO.getAllSubSectorVO();
        Collections.sort(allSubSectorsVO, new SubSectorNameComparator());
        return allSubSectorsVO;
    }

//    private final LookUpStockFundamentalsDAO stockFundamentalsDAO = new LookUpStockFundamentalsDAO();
//
//    public List<StockFundamentalsVO> getAllStockFundamentalsService() throws SQLException {
//        List<StockFundamentalsVO> stocks = stockFundamentalsDAO.getAllStockFundamentals();
//        Collections.sort(stocks);
//        return
//                stocks;
//    }
}
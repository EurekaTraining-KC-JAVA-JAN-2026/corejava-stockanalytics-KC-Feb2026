package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.dao.LookUpSubSectorDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpSubSectorDAO lookUpSubSectorDAO = new LookUpSubSectorDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    public MarketAnalyticsService() {
    }

    public String getAllSectors(){

        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Collections.sort(allSectors);
        return allSectors.toString();
    }
    public String getAllSubSectors()  {

        List<SubSectorVO> allSubSectors = lookUpSubSectorDAO.getAllSubSectors();
//        Collections.sort(allSubSectors);

        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsector_name));
        return allSubSectors.toString();
    }
    public String getAllStockFundamentals()  {
        List<StockFundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getallStockFundemental();
        Collections.sort(allStockFundamentals);
        return allStockFundamentals.toString();
    }
}

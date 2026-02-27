package com.eurekaAccounts.MarketCap.Service;

import com.eurekaAccounts.MarketCap.CompanyLocationsVO;
import com.eurekaAccounts.MarketCap.DAO.LookUpStates;
import com.eurekaAccounts.MarketCap.DAO.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.MarketCap.DAO.LookUpStockFundamentalsDAO1;
import com.eurekaAccounts.MarketCap.StateLookUpVO;
import com.eurekaAccounts.MarketCap.StockFundamentalsVO;
import com.eurekaAccounts.MarketCap.comparator.MarketCapDescComparator;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.MarketCap.DAO.LookUpCompanyLocationsDAO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketCapService {

    //LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    LookUpStockFundamentalsDAO1 lookUpStockFundamentalsDAO1 = new LookUpStockFundamentalsDAO1();
    LookUpCompanyLocationsDAO lookUpCompanyLocationsDAO = new LookUpCompanyLocationsDAO();
    LookUpStates lookUpStates = new LookUpStates();

    public MarketCapService() {
    }

    public List<StockFundamentalsVO> getHighestMarketCap() {
        List<StockFundamentalsVO> stockFundamentalsVOS = lookUpStockFundamentalsDAO1.getHighestMarketCapFromSF1();
        //Collections.sort(stockFundamentalsVOS);
        stockFundamentalsVOS.sort(new MarketCapDescComparator());
//        stockFundamentalsVOS.sort(Comparator.comparing(StockFundamentalsVO :: getSectorId).
//                thenComparing(Comparator.comparing(StockFundamentalsVO::getMarketCap).reversed()).
//                thenComparing(StockFundamentalsVO::getTickerSymbol));
        List<StockFundamentalsVO> top5 = new ArrayList<>();
        for(int i=0;i<stockFundamentalsVOS.size()&& i<5;i++){
            top5.add(stockFundamentalsVOS.get(i));
        }
        return top5;
    }

    public List<CompanyLocationsVO> getCompanyLocation() throws SQLException {
        List<CompanyLocationsVO> companyLocationsVOList = lookUpCompanyLocationsDAO.getCompanyLocationFromCL();
        return companyLocationsVOList;
    }

    public List<StateLookUpVO> getNumberOfStates() throws SQLException {
        List<StateLookUpVO> stateLookUpVOS = lookUpStates.getTotalNumberOfStates();
        return stateLookUpVOS;

    }
    public BigDecimal getCount() throws SQLException {
        return lookUpStockFundamentalsDAO1.getCountOfStates();
    }

}

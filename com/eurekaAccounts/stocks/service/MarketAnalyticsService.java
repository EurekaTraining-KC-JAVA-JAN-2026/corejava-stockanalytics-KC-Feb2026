package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookupDAO;
import com.eurekaAccounts.stocks.dao.LookupSubSectorDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentals;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.SQLException;
import java.util.List;

public class MarketAnalyticsService {

   LookupDAO lookupDAO=new LookupDAO();
   LookupSubSectorDAO lookupSubSectorDAO =new LookupSubSectorDAO();
   LookUpStockFundamentals lookUpStockFundamentals=new LookUpStockFundamentals();
    public List<SectorVO> getAllSectors() throws SQLException {
        List<SectorVO> resultsector =lookupDAO.getAllSectors();
        return resultsector;
    }
    public List<SubSector> getAllSubSectors() throws SQLException {
        List<SubSector> resultsector1= lookupSubSectorDAO.getAllSubSectors();
        return resultsector1;
    }
    public List<StockFundamentals> getAllStockFundamentals() throws SQLException {
        List<StockFundamentals> resultsector2= lookUpStockFundamentals.getAllStockFundamentals();
        return resultsector2;
    }
}

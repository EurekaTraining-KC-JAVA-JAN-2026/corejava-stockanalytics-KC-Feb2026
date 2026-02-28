package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO {
    public LookUpStockFundamentals() {
    }

    List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
    String sqlQuery = """
  
            select *
            from endeavour.stock_fundamentals sf
            """;


    public List<StockFundamentalsVO> getAllStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
        String sqlQuery = """
  
            select *
            from endeavour.stock_fundamentals sf
            """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        //List<StockFundamentalsVO> specificStockFundamentals = new ArrayList<>();
        while(resultSet.next()){
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            stockFundamentalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundamentalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundamentalsVO.setCurrentRation(resultSet.getFloat("current_ratio"));
            stockFundamentalsVOS.add(stockFundamentalsVO);
        }
         return stockFundamentalsVOS;

    }

}

package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO{
    BaseDAO baseDAO =  new BaseDAO();
    public LookUpStockFundamentalsDAO() throws SQLException {
    }

    public  List<StockFundamentalsVO> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        //System.out.println(resultSet);

        while(resultSet.next())
        {
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundamentalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundamentalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));



            stockFundamentalsVOS.add(stockFundamentalsVO);
        }
        return stockFundamentalsVOS;
    }
}
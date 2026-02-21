package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalVo;
import com.eurekaAccounts.stocks.vo.StockFundamentalVo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO{
    BaseDAO baseDAO =  new BaseDAO();
    public LookUpStockFundamentals() throws SQLException {
    }

    public  List<StockFundamentalVo> getStockFundamentals() throws SQLException {
        List<StockFundamentalVo> stockFundementalsVOS = new ArrayList<>();
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
            StockFundamentalVo stockFundementalsVO = new StockFundamentalVo();
            stockFundementalsVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));



            stockFundementalsVOS.add(stockFundementalsVO);
        }
        return stockFundementalsVOS;
    }
}
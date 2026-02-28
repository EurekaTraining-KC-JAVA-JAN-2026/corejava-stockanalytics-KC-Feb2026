package com.EurekaAccounts.stocks.dao;

import com.EurekaAccounts.stocks.vo.StockFundamentalsVo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO implements Comparable{

    BaseDAO baseDAO=new BaseDAO();

    public LookUpStockFundamentalsDAO() throws SQLException {


    }
    public  List<StockFundamentalsVo> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVo> stockFundamentalsVOS = new ArrayList<>();
        String sqlQuery = """
                select * from endeavour.stock_fundamentals sf 
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        //System.out.println(resultSet);

        while(resultSet.next())
        {
            StockFundamentalsVo stockFundamentalsVo = new StockFundamentalsVo();
            stockFundamentalsVo.setSector_id(resultSet.getInt("sector_id"));
            stockFundamentalsVo.setSubsector_id(resultSet.getInt("subsector_id"));
            stockFundamentalsVo.setTicker_symbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVo.setMarket_cap(resultSet.getBigDecimal("market_cap"));
            stockFundamentalsVo.setCurrent_ratio(resultSet.getFloat("current_ratio"));



            stockFundamentalsVOS.add(stockFundamentalsVo);
        }
        return stockFundamentalsVOS;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

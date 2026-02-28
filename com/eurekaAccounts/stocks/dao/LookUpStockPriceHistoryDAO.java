package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundementalsVO;
import com.eurekaAccounts.stocks.vo.StockPirceHistoryVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO{
    BaseDAO baseDAO= new BaseDAO();
    public List<StockPirceHistoryVO> getStockPriceHistory(String ticker, LocalDate date)throws SQLException {
        List<StockPirceHistoryVO> stockPirceHistoryVOS =new ArrayList<>();
        String sqlString= """
                SELECT *
                FROM endeavour.stocks_price_history sph
                WHERE sph.ticker_symbol = ?
                  AND sph.trading_date BETWEEN ? AND ?;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2, Date.valueOf(date.minusMonths(3)));
        preparedStatement.setDate(3, java.sql.Date.valueOf(date));
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            StockPirceHistoryVO stockPirceHistoryVO = new StockPirceHistoryVO();
            stockPirceHistoryVO.setTradingdate(resultSet.getDate("trading_date"));
            stockPirceHistoryVO.setOpenprice(resultSet.getBigDecimal("open_price"));
            stockPirceHistoryVO.setCloseprice(resultSet.getBigDecimal("close_price"));
            stockPirceHistoryVO.setTickersymbol(resultSet.getString("ticker_symbol"));
            stockPirceHistoryVOS.add(stockPirceHistoryVO);
        }
        return stockPirceHistoryVOS;


    }
}

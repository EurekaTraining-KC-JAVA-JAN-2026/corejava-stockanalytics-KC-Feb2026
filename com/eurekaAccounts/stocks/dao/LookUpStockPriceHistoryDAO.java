package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO{
    public LookUpStockPriceHistoryDAO() throws SQLException {
    }

    BaseDAO baseDAO = new BaseDAO();

    public List<StockPriceHistoryVO> getStockPriceHistory(String ticker, Date date) throws SQLException {
        String sqlString= """
                select
                	*
                from
                	endeavour.stocks_price_history sph
                where
                    sph.ticker_symbol = ?
                and sph.trading_date >= ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2, date);
        //preparedStatement.setDate(3, Date.valueOf(date.toLocalDate()));
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockPriceHistoryVO> stockPriceHistoryVOS = new ArrayList<>();
        while(resultSet.next()){
            StockPriceHistoryVO stockPriceHistoryVO = new StockPriceHistoryVO();
            stockPriceHistoryVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPriceHistoryVO.setTradingDate(resultSet.getDate("trading_date"));
            stockPriceHistoryVO.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockPriceHistoryVO.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockPriceHistoryVO.setVolume(resultSet.getBigDecimal("volume"));
            stockPriceHistoryVOS.add(stockPriceHistoryVO);
        }
        return stockPriceHistoryVOS;
    }
}

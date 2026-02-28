package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class LookUpStockPriceHistoryDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockPriceHistoryDAO() throws SQLException {
    }

    public List<StockPriceHistoryVO> getStockPriceHistory(String ticker, LocalDate date) throws SQLException {
        List<StockPriceHistoryVO> stockPriceHistoryVOS = new ArrayList<>();
        String sqlString = """
                select *
                from endeavour.stocks_price_history sph
                where sph.ticker_symbol = ?
                and sph.trading_date between ? and ?
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2,java.sql.Date.valueOf(date.minusMonths(3)));
        preparedStatement.setDate(3,java.sql.Date.valueOf(date));
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            StockPriceHistoryVO stockPriceHistoryVO = new StockPriceHistoryVO();
            stockPriceHistoryVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPriceHistoryVO.setTradingDate(resultSet.getDate("trading_date"));
            stockPriceHistoryVO.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockPriceHistoryVO.setOpenPrice(resultSet.getBigDecimal("close_price"));
            stockPriceHistoryVO.setOpenPrice(resultSet.getBigDecimal("volume"));

            stockPriceHistoryVOS.add(stockPriceHistoryVO);



        }
        return stockPriceHistoryVOS;



    }

}

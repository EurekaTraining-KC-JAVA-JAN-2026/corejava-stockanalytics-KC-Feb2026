package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockPriceHistory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO{
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockPriceHistoryDAO() throws SQLException {
    }
    public List<StockPriceHistory> getStockPriceHistory(String tickerSymbol, LocalDate date) throws SQLException {
        List<StockPriceHistory> stockPriceHistoryList =new ArrayList<>();
        String sqlString= """
                select *
                from endeavour.stocks_price_history sph
                where sph.ticker_symbol =?
                and sph.trading_date between ? and ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1, tickerSymbol);
        preparedStatement.setDate(2,Date.valueOf(date.minusMonths(12)));
        preparedStatement.setDate(3,Date.valueOf(date));


        ResultSet resultSet = preparedStatement.executeQuery();
      while(resultSet.next()) {
          StockPriceHistory stockPriceHistory = new StockPriceHistory();
          stockPriceHistory.setTickerSymbol(resultSet.getString("ticker_symbol"));
          stockPriceHistory.setTradingDate(resultSet.getDate("trading_date"));
          stockPriceHistory.setClosePrice(resultSet.getBigDecimal("close_price"));
          stockPriceHistory.setOpenPrice(resultSet.getBigDecimal("open_price"));
          stockPriceHistory.setVolume(resultSet.getBigDecimal("volume"));
          stockPriceHistoryList.add(stockPriceHistory);
      }
       // preparedStatement.setString(1, tickerSymbol);
      //  preparedStatement.setDate(2,Date date);
     //   preparedStatement.setInt(3,);

         return stockPriceHistoryList;
        }
    }


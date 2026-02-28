package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.MarketCap.DAO.BaseDAO1;
import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Date;
import java.sql.Date;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO1 {

    BaseDAO1 baseDAO1 = new BaseDAO1();


    public LookUpStockPriceHistoryDAO() {
    }

    public List<StockPriceHistoryVO> getStockPriceHistory(String ticker, Date date) throws SQLException {

        String sqlQuery = """
                select *
                 from endeavour.stocks_price_history
                 where ticker_symbol = ?
                 and trading_date >= ?
                 order by trading_date
                """;
        // and where sph.trading_date in ?

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,ticker);
       preparedStatement.setDate(2,date);
       //preparedStatement.setDate(3,Date.valueOf(date.toLocalDate()));
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockPriceHistoryVO> stockPriceHistoryVOS = new ArrayList<>();

        while(resultSet.next()){
            StockPriceHistoryVO stockPriceHistoryVO = new StockPriceHistoryVO();

            stockPriceHistoryVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPriceHistoryVO.setDate(resultSet.getDate("trading_date"));
            stockPriceHistoryVO.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockPriceHistoryVO.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockPriceHistoryVO.setVolume(resultSet.getBigDecimal("volume"));
            stockPriceHistoryVOS.add(stockPriceHistoryVO);
        }
        return stockPriceHistoryVOS;

    }
}

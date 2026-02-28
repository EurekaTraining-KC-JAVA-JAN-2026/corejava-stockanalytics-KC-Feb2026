package com.eurekaAccounts.stocks.DAO;

import com.eurekaAccounts.stocks.stocksVO.StockPriceHistoryVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockPriceHistoryDAO() throws SQLException {
    }

    public List<StockPriceHistoryVO> getStockPriceHistory(String ticker, LocalDate fromDate, LocalDate toDate) throws SQLException {
        List<StockPriceHistoryVO> stockPriceHistoryVOS = new ArrayList<>();
        String sqlString = """
                 select
                   *
                   from endeavour.stocks_price_history sph\s
                   where sph.ticker_symbol =?
                 and sph.trading_date between ? and ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2, Date.valueOf(fromDate));
        preparedStatement.setDate(3,Date.valueOf(toDate));
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            StockPriceHistoryVO stockPriceHistoryVO = new StockPriceHistoryVO();
            stockPriceHistoryVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPriceHistoryVO.setTradingDate(resultSet.getDate("trading_date"));
            stockPriceHistoryVO.setOpenRate(resultSet.getBigDecimal("open_price"));
            stockPriceHistoryVO.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockPriceHistoryVO.setVolume(resultSet.getBigDecimal("volume"));

            stockPriceHistoryVOS.add(stockPriceHistoryVO);

        }
        return stockPriceHistoryVOS;
    }


}

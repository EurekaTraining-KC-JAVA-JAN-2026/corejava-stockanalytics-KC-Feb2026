package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockPriceHistoryVo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO {

    public LookUpStockPriceHistoryDAO() {
    }

    public List<StockPriceHistoryVo> getAllStockPriceHistroy(String tickerSymbol, LocalDate date) throws SQLException {
       List<StockPriceHistoryVo> stockPriceHistoryVos = new ArrayList<>();
        String sql = """
                select\s
                *\s
                from endeavour.stocks_price_history sph\s
                where sph.ticker_symbol = ? and\s
                sph.trading_date between ? and ?
               \s""";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, tickerSymbol);
        preparedStatement.setDate(2, Date.valueOf(date.minusMonths(12)));
        preparedStatement.setDate(3, Date.valueOf(date));
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            StockPriceHistoryVo stockPriceHistoryVo = new StockPriceHistoryVo();
            stockPriceHistoryVo.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPriceHistoryVo.setTradingDate(resultSet.getDate("trading_date"));
            stockPriceHistoryVo.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockPriceHistoryVo.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockPriceHistoryVo.setVolume(resultSet.getBigDecimal("volume"));
            stockPriceHistoryVos.add(stockPriceHistoryVo);
        }
        return stockPriceHistoryVos;
    }

}

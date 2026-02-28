package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;

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

    public List<StockPriceHistoryVO> getStockPriceHistory(String ticker, LocalDate date) throws SQLException {
        String sql = """
        SELECT *
        FROM endeavour.stocks_price_history sph
        WHERE sph.ticker_symbol = ?
          AND sph.trading_date BETWEEN ? AND ?
        ORDER BY sph.trading_date;
    """;

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, ticker);
        ps.setDate(2, Date.valueOf(date.minusMonths(3)));
        ps.setDate(3, Date.valueOf(date));

        List<StockPriceHistoryVO> stocksph = new ArrayList<>();

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StockPriceHistoryVO sph = new StockPriceHistoryVO();
            sph.setTickerSymbol(rs.getString("ticker_symbol"));
            sph.setOpenPrice(rs.getBigDecimal("open_price"));
            sph.setClosingPrice(rs.getBigDecimal("close_price"));
            sph.setVolume(rs.getBigDecimal("volume"));
            sph.setTradingDate(rs.getDate("trading_date"));

            stocksph.add(sph);
        }


        return stocksph;
    }

}

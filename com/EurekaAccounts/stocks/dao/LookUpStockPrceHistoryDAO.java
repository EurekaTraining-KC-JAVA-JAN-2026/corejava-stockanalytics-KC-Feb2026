package com.EurekaAccounts.stocks.dao;

import com.EurekaAccounts.stocks.vo.StockPricehistoryVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockPrceHistoryDAO extends BaseDAO{
    BaseDAO baseDAO=new BaseDAO();

    public LookUpStockPrceHistoryDAO() throws SQLException {
    }


    public List<StockPricehistoryVO>getStockPriceHistory(String ticker, LocalDate fromDate, LocalDate toDate) throws SQLException{
        List<StockPricehistoryVO> stockPriceHistoryVOS=new ArrayList<>();
        String sqlString = """
                SELECT 
                    *
                from endeavour.stocks_price_history sph
                where sph.ticker_symbol = ?
                AND sph.trading_date between ? and ?;
                """;

        PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2,java.sql.Date.valueOf(fromDate));
        preparedStatement.setDate(3, Date.valueOf(toDate));
        ResultSet resultSet =preparedStatement.executeQuery();
        while(resultSet.next()){
            StockPricehistoryVO stockPricehistoryVO=new StockPricehistoryVO();

            stockPricehistoryVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockPricehistoryVO.setTradigDate(resultSet.getDate("trading_date"));
            stockPricehistoryVO.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockPricehistoryVO.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockPricehistoryVO.setVolume(resultSet.getBigDecimal("volume"));

            stockPriceHistoryVOS.add(stockPricehistoryVO);

        }
        return stockPriceHistoryVOS;
    }
}

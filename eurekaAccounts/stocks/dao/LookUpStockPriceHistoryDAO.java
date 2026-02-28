package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.StockpricehistoryVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockPriceHistoryDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public void LookUpStockFundamentalsDAO() throws SQLException{

    }
    public List<StockpricehistoryVO> getAllStockPriceHistory(String ticker, LocalDate date) throws SQLException{
        List<StockpricehistoryVO> stockPriceHistoryVOS = new ArrayList<>();
        String sqlQuery= """
                select
                    *
                    from 
                        endeavour.stock_price_history sph
                    where
                        sph.ticker_symbol=?
                    and
                        sph.trading_date between ? and ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2, Date.valueOf(date.minusMonths(3)));
        preparedStatement.setDate(3,Date.valueOf(date));
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            StockpricehistoryVO stockpricehistoryVO = new StockpricehistoryVO();

            stockpricehistoryVO.setTickerSymbol((resultSet.getString("ticker_symbol")));
            stockpricehistoryVO.setTradingDate((resultSet.getDate("trading_date")));
            stockpricehistoryVO.setOpenPrice(resultSet.getBigDecimal("open_price"));
            stockpricehistoryVO.setClosePrice(resultSet.getBigDecimal("close_price"));
            stockpricehistoryVO.setVolume(resultSet.getBigDecimal("volume"));

            stockPriceHistoryVOS.add(stockpricehistoryVO);
        }
        return stockPriceHistoryVOS;

    }

}

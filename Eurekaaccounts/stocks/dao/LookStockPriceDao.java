package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.vo.StockpricehistoryVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LookStockPriceDao extends BaseDAO{
    public LookStockPriceDao() {
    }
    BaseDAO baseDAO=new BaseDAO();
    public List<StockpricehistoryVO>  getstockpricehistory(String ticker , LocalDate date) throws SQLException {
        List<StockpricehistoryVO> stockpricehistoryVOS1=new ArrayList<>();
        String sqlQuerey= """
              select
              *
              from endeavour.stocks_price_history sph
              where sph.ticker_symbol=?
             and sph.trading_date between ? and ?
                """;
        PreparedStatement preparedStatement= connection.prepareStatement(sqlQuerey);
        preparedStatement.setString(1,ticker);
     preparedStatement.setDate(2, Date.valueOf(date.minusMonths(12)));
        preparedStatement.setDate(3,Date.valueOf(date));
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next()) {
            StockpricehistoryVO stockpricehistoryVO=new StockpricehistoryVO();
            stockpricehistoryVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
            stockpricehistoryVO.setTrading_date(resultSet.getDate("trading_date"));
            stockpricehistoryVO.setCloseprice(resultSet.getBigDecimal("close_price"));
            stockpricehistoryVO.setOpenprice(resultSet.getBigDecimal("open_price"));
            stockpricehistoryVO.setVolume(resultSet.getBigDecimal("volume"));
            stockpricehistoryVOS1 .add(stockpricehistoryVO);
        }
        return stockpricehistoryVOS1;
    }


}

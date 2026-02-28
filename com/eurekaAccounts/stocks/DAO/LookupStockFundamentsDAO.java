package com.eurekaAccounts.stocks.DAO;

import com.eurekaAccounts.stocks.stocksVO.StocksectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupStockFundamentsDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookupStockFundamentsDAO() throws SQLException {
    }

    public List<StocksectorVO> getStockFundamentals() throws SQLException {
        List<StocksectorVO> stocksectorVOS = new ArrayList<>();
        String sqlQuery =
                """
                
                        select
                                   sf.ticker_symbol, 
                                   sf.sector_id,
                                   sf.subsector_id,
                                   sf.market_cap,
                                   sf.current_ratio
                                   from endeavour.stock_fundamentals  sf 
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement3.executeQuery();
        //System.out.println(resultSet);
        while (resultSet.next()) {
            StocksectorVO stockFundementalsVO = new StocksectorVO();
            stockFundementalsVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));
            stocksectorVOS.add(stockFundementalsVO);
        }
        return stocksectorVOS;
    }
    public List<StocksectorVO> getBlueChipStocks() throws SQLException {
        List<StocksectorVO> BlueChipHealthcareList = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.market_cap
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            StocksectorVO BlueChipVO = new StocksectorVO();
            //BlueChipVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            BlueChipVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            BlueChipVO.setMarketCap(resultSet.getLong("market_cap"));


            BlueChipHealthcareList.add(BlueChipVO);
        }
        return BlueChipHealthcareList;
    }
}

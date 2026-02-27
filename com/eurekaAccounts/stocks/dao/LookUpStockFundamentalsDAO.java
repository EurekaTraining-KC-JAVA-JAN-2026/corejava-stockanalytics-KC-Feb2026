package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundementalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockFundamentalsDAO() throws SQLException {
    }

    public List<StockFundementalsVO> getStockFundamentals() throws SQLException {
        List<StockFundementalsVO> stockFundementalsVOS = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        //System.out.println(resultSet);

        while (resultSet.next()) {
            StockFundementalsVO stockFundementalsVO = new StockFundementalsVO();
            stockFundementalsVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));


            stockFundementalsVOS.add(stockFundementalsVO);
        }
        return stockFundementalsVOS;
    }

    public List<StockFundementalsVO> getSToptockFundamentals() throws SQLException {
        List<StockFundementalsVO> topStockFundementalsVOS = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            StockFundementalsVO stockFundementalsVO = new StockFundementalsVO();
            stockFundementalsVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));


            topStockFundementalsVOS.add(stockFundementalsVO);
        }
        return topStockFundementalsVOS;
    }
    public List<StockFundementalsVO> getBlueChipStocks() throws SQLException {
        List<StockFundementalsVO> BlueChipHealthcareList = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.market_cap
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            StockFundementalsVO BlueChipVO = new StockFundementalsVO();
            BlueChipVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            BlueChipVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            BlueChipVO.setMarketCap(resultSet.getLong("market_cap"));


            BlueChipHealthcareList.add(BlueChipVO);
        }
        return BlueChipHealthcareList;
    }


}

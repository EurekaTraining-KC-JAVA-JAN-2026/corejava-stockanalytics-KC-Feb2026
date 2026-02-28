package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO {

    public LookUpStockFundamentals() throws SQLException {
    }

    public List<StockFundamentalsVO> getAllStockFundamentalsDAO() throws SQLException {
        List<StockFundamentalsVO> allstockFundaments = new ArrayList<>();
        String SQuery = """
                        select *
                             from endeavour.stock_fundamentals sf\s
                            
                             ;
                         
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO(resultSet.getFloat("current_ratio"), resultSet.getFloat("debt_equity_ratio"), resultSet.getFloat("eps_ttm"),
                        resultSet.getFloat("eps_nxtyear"), resultSet.getFloat("epsqq"), resultSet.getFloat("forward_pe"), resultSet.getFloat("insider_ownership"),
                        resultSet.getDouble("market_cap"), resultSet.getInt("peg"), resultSet.getFloat("price_to_book_ratio"), resultSet.getFloat("roe"),
                        resultSet.getInt("sector_id"), resultSet.getInt("subsector_id"),
                        resultSet.getString("ticker_symbol"), resultSet.getFloat("trailing_pe"));
                allstockFundaments.add(stockFundamentalsVO);
            }

        } catch (SQLException e) {
            System.out.println("Error");
        }
        return allstockFundaments;
    }

    public List<StockFundamentalsVO> getSToptockFundamentals() throws SQLException {
        List<StockFundamentalsVO> topStockFundementalsVOS = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            StockFundamentalsVO stockFundementalsVO = new StockFundamentalsVO();
            stockFundementalsVO.setSector_id(resultSet.getInt("sector_id"));
            stockFundementalsVO.setSubsector_id(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarket_cap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrent_ratio(resultSet.getFloat("current_ratio"));


            topStockFundementalsVOS.add(stockFundementalsVO);
        }
        return topStockFundementalsVOS;
    }

    public List<StockFundamentalsVO> getBlueChipStocks() throws SQLException {
        List<StockFundamentalsVO> BlueChipHealthcareList = new ArrayList<>();
        String sqlQuery = """
                 select 
                     sf.ticker_symbol, sf.sector_id, sf.market_cap
                     from endeavour.stock_fundamentals  sf;
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        //preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            StockFundamentalsVO BlueChipVO = new StockFundamentalsVO();
            BlueChipVO.setSector_id(resultSet.getInt("sector_id"));
            BlueChipVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
            BlueChipVO.setMarket_cap(resultSet.getLong("market_cap"));


            BlueChipHealthcareList.add(BlueChipVO);
        }
        return BlueChipHealthcareList;


    }
}
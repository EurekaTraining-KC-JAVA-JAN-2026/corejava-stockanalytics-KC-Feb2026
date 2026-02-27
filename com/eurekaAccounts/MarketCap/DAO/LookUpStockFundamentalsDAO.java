package com.eurekaAccounts.MarketCap.DAO;

import com.eurekaAccounts.MarketCap.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO1 {

    public LookUpStockFundamentalsDAO() {
    }


    public List<StockFundamentalsVO> getHighestMarketCapFromSF()  {
        String sqlQuery = """
                  
                select *
                from endeavour.stock_fundamentals sf
                """;

        List<StockFundamentalsVO> stockFundamentalsVOList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
                stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
                stockFundamentalsVO.setSectorId(resultSet.getInt("sector_id"));
                stockFundamentalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
                stockFundamentalsVO.setMarketCap(resultSet.getBigDecimal("market_cap"));
                stockFundamentalsVO.setCurrentRation(resultSet.getFloat("current_ratio"));
                stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
                stockFundamentalsVOList.add(stockFundamentalsVO);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return stockFundamentalsVOList;
    }
}

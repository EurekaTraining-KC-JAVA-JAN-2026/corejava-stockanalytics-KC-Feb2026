package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO {

    public LookUpStockFundamentalsDAO() {
    }

    public List<StockFundamentalVO> getallStockFundemental() {
        List<StockFundamentalVO> stockFundamentalVO = new ArrayList<>();

        String sqlQuery = """
                select sf.ticker_symbol
                from endeavour.stock_fundamentals sf
                order by sf.market_cap desc
                limit 5
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
//            System.out.println(resultSet);
            while (resultSet.next()) {
                StockFundamentalVO stockFundamental = new StockFundamentalVO();
                stockFundamental.setTickerSymbol(resultSet.getString("ticker_symbol"));
//                stockFundamental.setSector_id(resultSet.getInt("sector_id"));
//                stockFundamental.setSubsector_id(resultSet.getInt("subsector_id"));
//                stockFundamental.setMarketCap(resultSet.getLong("market_cap"));
//                stockFundamental.setCurrent_ratio(resultSet.getFloat("current_ratio"));
                stockFundamentalVO.add(stockFundamental);
            }
//            System.out.println(stockFundamentalVO);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally from LookupStockFundamentalsDAO");
        }

        return stockFundamentalVO;
    }
}

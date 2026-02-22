package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO {
    List<StockFundamentalsVO> stockFundamentalVOS = new ArrayList<>();

    public LookUpStockFundamentals() {
    }

    public List<StockFundamentalsVO> getAllStockFundamentals() throws SQLException {
        String SqlQuery = """
                select sf.ticker_symbol, sf.sector_id, sf.subsector_id, sf.market_cap from endeavour.stock_fundamentals sf;
            """;

        PreparedStatement preparedStatement =  connection.prepareStatement(SqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            StockFundamentalsVO stockFundamentalVO = new StockFundamentalsVO();
            stockFundamentalVO.setSectorId(new BigDecimal(resultSet.getInt("sector_id")));
            stockFundamentalVO.setSubsectorId(new BigDecimal(resultSet.getInt("sector_id")));
            stockFundamentalVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalVO.setMarketCap(new BigDecimal(resultSet.getDouble("market_cap")));
            stockFundamentalVOS.add(stockFundamentalVO);
        }
        return stockFundamentalVOS;
    }
}
package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentals;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO {

    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockFundamentals() {
    }

    public List<StockFundamentals> getAllStockFundamentals() throws SQLException {
        String sqlquery = """
                select sf.ticker_symbol,
                sf.sector_id,
                sf.subsector_id,
                sf.market_cap, sf.current_ratio
                from endeavour.stock_fundamentals sf;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockFundamentals> stockFundementals = new ArrayList<>();
        while (resultSet.next()) {
            StockFundamentals stockFundementals1 = new StockFundamentals();
            stockFundementals1.setSectorId(resultSet.getBigDecimal("sector_id"));
            stockFundementals1.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementals1.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementals1.setMarketCap(resultSet.getBigDecimal("market_cap"));
            stockFundementals1.setCurrentRatio(resultSet.getFloat("current_ratio"));
            stockFundementals.add(stockFundementals1);
        }
        Collections.sort(stockFundementals);
        return stockFundementals;
    }
}



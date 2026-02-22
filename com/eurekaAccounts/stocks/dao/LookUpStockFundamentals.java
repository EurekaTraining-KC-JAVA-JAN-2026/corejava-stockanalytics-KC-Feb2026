package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO{
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockFundamentals() {
    }

    public List<StockFundamentalsVO> getAllStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
        String sqlQurey = """
            select\s
            	sf.ticker_symbol ,
            	sf.sector_id ,
            	sf.subsector_id ,
            	sf.market_cap\s
            	from endeavour.stock_fundamentals sf;
            """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQurey);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setSectorId(new BigDecimal(resultSet.getInt("sector_id")));
            stockFundamentalsVO.setSubSectorId(new BigDecimal(resultSet.getInt("subsector_id")));
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setMarketCap(new BigDecimal(resultSet.getDouble("market_cap")));
            stockFundamentalsVOS.add(stockFundamentalsVO);
        }
        return stockFundamentalsVOS;
    }
}

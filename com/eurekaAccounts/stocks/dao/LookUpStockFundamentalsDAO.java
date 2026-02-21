package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO{
    public LookUpStockFundamentalsDAO() {
    }

    public List<StockFundamentalsVO> getAllStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals= new ArrayList<>();
        String sqlQuery = """
                select
                    sf.ticker_symbol,
                    sf.sector_id,
                    sf.subsector_id,
                    sf.market_cap,
                    sf.current_ratio,
                    sf.price_to_book_ratio
                    from 
                        endeavour.stock_fundamentals sf;
                """;
        PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();

        while(resultSet.next()){
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setSectorID(resultSet.getInt("sector_id"));
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));
            stockFundamentalsVO.setMarketCap(resultSet.getDouble("market_cap"));
            stockFundamentalsVO.setSubSectorID(resultSet.getInt("subsector_id"));
            stockFundamentalsVO.setPriceToBookRatio(resultSet.getFloat("price_to_book_ratio"));
            allStockFundamentals.add(stockFundamentalsVO);
        }
        return allStockFundamentals;
    }

}


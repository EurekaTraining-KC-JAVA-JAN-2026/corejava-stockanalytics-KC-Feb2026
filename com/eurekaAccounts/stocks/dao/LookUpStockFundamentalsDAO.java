package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO {

    public LookUpStockFundamentalsDAO() throws SQLException {
        super();
    }

    public List<StockFundamentalsVO> getAllStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> list = new ArrayList<>();

        String sqlQuery = """
            select ticker_symbol, sector_id, subsector_id, market_cap
            from endeavour.stock_fundamentals;
        """;

        try (PreparedStatement ps = this.connection.prepareStatement(sqlQuery);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                StockFundamentalsVO vo = new StockFundamentalsVO();
                vo.setTickerSymbol(rs.getString("ticker_symbol"));
                vo.setSectorId(rs.getBigDecimal("sector_id"));
                vo.setSubsectorId(rs.getInt("subsector_id"));
                vo.setMarketCap(rs.getLong("market_cap"));

                list.add(vo);
            }
        }

        return list;
    }
}
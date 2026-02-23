package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.StockfundamentalVO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpStockFundamentalsDAO() throws SQLException {
    }


    public List<StockfundamentalVO> getAllStockFundamentals() throws SQLException {
        List<StockfundamentalVO> stockFundamentalsVOS = new ArrayList<>();
        String sqlQuery = """
                select 
                sf.ticker_symbol,
                sf.sector_id,
                sf.subsector_id,
                sf.market_cap,
                sf.current_ratio
                from endeavour.stock_fundamentals sf;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            StockfundamentalVO stockFundamentalsVO = new StockfundamentalVO();
            stockFundamentalsVO.setSectorId((resultSet.getInt("sector_id")));
            stockFundamentalsVO.setSubSectorId((resultSet.getInt("subsector_id")));
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setMarketCap((resultSet.getFloat("market_cap")));
            stockFundamentalsVO.setCurrentRatio(resultSet.getBigDecimal("current_ratio"));
            stockFundamentalsVOS.add(stockFundamentalsVO);
        }
        return stockFundamentalsVOS;
    }
}
package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.vo.StockfundamentalVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupStockfundamentalsDAO extends BaseDAO {

    public LookupStockfundamentalsDAO() throws SQLException {
    }

    public List<StockfundamentalVO> getAllstockfundamentals() throws SQLException {
        List<StockfundamentalVO> stockfundamental1 = new ArrayList<>();
        String sqlQuerey = """
                    select
                        *
               from  endeavour.stock_fundamentals sf
              """;
//        order by sf.market_cap desc
//        limit 5
        PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);
        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()) {
            StockfundamentalVO sff = new StockfundamentalVO();
            sff.setSector_id(resultSet.getInt("sector_id"));
            sff.setTicker_symbol(resultSet.getString("ticker_symbol"));
            sff.setCurrent_ratio(resultSet.getDouble("current_ratio"));
            sff.setSubsector_id(resultSet.getInt("subsector_id"));
            sff.setMarket_cap(resultSet.getBigDecimal("market_cap"));
            stockfundamental1.add(sff);
        }
        return stockfundamental1 ;
    }
}

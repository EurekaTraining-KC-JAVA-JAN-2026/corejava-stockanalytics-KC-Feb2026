package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.vo.stockfundamentalVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupStockfundamentalsDAO extends BaseDAO {
    public List<stockfundamentalVO> getAllstockfundamentals;

    public LookupStockfundamentalsDAO() throws SQLException {
    }

    public static List<stockfundamentalVO> getAllstockfundamentals(int subsector_id) throws SQLException {
        List<stockfundamentalVO> stockfundamental1 = new ArrayList<>();
        String sqlQuerey = """
              
                select
                                                *
                                                from
                                                endeavour.stock_fundamentals sf
              """;
        PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);
        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()) {
            stockfundamentalVO sff = new stockfundamentalVO();
            sff.setSector_id(resultSet.getInt("sector_id"));
            sff.setTicker_symbol(resultSet.getString("ticker_symbol"));
            stockfundamental1.add(sff);
        }
        return stockfundamental1 ;
    }
}

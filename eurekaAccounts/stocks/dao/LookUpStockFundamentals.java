package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.StockFundamentalsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentals extends BaseDAO {

    public LookUpStockFundamentals() throws SQLException {
    }

    public List<StockFundamentalsVO> getAllStockFundamentalsDAO() throws SQLException {
        List<StockFundamentalsVO> allstockFundaments= new ArrayList<>();
        String SQuery= """
                          select *
                             from endeavour.stock_fundamentals sf\s
                         
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO(resultSet.getFloat("current_ratio"), resultSet.getFloat("debt_equity_ratio"), resultSet.getFloat("eps_ttm"),
                        resultSet.getFloat("eps_nxtyear"), resultSet.getFloat("epsqq"), resultSet.getFloat("forward_pe"), resultSet.getFloat("insider_ownership"),
                        resultSet.getDouble("market_cap"), resultSet.getInt("peg"), resultSet.getFloat("price_to_book_ratio"), resultSet.getFloat("roe"),
                        resultSet.getInt("sector_id"), resultSet.getInt("subsector_id"),
                        resultSet.getString("ticker_symbol"), resultSet.getFloat("trailing_pe"));
                allstockFundaments.add(stockFundamentalsVO);
            }

        } catch (SQLException e) {
            System.out.println("Error");
        }
        return allstockFundaments;
    }
}

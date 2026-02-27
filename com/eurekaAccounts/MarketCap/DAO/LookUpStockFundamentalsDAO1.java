package com.eurekaAccounts.MarketCap.DAO;

import com.eurekaAccounts.MarketCap.StockFundamentalsVO;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStockFundamentalsDAO1 extends BaseDAO1{

    public LookUpStockFundamentalsDAO1() {
    }


    public List<StockFundamentalsVO> getHighestMarketCapFromSF1() {

        List<StockFundamentalsVO> stockFundamentalsVOList = new ArrayList<>();
        String sqlQuery = """
                select *
                from endeavour.stock_fundamentals sf
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
                stockFundamentalsVO.setSectorId(resultSet.getInt("sector_id"));
                stockFundamentalsVO.setMarketCap(resultSet.getBigDecimal("market_cap"));
                stockFundamentalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
                stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
                stockFundamentalsVO.setCurrentRation(resultSet.getFloat("current_ratio"));
                stockFundamentalsVOList.add(stockFundamentalsVO);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return stockFundamentalsVOList;
    }

    public BigDecimal getCountOfStates() throws SQLException {

        String sqlQuery =
                "select count(distinct sl.state_name) as total_states " +
                        "from endeavour.state_lookup sl";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        BigDecimal count = BigDecimal.ZERO;

        if(resultSet.next()){
            count = resultSet.getBigDecimal("total_states");
        }

        return count;
    }
}

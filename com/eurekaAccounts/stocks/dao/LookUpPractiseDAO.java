package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockFundementalVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpPractiseDAO extends BaseDAO{
     BaseDAO baseDao=new BaseDAO();
    public LookUpPractiseDAO() throws SQLException {
    }
    public List<StockFundementalVO> getallSectorsFromPractise() throws SQLException {
        List<StockFundementalVO> allfundementals =new ArrayList<>();
        String sqlQuery = """
                select
                *
                from\s
                endeavour.stock_fundamentals sf  where sf.market_cap >450000000;
                """;
        PreparedStatement p = connection.prepareStatement(sqlQuery);
       ResultSet resultSet = p.executeQuery();
      while(resultSet.next()){
      //    StockFundementalVO stockFundementalVO = new StockFundementalVO(resultSet.getString("ticker_symbol"),resultSet.getInt("sector_id"),resultSet.getInt("subsector_id"),resultSet.getLong("market_cap"));
     //  allfundementals.add(stockFundementalVO);
      }return allfundementals;
    }
}

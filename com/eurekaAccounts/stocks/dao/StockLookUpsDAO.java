package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockLookupVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockLookUpsDAO extends BaseDAO{
    public StockLookUpsDAO() {
    }
    public List<StockLookupVO> getAllStockLookUps() throws SQLException {
        List<StockLookupVO> AllStockLookups = new ArrayList<>();
        String sqlQuery = """
                select
                    *
                    from
                    endeavour.stocks_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            StockLookupVO stockLookupVO = new StockLookupVO();
            stockLookupVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockLookupVO.setTickerName(resultSet.getString("ticker_name"));
            AllStockLookups.add(stockLookupVO);
        }
        //System.out.println("");
        return AllStockLookups;


    }
}

package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LookUpStockFundementals extends BaseDAO{
    BaseDAO baseDAO = new BaseDAO();
    public LookUpStockFundementals() throws SQLException {
    }
    public List<StockFundementalVO> getAllStockFundementals() throws SQLException{
    List<StockFundementalVO> allStockFundemental = new ArrayList<>();
    String sqlQuery = """
                select
                *
                from endeavour.stock_fundamentals sf ;
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //above we r holding the sql query into an prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();
            //executing
            //System.out.println(resultSet);
            while (resultSet.next()) {
               StockFundementalVO stockFundementalVO = new StockFundementalVO(resultSet.getString("ticker_symbol"), resultSet.getBigDecimal("sector_id"), resultSet.getLong("market_cap"), resultSet.getInt("subsector_id"), resultSet.getBigDecimal("current_ratio"), resultSet.getBigDecimal("price_to_book_ratio"), resultSet.getBigDecimal("debt_equity_ratio"), resultSet.getBigDecimal("trailing_pe"), resultSet.getBigDecimal("forward_pe"), resultSet.getBigDecimal("insider_ownership"), resultSet.getBigDecimal("roe"), resultSet.getInt("peg"), resultSet.getBigDecimal("epsqq"), resultSet.getBigDecimal("eps_nxtyear"), resultSet.getBigDecimal("eps_ttm"));
              allStockFundemental.add(stockFundementalVO);
            }
        } catch (StockException | SQLException e) {
            System.out.println("Catch Block");
            e.getStackTrace();
            throw new StockException("An Exception occured while fetching data from db");
        }catch(RuntimeException e){
            throw new StockException("An throwable msg",e.getCause());
        }
        finally {
            System.out.println("finallyf");
            System.out.println("i will always run");
            //connection.close();
        }
        return allStockFundemental;
    }
}

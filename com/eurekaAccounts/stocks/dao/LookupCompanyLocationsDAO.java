package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;







































































































































































public class LookupCompanyLocationsDAO extends BaseDAO{
    BaseDAO baseDAO=new BaseDAO();

     public BigDecimal count;
    public LookupCompanyLocationsDAO() throws SQLException {

    }
    public List<CompanyLocationsVO> getAllCompanyLocations() throws SQLException{
        List<CompanyLocationsVO> allCompanyLocations = new ArrayList<>();
        String SqlQuery = """
                select * from endeavour.company_locations cl where cl.ticker_symbol ='AAPL'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO(resultSet.getString("ticker_symbol"),resultSet.getString("address"),resultSet.getString("city"),resultSet.getString("state"),resultSet.getBigDecimal("zip"),resultSet.getString("country"));
            allCompanyLocations.add(companyLocationsVO);
        }
        return allCompanyLocations;
    }

    public List<BigDecimal> getStatesCount() throws SQLException{
        List<BigDecimal> allStatesCount = new ArrayList<>();
        String SqlQuery = """
                select count(*)
                from endeavour.state_lookup sl
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            BigDecimal countstates = new BigDecimal(BigInteger.ZERO);

            allStatesCount.add(countstates);
        }
        return allStatesCount;
    }
}

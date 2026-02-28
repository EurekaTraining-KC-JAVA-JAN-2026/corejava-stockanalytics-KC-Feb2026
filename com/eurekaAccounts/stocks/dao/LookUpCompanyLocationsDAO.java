package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LookUpCompanyLocationsDAO extends BaseDAO {
    public LookUpCompanyLocationsDAO() {
    }
    public List<CompanyLocationsVO> getAllCompanyLocations() throws SQLException {
        List<CompanyLocationsVO> allLocations = new ArrayList<>();
        String sqlQuery = """
                select
                	*
                from
                	endeavour.company_locations cl 
                where
                	cl.ticker_symbol = 'AAPL';
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
            companyLocationsVO.setAddress(resultSet.getString("address"));
            companyLocationsVO.setCity(resultSet.getString("city"));
            companyLocationsVO.setState(resultSet.getString("state"));
            companyLocationsVO.setZipcode(resultSet.getBigDecimal("zip"));
            companyLocationsVO.setCountry(resultSet.getString("country"));
            companyLocationsVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
            allLocations.add(companyLocationsVO);
    }
        return allLocations;
    }
}

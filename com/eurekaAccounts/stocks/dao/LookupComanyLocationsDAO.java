package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupComanyLocationsDAO extends BaseDAO{
    public LookupComanyLocationsDAO() {
    }

    public List<CompanyLocationsVO> getCompanyLocation() throws SQLException {
        List<CompanyLocationsVO> companyLocationsVOS = new ArrayList<>();
        String sqlQuery = """
                select
                	*
                	from
                	endeavour.company_locations cl where cl.ticker_symbol = 'AAPL';
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            CompanyLocationsVO companyLocationsVO= new CompanyLocationsVO();
            companyLocationsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            companyLocationsVO.setAddress(resultSet.getString("address"));
            companyLocationsVO.setState(resultSet.getString("state"));
            companyLocationsVO.setCity(resultSet.getString("city"));
            companyLocationsVO.setZipCode(resultSet.getBigDecimal("zip"));
            companyLocationsVOS.add(companyLocationsVO);
        }
        return companyLocationsVOS;

    }
}

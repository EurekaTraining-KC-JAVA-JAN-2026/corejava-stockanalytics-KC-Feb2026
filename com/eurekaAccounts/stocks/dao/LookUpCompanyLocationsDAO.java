package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpCompanyLocationsDAO extends BaseDAO {
    public LookUpCompanyLocationsDAO() throws SQLException {
    }

    public List<CompanyLocationsVO> getCompanyLocation() throws SQLException {

        List<CompanyLocationsVO> companyLocationn = new ArrayList<>();
        String squlQuery = """
                select
                    *
                from
                	endeavour.company_locations cl
                where
                	cl.ticker_symbol = 'AAPL';
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(squlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
            companyLocationsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            companyLocationsVO.setAddress(resultSet.getString("address"));
            companyLocationsVO.setCity(resultSet.getString("city"));
            companyLocationsVO.setState(resultSet.getString("state"));
            companyLocationsVO.setCountry(resultSet.getString("country"));
            companyLocationsVO.setZip(resultSet.getBigDecimal("zip"));
            companyLocationn.add(companyLocationsVO);
        }
        return companyLocationn;
    }
}
package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LookUpCompanylocations extends BaseDAO{
    public LookUpCompanylocations() {
    }
    public List<CompanyLocationsVO> getallcompanydata() throws SQLException {
        List<CompanyLocationsVO> companyLocationsVOS = new ArrayList<>();
        String sqlquery = """
                select *
                from endeavour.company_locations cl
                where cl.ticker_symbol = 'AAPL'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
            companyLocationsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            companyLocationsVO.setAddress(resultSet.getString("address"));
            companyLocationsVO.setZip(resultSet.getString("zip"));
            companyLocationsVOS.add(companyLocationsVO);
        }

        return companyLocationsVOS;
    }
}

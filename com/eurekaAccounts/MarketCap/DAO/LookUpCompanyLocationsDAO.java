package com.eurekaAccounts.MarketCap.DAO;

import com.eurekaAccounts.MarketCap.CompanyLocationsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpCompanyLocationsDAO extends BaseDAO1 {

    public LookUpCompanyLocationsDAO() {
    }


    public List<CompanyLocationsVO> getCompanyLocationFromCL() throws SQLException {
        String sqlQuery = """
                select * from endeavour.company_locations cl
                 where cl.ticker_symbol ='AAPL';
                """;

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<CompanyLocationsVO> companyLocationsVOList = new ArrayList<>();
        while (resultSet.next()){
            CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
            companyLocationsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            companyLocationsVO.setAddress(resultSet.getString("address"));
            companyLocationsVOList.add(companyLocationsVO);
        }
        return companyLocationsVOList;
    }
}

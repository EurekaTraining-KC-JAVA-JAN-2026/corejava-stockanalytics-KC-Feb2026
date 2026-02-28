package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class companyLocation extends BaseDAO {

    public companyLocation() throws SQLException {

    }

    public List<CompanyLocationsDAO> companyLocation() throws SQLException {
        List<CompanyLocationsDAO> companyLocation = new ArrayList<>();
        String sqlQuery = """
                select 
                   * 
                    from
                    company_locations_staging cl where ticker symbol = "AAPL"
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery(sqlQuery);
        while (resultSet.next())
        {
            CompanyLocationsDAO companyLocationsDAO = new CompanyLocationsDAO();
            companyLocationsDAO.setAddress(resultSet.getString("address"));
            companyLocationsDAO.setCountry(resultSet.getString("country"));
            companyLocationsDAO.setState(resultSet.getString("state"));
            companyLocationsDAO.setZip(resultSet.getBigDecimal("zip"));
            companyLocation.add(companyLocationsDAO);

        }
        return  companyLocation;
        }

}


package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.Companylocation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LookUpCompanyLocationsDAO extends BaseDAO {


    public LookUpCompanyLocationsDAO() throws SQLException {
    }

    public List<Companylocation> getLookUpCompany() throws SQLException {
        List<Companylocation> companylocations = new ArrayList<>();

        String SQLQuery = """
                select cl.ticker_symbol,cl.address
                    from endeavour.company_locations cl
                    where cl.ticker_symbol ='AAPL'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
        while(resultSet.next()){
        Companylocation companyLocation1= new Companylocation();
        companyLocation1.setTicker_symbol(resultSet.getString("ticker_symbol"));
        companyLocation1.setAddress(resultSet.getString("address"));
//        companyLocation1.setCity(resultSet.getString("city"));
        companylocations.add(companyLocation1);

        }



        return companylocations;
    }
}

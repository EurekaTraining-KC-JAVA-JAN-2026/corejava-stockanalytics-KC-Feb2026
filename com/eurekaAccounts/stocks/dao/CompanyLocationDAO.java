package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyLocationDAO extends BaseDAO{

    public List<CompanyLocationsVo> getlocation() throws SQLException {
        List<CompanyLocationsVo> companyLocationsVos = new ArrayList<>();
        String sql = """
                select * from endeavour.company_locations cl where cl.ticker_symbol = 'AAPL' ;
                
                """;
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       ResultSet resultSet = preparedStatement.executeQuery();
       while (resultSet.next()) {
           CompanyLocationsVo companyLocationsVo = new CompanyLocationsVo();
           companyLocationsVo.setAddress(resultSet.getString("address"));
           companyLocationsVo.setCity(resultSet.getString("city"));
           companyLocationsVo.setCountry(resultSet.getString("country"));
           companyLocationsVos.add(companyLocationsVo);
       }
        return companyLocationsVos;
    }


}

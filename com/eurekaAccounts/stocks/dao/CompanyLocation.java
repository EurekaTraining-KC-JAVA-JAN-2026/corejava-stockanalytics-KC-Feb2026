package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyLocation extends BaseDAO {
    public CompanyLocation() {
    }

    public List<CompanyLocationsVO> getLocations() throws SQLException {
        List<CompanyLocationsVO> list1 = new ArrayList<>();
        try {
            String sqlquery = """
                    select cl.ticker_symbol,cl.address,cl.city,cl.zip
                    from endeavour.company_locations cl 
                    where cl.ticker_symbol='AIR'
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
                companyLocationsVO.setAddress(resultSet.getString("address"));
                companyLocationsVO.setCity(resultSet.getString("city"));
                companyLocationsVO.setZip(resultSet.getString("zip"));
                companyLocationsVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
                list1.add(companyLocationsVO);
            }
            }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return list1;
    }
}


package com.eurekaAccounts.stocks.DAO;

import com.eurekaAccounts.stocks.stocksVO.CompanyLocationVO;
import com.eurekaAccounts.stocks.stocksVO.SectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationDAO extends BaseDAO {
    public LocationDAO() throws SQLException {
    }

    public List<CompanyLocationVO> getAlllocations() throws SQLException {
        List<CompanyLocationVO> companyLocationVOS = new ArrayList<>();
        String s = """
                select
                count(*) as count
                from endeavour.state_lookup sl
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(s);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            CompanyLocationVO company = new CompanyLocationVO();
//            company.setState(resultSet.getString("state"));
//            company.setTickersymbol(resultSet.getString("ticker_symbol"));
//            company.setCity(resultSet.getString("city"));
//            company.setZip(resultSet.getInt("zip"));
            company.setCount(resultSet.getInt("count"));
            companyLocationVOS.add(company);
        }
        //System.out.println(resultSet);
        return companyLocationVOS;

    }

}

package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpLocationDAO extends BaseDAO {
    public LookUpLocationDAO() throws SQLException {

    }

    public List<CompanyLocationVO> getCompanydata() throws SQLException {
        List<CompanyLocationVO> Companydata = new ArrayList<>();
        String SqlQuery = """
                select *
                from endeavour.company_locations cl\s
                where cl.ticker_symbol  = 'AAPL'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery);
        //PreparedStatement);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            CompanyLocationVO companyLocationVO = new CompanyLocationVO();
            companyLocationVO.setTickersymbol(resultSet.getString("ticker_symbol"));
            companyLocationVO.setZip(resultSet.getInt("zip"));

            Companydata.add(companyLocationVO);

        }

        return Companydata;
    }

}

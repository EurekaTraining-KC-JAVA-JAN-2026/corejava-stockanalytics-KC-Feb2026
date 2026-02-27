package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyLocationsDAO extends BaseDAO{
    BaseDAO baseDAO =  new BaseDAO();

    public CompanyLocationsDAO() throws SQLException {
    }
    public List<CompanyLocationsVO> appleLocation() throws SQLException {
        List<CompanyLocationsVO> appleAddress =  new ArrayList<CompanyLocationsVO>();
        String sqlQuery = """
                select 
                   * 
                    from endeavour.company_locations cl where ticker_symbol = 'AAPL';
                """;


            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //preparedStatement.setInt(1,sectorId);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            //System.out.println(resultSet);

            while(resultSet.next())
            {
                CompanyLocationsVO companyLocationsVO = new CompanyLocationsVO();
                companyLocationsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
                companyLocationsVO.setAddress(resultSet.getString("address"));
                companyLocationsVO.setCity(resultSet.getString("city"));
                companyLocationsVO.setState(resultSet.getString("state"));
                companyLocationsVO.setZip(resultSet.getString("zip"));
                companyLocationsVO.setCountry(resultSet.getString("country"));
                appleAddress.add(companyLocationsVO);




            }
        return appleAddress;
    }
    public List<BigDecimal> getStateCount() throws SQLException {
        List<BigDecimal> stateCount =  new ArrayList<BigDecimal>();
        List<BigDecimal> count = List.of();
        String sqlQuery = """
                select count(distinct (cl.state)) as total from endeavour.company_locations cl where cl.state not in ('Invalid') ;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //preparedStatement.setInt(1,sectorId);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement.executeQuery();
        //System.out.println(resultSet);
        while(resultSet.next())
        {
            count.add(resultSet.getBigDecimal("total"));
        }
        return (List<BigDecimal>) count;

    }


    }


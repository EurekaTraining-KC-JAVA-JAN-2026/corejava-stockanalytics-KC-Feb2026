package com.EurekaAccounts.stocks.dao;

import com.EurekaAccounts.stocks.exception.StocksException;
import com.EurekaAccounts.stocks.vo.SectorVo;
import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO {
    BaseDAO baseDAO =  new BaseDAO();
    public LookUpDAO() throws SQLException {

    }

    public  List<SectorVo> getAllSectors() throws SQLException {

        List<SectorVo> allSectors =  new ArrayList<>();
        String sqlQuery = """
                select sf.ticker_symbol  from endeavour.stock_fundamentals sf where sf.sector_id =35
                """;
        try
        {

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //preparedStatement.setInt(1,sectorId);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            //System.out.println(resultSet);

            while(resultSet.next())
            {
                SectorVo sectorVO = new SectorVo();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
            //System.out.println(allSectors);
        }
        catch (StocksException  | SQLException e)
        {

            System.out.println("Catch Block");
            throw new StocksException("An exception occured while fetching data from database");
            //throw new StockException("An throwable message",e.getCause());
            //System.out.println(e.getStackTrace());
            //System.out.println(e);
        }
        catch (RuntimeException e)
        {

            throw new StocksException("A throwable message",e.getCause());
        }
        finally
        {
            System.out.println("Finally");
            System.out.println("I will always run");
            //connection.close();
        }
        return allSectors;

    }

    public  List<SectorVo> getSpecificSectorID() throws SQLException {

        List<SectorVo> specificSectors =  new ArrayList<>();
        int sectorId = 41;
        String sqlQuery = """
                select 
                   * 
                    from endeavour.sector_lookup ssl where ssl.sector_id = ?;
                """;
        PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery);
        preparedStatement2.setInt(1,sectorId);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement2.executeQuery();
        //System.out.println(resultSet);

        while(resultSet.next())
        {
            SectorVo sectorVO = new SectorVo();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSectors.add(sectorVO);
        }

        return specificSectors;
    }



}
package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class LookUpDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpDAO() throws SQLException {

    }

    public List<SectorVO> getAllSectors() throws SQLException {

        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQuery = """
                select 
                   * 
                    from endeavour.sector_lookup sl;
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
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
            //System.out.println(allSectors);
        }
        catch (StockException  | SQLException e)
        {

            System.out.println("Catch Block");
            throw new StockException("An exception occured while fetching data from database");
            //throw new StockException("An throwable message",e.getCause());
            //System.out.println(e.getStackTrace());
            //System.out.println(e);
        }
        catch (RuntimeException e)
        {

            throw new StockException("A throwable message",e.getCause());
        }
        finally
        {
            System.out.println("Finally");
            System.out.println("I will always run");
            //connection.close();
        }
        return allSectors;

    }

    public  List<SectorVO> getSpecificSectorID() throws SQLException {

        List<SectorVO> specificSectors =  new ArrayList<>();
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
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSectors.add(sectorVO);
        }

        return specificSectors;
    }



}
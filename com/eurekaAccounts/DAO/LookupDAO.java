package com.eurekaAccounts.DAO;

import com.eurekaAccounts.exception.StockException;
import com.eurekaAccounts.stocksVO.SectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();
    public LookupDAO() throws SQLException {
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
            PreparedStatement preparedstatement = connection.prepareStatement(sqlQuery);
            //preparedStatement.setInt(1,sectorId);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedstatement.executeQuery();
            //System.out.println(resultSet);


            while(resultSet.next())
            {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }

        }
        catch (StockException | SQLException e)
        {
            System.out.println("catch block");
            throw new StockException("An exception occured while fetching data from database");
        }
        catch (RuntimeException e)
        {
            throw new StockException("A throwable message",e.getCause());
        }
        finally {
            System.out.println("Finally");
            System.out.println("I will always run");

        }
        return allSectors;
    }

    public List<SectorVO> getSpecificSectorID() throws SQLException {
        List<SectorVO> specificSectors = new ArrayList<>();
        int sectorId = 41;
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup sl where sl.sector_id = ?;
                """;
        PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery);
        preparedStatement2.setInt(1,sectorId);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement2.executeQuery();
        //System.out.println(resultSet);

        while(resultSet.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSectors.add(sectorVO);
        }
        return specificSectors;
    }

}

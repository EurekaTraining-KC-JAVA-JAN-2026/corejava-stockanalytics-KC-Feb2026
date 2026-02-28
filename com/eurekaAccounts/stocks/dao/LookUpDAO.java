package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();
    public LookUpDAO() throws SQLException {
    }
    public List<SectorVO>getAllSectors()throws SQLException{
        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup ssl;
                """;
       try {
           PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
           //above we r holding the sql query into an prepared statement
           ResultSet resultSet = preparedStatement.executeQuery();
           //executing
           //System.out.println(resultSet);
           while (resultSet.next()) {
               SectorVO sectorVO = new SectorVO();
               sectorVO.setSectorId(resultSet.getInt("sector_id"));
               sectorVO.setSectorName(resultSet.getString("sector_name"));
               allSectors.add(sectorVO);
           }
        } catch (StockException | SQLException e) {
        System.out.println("Catch Block");
        throw new StockException("An Exception occured while fetching data from db");
        //System.out.println(e.getStackTrace());
    }catch(RuntimeException e){

           throw new StockException("An throwable msg",e.getCause());
       }
       finally {
        System.out.println("finallyf");
        System.out.println("i will always run");
        //connection.close();
    }
        return allSectors;
    }

}

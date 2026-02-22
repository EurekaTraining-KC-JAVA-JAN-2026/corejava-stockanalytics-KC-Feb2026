package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO{
    public LookUpDAO(){
    }

    public List<SectorVO> getAllSectors() {
        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQuery = """
                select
                	*
                from
                	endeavour.sector_lookup sl
                """;
        try{
            //storing the sql query

//            int x =10/0;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//            preparedStatement.setInt(1,sectorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            //executing and printing it
            System.out.println(resultSet);
//            List<SectorVO> allSectors = new ArrayList<>();
            while (resultSet.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
//            System.out.println(allSectors);
        }
        catch(SQLException | StockException e){
            System.out.println("FROM catch");
            throw new StockException("An exception occurred while fetching data from DB");
//            throw new StockException("An throwable msg", e.getCause());
//            System.out.println(e);
//            System.out.println(e.getStackTrace());
        }
        catch(RuntimeException e){
            throw new StockException("An Throwable msg", e.getCause());
        }
        finally {
            System.out.println("Finally");
        }
        return allSectors;
    }

}

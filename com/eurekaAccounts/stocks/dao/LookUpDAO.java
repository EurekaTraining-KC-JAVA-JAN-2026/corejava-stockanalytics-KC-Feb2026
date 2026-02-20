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

public class LookUpDAO extends BaseDAO{
    public LookUpDAO() {
    }
    public List<SubSectorVO> getAllSectorsDAO(int sectorId) throws SQLException{
        List<SubSectorVO> sectors = new ArrayList<>();
        String sqlQuery = """
                    select
                      *
                    from endeavour.sector_lookup sl where sl.sector_id = ?;
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,sectorId);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            //System.out.println(resultSet);
            while(resultSet.next())//
            {
                SubSectorVO sectorVO = new SubSectorVO();
                sectorVO.setSectorId(resultSet.getInt("sectorid"));
                sectorVO.setSubSectorName(resultSet.getString("sector_name"));
                sectors.add(sectorVO);
            }
        }catch (SQLException e){
            System.out.println("FROM CATCH");
            throw new StockException("An Exception occured while fetching the data from DB");
            // throw new StockException("An Throwable msg",e.getCause());
            //System.out.println(e);
        }catch(RuntimeException e) {
             throw new StockException("An throwable msg",e.getCause());
        }finally
         {
            System.out.println("FINALLY");
            System.out.println("I will always run");
            //connection.close();
        }
    return sectors;}
}

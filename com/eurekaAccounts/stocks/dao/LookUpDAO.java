package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class LookUpDAO extends BaseDAO{
    public LookUpDAO() throws SQLException {
    }

    public List<SectorVO> getAllSectorsDAO(int sectorId) throws SQLException{
        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQuery = """
                    
                select
                        *
                         from
                         	endeavour.sector_lookup sl where sl.sector_id = ?;
                    """;

            try{
                PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
                preparedStatement.setInt(1,sectorId);
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println(resultSet);
                while(resultSet.next()){
                    SectorVO sectorVO=new SectorVO();
                    sectorVO.setSectorId(resultSet.getInt("sector_id"));
                    sectorVO.setSectorName(resultSet.getString("sector_name"));
                    allSectors.add(sectorVO);
            }

        } catch (StockException | SQLException e) {
            System.out.println("FROM CATCH");
            throw new StockException(("An Exception occured while fetching data from DB"));
            //System.out.println(e);
        } catch(RuntimeException e){
            throw new StockException("An throwable msg" , e.getCause());

        } finally{
            System.out.println("FINALLY");
            System.out.println("I will always run");
            //connection.close();
        }
        return allSectors;
    }
}



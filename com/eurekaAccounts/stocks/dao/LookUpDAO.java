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

    public LookUpDAO() throws SQLException{
    }
    public List<SectorVO> getAllSectorsDAO() {
        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQurey = """
                select
                       	*
                        from
                            endeavour.sector_lookup sl ;
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQurey);
           // preparedStatement.setInt(1,sectorId);
            //above we are holding the sqlqurey into an prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();
            //excuting the qurey the result
            System.out.println(resultSet);

            while (resultSet.next()){
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }

        }catch (StockException | SQLException e){
            System.out.println("FROM CATCH");
            throw new StockException("An Exception occured while fecting data from DB",e.getCause());
            //System.out.println(e);
        }catch (RuntimeException e){
            throw new StockException("An throwable msg",e.getCause());
        }finally {
            System.out.println("FINALLY");
            System.out.println("I will always run");
            //connection.close();
        }
        return allSectors;
    }
}

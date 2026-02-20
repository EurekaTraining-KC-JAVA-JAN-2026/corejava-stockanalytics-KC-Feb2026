package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.exception.StocksException;
import eurekaAccounts.stocks.vo.SectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO {

    public LookUpDAO() throws SQLException {

    }



    public List<SectorVO> getAllSectorsDAO(int sector_id)  {
        List<SectorVO> allSectors = new ArrayList<>();
        String sqlQuery= """
                 select * 
                   from endeavour.sector_lookup sl
                   where sector_id=?
                 """;
        //connected to a database
       try {
           PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
           preparedStatement.setInt(1,sector_id);
           ResultSet resultSet = preparedStatement.executeQuery();
           // System.out.println(resultSet);
             while (resultSet.next()) {
               SectorVO sectorVO = new SectorVO();
               sectorVO.setSectorId(resultSet.getInt("sector_id"));
               sectorVO.setSectorName(resultSet.getString("sector_name"));

               allSectors.add(sectorVO);
           }


       } catch(StocksException | SQLException e){
           System.out.println(" Error");
           throw new StocksException("An Exception occurs while fectching data");

       } catch (RuntimeException e) {
           throw new StocksException("Throw Msg",e.getCause());

       }

       return allSectors;
    }

}



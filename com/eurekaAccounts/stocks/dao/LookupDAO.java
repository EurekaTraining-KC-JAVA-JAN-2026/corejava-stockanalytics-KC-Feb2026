package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupDAO extends BaseDAO {
    public LookupDAO() {
    }
    public List<SectorVO> getAllSectors(int sector_id) throws SQLException {
        try {
            String sqlQuery = """
                    select * from endeavour.sector_lookup sl where sl.sector_id=?""";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,sector_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            //executing the query result
            //System.out.println(preparedStatement);
            System.out.println(resultSet);
            List<SectorVO> allSectors = new ArrayList<>();
            while (resultSet.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
            return allSectors;
        } catch (StockException e) {
            System.out.println("From CATCH");
            throw new StockException("An exception occured while fetching from DB");
            //throw new StockException("An throwable msg ",e.getCause());
            //ystem.out.println(e);
        } catch(RuntimeException e){
            throw new StockException("An throwble msg",e.getCause());
        }
        finally {
            System.out.println("from final block");
            System.out.println("finally");
            connection.close();
        }
    }
}

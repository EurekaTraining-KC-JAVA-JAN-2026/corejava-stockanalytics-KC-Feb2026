package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LookupDAO extends BaseDAO {
    public LookupDAO() {
    }

    public List<SectorVO> getAllSectors() throws SQLException {
        List<SectorVO> allSectors = new ArrayList<>();
        try {
            String sqlQuery = """
                    select * from endeavour.sector_lookup sl""";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //preparedStatement.setInt(1,sector_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            //executing the query result
            //System.out.println(preparedStatement);
            System.out.println(resultSet);

            while (resultSet.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }

        } catch (StockException e) {
            System.out.println("From CATCH");
            throw new StockException("An exception occured while fetching from DB");
            //throw new StockException("An throwable msg ",e.getCause());
            //ystem.out.println(e);
        } catch (RuntimeException e) {
            throw new StockException("An throwble msg", e.getCause());
        } finally {
            System.out.println("from final block");
            System.out.println("finally");
            connection.close();
        }
        Collections.sort(allSectors);
        return allSectors;
    }
}

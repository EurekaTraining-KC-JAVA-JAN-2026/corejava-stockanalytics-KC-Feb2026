package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StocksException;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO{

    public LookUpDAO() {
    }
    BaseDAO baseDAO = new BaseDAO();

    public List<SubsectorVO> getAllSubSectors(int SectorId) throws SQLException {
       List<SubsectorVO> allSubSectors1 = new ArrayList<>();
        SectorId = 35;
        String sqlQuery = """
                select
                *
                from endeavour.subsector_lookup sl where sl.sector_id = ?;
               """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //Traditional way of writing sl.sector_id = 35;
            //With the newer version we can directly give sl.sector_id = 35;
            preparedStatement.setInt(1, SectorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SubsectorVO> allSubSectors = new ArrayList<>();
            while (resultSet.next()) {
                SubsectorVO subsectorVO = new SubsectorVO();
                subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
                subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
                subsectorVO.setSectorId(resultSet.getInt("sector_id"));
                allSubSectors.add(subsectorVO);
                System.out.println(allSubSectors);
                System.out.println("The Count of all Subsectors are : " + allSubSectors.size());
            }
        } catch (StocksException e) {
            System.out.println(e);
            System.out.println("From Catch");
            throw new StocksException("An Exception occured while fetching data from DB", e.getCause());

        } catch (RuntimeException e) {
            throw new StocksException("An throwable msg", e.getCause());
        }
        finally {
            System.out.println("Finally");
            System.out.println("I will always run");
            connection.close();
        }
        return allSubSectors1;
    }

}

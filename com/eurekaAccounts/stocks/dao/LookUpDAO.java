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

    public LookUpDAO() {
    }
    BaseDAO baseDAO = new BaseDAO();

    public List<SectorVO> getAllSectors() throws SQLException {
        List<SectorVO> sectorVOS = new ArrayList<>();
        String sqlQuery = """
                select\s
                *\s
                from endeavour.sector_lookup ssl;
                """;

        try {
            PreparedStatement preparedStatement =  connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                sectorVOS.add(sectorVO);
            }
        } catch (StockException | SQLException e) {
            System.out.println("From Catch");
            throw new StockException("An Exception occured while fetching data from DB", e.getCause());
        } catch (RuntimeException e) {
            throw new StockException("A throwable message",e.getCause());
        } finally {
            System.out.println("Finally");
            System.out.println("I will always print");
        }
        return sectorVOS;
    }

    public List<SubSectorVO> getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors1 = new ArrayList<>();
        //SectorId = 35;
        String sqlQuery = """
                select
                *
                from endeavour.subsector_lookup sl;
               """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //Traditional way of writing sl.sector_id = 35;
            //With the newer version we can directly give sl.sector_id = 35;
            // preparedStatement.setInt(1, SectorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SubSectorVO> allSubSectors = new ArrayList<>();
            while (resultSet.next()) {
                SubSectorVO subsectorVO = new SubSectorVO();
                subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
                subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
                subsectorVO.setSectorId(resultSet.getInt("sector_id"));
                allSubSectors.add(subsectorVO);
                //System.out.println(allSubSectors);
                //System.out.println("The Count of all Subsectors are : " + allSubSectors.size());
            }
        } catch (StockException e) {
            System.out.println(e);
            System.out.println("From Catch");
            throw new StockException("An Exception occured while fetching data from DB", e.getCause());

        } catch (RuntimeException e) {
            throw new StockException("An throwable msg", e.getCause());
        }
        finally {
            System.out.println("Finally");
            System.out.println("I will always run");
            connection.close();
        }
        return allSubSectors1;
    }

}
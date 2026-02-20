package com.EurekaAccounts.stocks.dao;

import com.EurekaAccounts.stocks.exception.StocksException;
import com.EurekaAccounts.stocks.vo.SectorVo;
import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO {
    BaseDAO baseDAO=new BaseDAO();
    public LookUpDAO() throws SQLException {

    }
    public List<SectorVo> getAllSectors() throws SQLException {
        //sector_id=35
        List<SectorVo> allSectors = new ArrayList<>();
        String sqlQuery = """
                select 
                *
                from endeavour.sector_lookup sl;
                """;

        //
        //                                                  = ?
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            //above we are holding the sqlquery into an prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();
            //executing the query the result
            //System.out.println(resultSet);

            while (resultSet.next()) {
                SectorVo sectorVo = new SectorVo();
                sectorVo.setSectorId(resultSet.getInt("sector_id"));
                sectorVo.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVo);
            }
        } catch (StocksException | SQLException e) {
            System.out.println("FROM CATCH");
            throw new StocksException("An Exception while fetching from DB");
            /* throw new StocksException("An"+e.getCause()); */
        } catch (RuntimeException e) {
            throw new StocksException("An Throwbale" + e.getCause());
        } finally {
            System.out.println("FINALLY");
            System.out.println("i will always run");

        }
        return allSectors;
    }

}
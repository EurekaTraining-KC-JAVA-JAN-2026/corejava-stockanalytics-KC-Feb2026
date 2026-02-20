package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO  extends BaseDAO {
    public LookUpDAO() throws SQLException {
    }  //it is calling getallsectors on a dao


    public List<SectorVO> getAllSectors() throws SQLException {
        List<SectorVO> allSectors = new ArrayList<>();
        //we need to pass sql query to connection

        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup ssl;
               
                
                """;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            //above we are holding the sqlquery into a prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();//convert from sql to proper query
            //executing the query and storing as the result set
            System.out.println(resultSet);
            //we connected to database, im trying to retrieve sector lookup
            //database only has query not strings
            //java understands only strings so,we did typecasting
            //typecasting here using prepared statement
            //List<SectorVO> allSubSectors1 = new ArrayList<>();
            //above created a list of sector VO

            while (resultSet.next()) {   //to iterate over the result set
                SectorVO sectorVO = new SectorVO(); //object of sectorVO
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                //mapping sector id to the sectorvo object
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);// we are adding it to allsectors

            }
            System.out.println(allSectors);
        } catch (StockException | SQLException e) {
            System.out.println("From Catch");
            throw new StockException(" an exception occured while fetching data from db");
            //System.out.println(e);
        } catch(RuntimeException e)

        {
            throw new StockException("An throwable msg",e.getCause());


        }

            finally
        {
            System.out.println("From finally");
            System.out.println("i will always run");
            //connection.close();

        }
        return allSectors;
    }
}








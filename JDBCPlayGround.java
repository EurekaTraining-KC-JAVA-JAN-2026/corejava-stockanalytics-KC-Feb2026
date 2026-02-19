import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    /**
     * Postgresql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcurl="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName= "evr_sql_app";
    private static String password="5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String [] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        //class, we got  connection method and pass these,instance of an db connection
        // System.out.println(connection);

        //retrieve the data from the DB
        getAllSectors(connection);
        getAllSubSectors(connection);
        getSpecificSector(connection);
        //getSpecificStockFundamental(connection); //get specific ticker symbol






    }
    private static void getAllSectors(Connection connection) throws SQLException {
        //we need to pass sql query to connection
        Integer sectorId=35;
        String sqlQuery= """
                select
                *
                from endeavour.sector_lookup sl where sl.sector_id =?;
               
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,sectorId);
        //above we are holding the sqlquery into a prepared statement
        ResultSet resultSet = preparedStatement.executeQuery();//convert from sql to proper query
        //executing the query and storing as the result set
        System.out.println(resultSet);
        //we connected to database, im trying to retrieve sector lookup
        //database only has query not strings
        //java understands only strings so,we did typecasting
        //typecasting here using prepared statement
        List< SectorVO> allSectors= new ArrayList<>();
        //above created a list of sector VO

        while(resultSet.next()){   //to iterate over the result set
            SectorVO sectorVO= new SectorVO(); //object of sectorVO
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            //mapping sector id to the sectorvo object
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);// we are adding it to allsectors

        }
        System.out.println(allSectors);


    }

    private static void getAllSubSectors(Connection connection) throws SQLException {

        String sqlQuery1= """
                select
                *
                from endeavour.subsector_lookup sl;
               
                
                """;
        PreparedStatement preparedStatement1=connection.prepareStatement(sqlQuery1);

        ResultSet resultset1=preparedStatement1.executeQuery();
        System.out.println(resultset1);
        List<SubSectorVO> allsubSectors= new ArrayList<>();

        while(resultset1.next()){
            SubSectorVO subSectorVO= new SubSectorVO();
            subSectorVO.setSubSectorId(resultset1.getInt("subsector_id"));
            subSectorVO.setSectorId(resultset1.getInt("sector_id"));
            subSectorVO.setSubSectorName(resultset1.getString("subsector_name"));
            allsubSectors.add(subSectorVO);

        }
       System.out.println(allsubSectors);
    }

    private static void getSpecificSector(Connection connection) throws SQLException {
        String sqlQuery2= """
                select
                *
                from
                endeavour.stocks_lookup sl
                
                """;
        PreparedStatement preparedStatement2=connection.prepareStatement(sqlQuery2);
        ResultSet resultSet2=preparedStatement2.executeQuery();
        System.out.println(resultSet2);


    }

}






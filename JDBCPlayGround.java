import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    /**
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */

    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String passWord = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String args[]) throws SQLException {
       Connection connection = DriverManager.getConnection(jdbcurl, userName, passWord);//instance of an DB connection.
        //System.out.println(connection);
        //retrieve the data from DB
        
        getAllSectors(connection);
        getAllSubSectors(connection);

    }

    private static void getAllSubSectors(Connection connection) throws  SQLException{
       Integer sectorId = 35;
        String sqlQuery = """
                select
                *
                from endeavour.subsector_lookup sl where sl.sector_id = ?;
               """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //Traditional way of writing sl.sector_id = 35;
        //With the newer version we can directly give sl.sector_id = 35;
        preparedStatement.setInt(1, sectorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubsectorVO> allSubSectors = new ArrayList<>();
        while (resultSet.next()) {
            SubsectorVO subsectorVO = new SubsectorVO();
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            allSubSectors.add(subsectorVO);
        }
        System.out.println(allSubSectors);
        System.out.println("The Count of all Subsectors are : " + allSubSectors.size());
    }

    private static void getAllSectors(Connection connection) throws SQLException{
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup sl;
               """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //above we are holding the sqlquery into an prepared statement
        ResultSet resultSet = preparedStatement.executeQuery();
        //execute the query result
        System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while (resultSet.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }
}

import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     * POSTGREsql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);//instance of DB connection
        //System.out.println(connection);
        //get the data from DB
        getALLSectors(connection);
        getAllSubSectors(connection);
      //  getSpecificSector(connection);
      //  getSpecificStockFundamental(connection,tickerSymbol);
    }

    private static void getALLSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from
                        endeavour.sector_lookup sl where sl.sector_id = 35;
                """;
       PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
       //above we are holding the sqlquery into an prepared statement
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing the query ,the result
        System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while (resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }
    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery1 = """
                select
                    *
                    from
                        endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);

        ResultSet resultSet1 = preparedStatement.executeQuery();

        System.out.println(resultSet1);

        List<SubSectorVO> allSubSectors = new ArrayList<>();
        while (resultSet1.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSectorId(resultSet1.getInt("sector_id"));
            subSectorVO.setSubSectorName(resultSet1.getString("subsector_name"));
            subSectorVO.setSubSectorId(resultSet1.getInt("subsector_id"));
            allSubSectors.add(subSectorVO);
        }
        System.out.println(allSubSectors);

    }
}

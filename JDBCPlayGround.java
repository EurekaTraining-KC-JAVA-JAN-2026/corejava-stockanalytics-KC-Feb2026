import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

        private static String jdbcurl ="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
        private static String userName = "evr_sql_app";
        private static String password ="5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection=DriverManager.getConnection(jdbcurl,userName,password);//instance of connection
        //System.out.println(connection);
        //retrieve the data from DB
        getAllSectors(connection);
        getAllSubSectors(connection);
        //getSpecificSector(connection);
        //getSpecificStockFundamental(connection,tickerSymbol);
    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery1= """
                select * from endeavour.subsector_lookup ssl where ssl.sector_id=35
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        ResultSet resultSet1=preparedStatement.executeQuery();
        System.out.println(resultSet1);
        List<SubSector> allSubSectors=new ArrayList<>();
        while(resultSet1.next()){
            SubSector subsector=new SubSector();
            subsector.setSubsectorId(resultSet1.getInt("subsector_id"));
            subsector.setSubSectorName(resultSet1.getString("subsector_name"));
            subsector.setSectorId(resultSet1.getInt("sector_id"));
            allSubSectors.add(subsector);
        }
        System.out.println(allSubSectors);
    }

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery= """
                select * from endeavour.sector_lookup sl
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        //executing the query result
        //System.out.println(preparedStatement);
        System.out.println(resultSet);
        List<SectorVO> allSectors=new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO=new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }


}

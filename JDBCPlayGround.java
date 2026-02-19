import com.eurekaAccount.sectorVO.SectorVO;
import com.eurekaAccount.sectorVO.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     *URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName= "evr_sql_app";
    private static String password= "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);//instance of DB connection
        //System.out.println(connection);
        //Get the data from DB
        //getAllSectors(connection);
        getAllSubSectors(connection);
//        getSpecificSector(connection);
//        getSpecificStockFundamental(connection,tickersymbol);
    }
private static void getAllSubSectors(Connection connection) throws SQLException{
        //Integer SectorId =34;
        String sqlQuery= """
                select
                    *
                        from endeavour.subsector_lookup sl
                        where sl.sector_id=34;
               """;
    PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
    ResultSet resultSet=preparedStatement.executeQuery();
    //preparedStatement.setInt(3,sectorId);
    //executing query
    System.out.println(resultSet);
        List<SubSectorVO> allSubSector=new ArrayList<>();
        while(resultSet.next()){
            SubSectorVO subSectorVO = new SubSectorVO(resultSet.getInt("sector_id"),
                    resultSet.getString("subsector_name"), resultSet.getInt("subsector_id"));
            allSubSector.add(subSectorVO);
        }
    System.out.println(allSubSector);

}
//    private static void getAllSectors(Connection connection) throws SQLException {
//        String sqlQuery = """
//                select
//                    *
//                    from
//                        endeavour.sector_lookup sl;
//                """;
//        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
//        ResultSet resultSet=preparedStatement.executeQuery();
//        //executing query;
//        System.out.println(resultSet);
//        List<SectorVO> allsectors= new ArrayList<>();
//        while(resultSet.next()){
//            SectorVO sectorVO = new SectorVO();
//            sectorVO.setSectorId(resultSet.getInt("sector_id"));
//            sectorVO.setSectorName(resultSet.getString("sector_name"));
//            allsectors.add(sectorVO);
//        }
//        System.out.println(allsectors);
//  }
}
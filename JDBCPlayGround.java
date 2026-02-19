import com.eurekaAccounts.stocksVO.SubSectorVO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     * URL:endeavourtech
     */
     private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
     private static String userName = "evr_sql_app";
     private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
       Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);//instance of DB connection
        //System.out.println(connection);
        //get the data from DB
        getAllSubSector(connection);
       // getSpecificSectorID(connection);
        // getSpecificStockFundamental(connection);
    }
    private static void getAllSubSector(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                *
                from 
                    endeavour.Subsector_lookup sl where sl.sector_id =35;
                
                """;
         PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        //System.out.println(resultSet);
        List<SubSectorVO> allSubSector = new ArrayList<>();
        while (resultSet.next()){
            SubSectorVO SubsectorVO = new SubSectorVO();
            SubsectorVO.setSubsectorid(resultSet.getInt("subsector_id"));
            SubsectorVO.setSubsectorname(resultSet.getString("subsector_name"));
            SubsectorVO.setSectorId(resultSet.getInt("sector_id"));
            SubSectorVO SubSectorVO;
            allSubSector.add(SubsectorVO);
        }
        System.out.println(allSubSector);

    }

}

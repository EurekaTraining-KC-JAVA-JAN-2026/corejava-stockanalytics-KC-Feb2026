package Demo_Practice;

import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Practice {
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl,userName,password);

        //getAllSectors(connection);

    }
    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                 select
                	*
                	from endeavour.sector_lookup sl where sl.sector_id=35;
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery(sqlQuery);
            System.out.println(resultSet);
            List<SectorVO> allSectors = new ArrayList<>();
            while(resultSet.next()){
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
            System.out.println(allSectors);
        } catch (SQLException e){
            System.out.println("From catch");
            System.out.println(e);
        }
        finally{
            System.out.println("I will always run");
        }
    }
}

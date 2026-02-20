import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     *  POSTGREEsql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     these are constants
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);//instance of DB connection
        System.out.println(connection);
        getAllSectors(connection,35);
        System.out.println(connection);
    }

    private static void getAllSectors(Connection connection,int sectorId) {

        String sqlQurey = """
                select
                       	*
                        from
                            endeavour.sector_lookup sl where sl.sector_id = ?;
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQurey);
            preparedStatement.setInt(1,sectorId);
            //above we are holding the sqlqurey into an prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();
            //excuting the qurey the result
            System.out.println(resultSet);
            List<SectorVO> allSectors = new ArrayList<>();
            while (resultSet.next()){
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);
            }
            System.out.println(allSectors);
        }catch (SQLException e){
            System.out.println("FROM CATCH");
            System.out.println(e);
        }finally {
            System.out.println("FINALLY");
            System.out.println("I will always run");
            //connection.close();
        }
    }

}
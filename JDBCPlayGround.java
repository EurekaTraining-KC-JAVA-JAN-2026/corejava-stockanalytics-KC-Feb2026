import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

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
        //getAllSubSectors(connection);
        getSpecificSectorID(connection);
        //getSpecificStockFundamental(connection);
    }

    private static void getSpecificStockFundamental(Connection connection) {
    }

    private static void getSpecificSectorID(Connection connection) {
    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        List<SubSectorVO> allsubsectors= new ArrayList<>();
        while(resultSet.next()){
            SubSectorVO subSectorVO=new SubSectorVO();
            subSectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subSectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            allsubsectors.add(subSectorVO);
        }
        System.out.println(allsubsectors.size());
        System.out.println(allsubsectors);

    }

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.sector_lookup sl where sl.sector_id = 34;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        //executing query
        System.out.println(resultSet);
        List<SectorVO> allsectors= new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        System.out.println(allsectors);

    }
}

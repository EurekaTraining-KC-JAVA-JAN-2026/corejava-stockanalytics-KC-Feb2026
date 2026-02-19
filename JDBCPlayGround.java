import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    private static String jdbcUrl ="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args )throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
        //System.out.println(connection);
        getAllSectors(connection);
        getAllSubSectors(connection);

//       Assignment
//       getSpecificSectorID(connection);
//       getSpecificStockFundamental(connection);
//        Use Ticker Symbol


    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    * 
                    from 
                        endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
        List<SubsectorVO> allSubSectors = new ArrayList<>();
        while (resultSet.next()){
            SubsectorVO subsectorVO = new SubsectorVO();
            subsectorVO.setSubsectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubsectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subsectorVO);
        }
        String allsubSectors;
        System.out.println(allSubSectors);

    }

    private static void getAllSectors(Connection connection) throws SQLException{
        String sqlQuery = """
                select
                    * 
                    from 
                        endeavour.sector_lookup sl ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //Holding Query in Prepared Statement
        ResultSet resultSet = preparedStatement.executeQuery();
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

}

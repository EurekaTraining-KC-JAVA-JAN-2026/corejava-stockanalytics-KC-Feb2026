import Eurekaaccounts.stocks.vo.SectorVO;
import Eurekaaccounts.stocks.vo.SubsectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {


    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        getAllSectors(connection);
        getAllSubSectores(connection);
//        getSpecificSectorid(connection);//get specific sector id
//        getSpecificStockFundamentlals(); ///specific ticker symbol
    }

    private static void getAllSectors(Connection connection) throws SQLException {
      //Integer sectorid=35;
        //preparedstatemt
        String sqlQuerey = """
               select
               *
                from   
               endeavour.sector_lookup sl;
              """;
        PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);

//        System.out.println(prepareStatement);
        ResultSet resultSet = prepareStatement.executeQuery();
        //executing the query the result
//        System.out.println(resultSet);
        List<SectorVO> allsectors = new ArrayList<>();
        while (resultSet.next()) {

            SectorVO sectorVO = new SectorVO();
            sectorVO.setSector_id(resultSet.getInt("sector_id"));
            sectorVO.setSector_name(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        System.out.println(allsectors);
    }
    private static void getAllSubSectores(Connection connection) throws SQLException {
        String sqlQuerey = """
               select
               *
                from   
               endeavour.subsector_lookup sl
              """;
        PreparedStatement prepareStatement1 = connection.prepareStatement(sqlQuerey);
        ResultSet resultSet1 = prepareStatement1.executeQuery();
        List<SubsectorVO> allSubsectors = new ArrayList<>();
        while (resultSet1.next()) {
            SubsectorVO  subSectorVO= new SubsectorVO();
             subSectorVO.setSubsector_id(resultSet1.getInt("subsector_id"));
             subSectorVO.setSubsector_name(resultSet1.getString("subsector_name"));
            subSectorVO.setSector_id(resultSet1.getInt("sector_id"));
             allSubsectors.add(subSectorVO);
        }
        System.out.println(allSubsectors);
    }
}

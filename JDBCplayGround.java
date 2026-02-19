import com.EurekaAccounts.stocks.vo.SectorVo;
import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCplayGround {
    /**
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcurl="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName="evr_sql_app";
    private static String password="5LViU5pLkSjRHECec9NF4wRxxV";

    static void main(String[] args) throws SQLException {
       Connection connection= DriverManager.getConnection(jdbcurl,userName,password);  // instance of a DB connection
       // System.out.println(connection);
        //get the data from DB
        getAllSectors(connection);
        getAllSubSectors(connection);
       // getSpecificsector(connection,35);
      //  getSpecificStockFundamental(connection,tickerSymbol);

        //subsector_lookup sl;
    }

    private static void getAllSubSectors(Connection connection)throws SQLException {
        String sqlQuery1= """
                  select 
                *
                from endeavour.subsector_lookup sl;
                """;
        // the line stores in string format
        PreparedStatement preparedStatement1 =connection.prepareStatement(sqlQuery1);
        ResultSet resultSet1 =preparedStatement1.executeQuery();
        System.out.println(resultSet1);
        List<SubSectorVo> allSubsectors=new ArrayList<>();
        while(resultSet1.next()){
            SubSectorVo subSectorVo= new SubSectorVo();
            subSectorVo.setSectorName(resultSet1.getString("subSector_name"));
            subSectorVo.setSubSectorId(resultSet1.getInt("subSector_id"));
            subSectorVo.setSectorId(resultSet1.getInt("Sector_id"));

            allSubsectors.add(subSectorVo);
        }
        System.out.println(allSubsectors);

        System.out.println("this is end of sub sectors");
    }




    private static void getAllSectors(Connection connection) throws SQLException {
        //sector_id=35
        String sqlQuery= """
                select 
                *
                from endeavour.sector_lookup sl where sl.sector_id=35;
                """;

        //                                                  = ?
        PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
        //preparedStatement.getInt(parameter:1,sector_id)
        //above we are holding the sqlquery into an prepared statement
       ResultSet resultSet= preparedStatement.executeQuery();
       //executing the query the result
       System.out.println(resultSet);
        List<SectorVo> allSectors=new ArrayList<>();
        while(resultSet.next()){
            SectorVo sectorVo =new SectorVo();
            sectorVo.setSectorId(resultSet.getInt("sector_id"));
            sectorVo.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVo);
        }
        System.out.println(allSectors);
        System.out.println("this is end of sectors");
    }




}

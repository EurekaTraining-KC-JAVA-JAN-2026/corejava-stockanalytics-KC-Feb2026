import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     * POSTGREEsql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     * These are constraints
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args)throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
        System.out.println(connection);
        getAllSectors(connection, 35);
        System.out.println(connection);


        // Instance of DB Connection
        // System.out.println(connection);
        // Get the data from DB
        //getAllSectors(connection);
        getAllSubSectors(connection);
        getSpecificSectorID(connection); //sectortable
        getSpecificStockFundamental(connection); //Stock Fundamental table

    }
    private static void getSpecificStockFundamental(Connection connection) throws SQLException {
        String sqlquery = """
                select
                	*
                from
                	endeavour.stock_fundamentals sf
                where
                	sf.subsector_id = 300;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubSectorVO> specificStockFundamental = new ArrayList<>();
        while (resultSet.next()) {
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            subSectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            specificStockFundamental.add(subSectorVO);
        }
        System.out.println("Trying to get Stock Fundamental: "+specificStockFundamental);
    }
    private static void getSpecificSectorID(Connection connection) throws SQLException {
        String sqlquery = """
                     select
                     	*
                     from
                     	endeavour.sector_lookup sl
                     where
                     	sl.sector_id = 40 ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SectorVO> specificSectorID = new ArrayList<>();
        while (resultSet.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSectorID.add(sectorVO);

        }
        System.out.println("Printing the SectorId: "+specificSectorID);

    }
    private static void getAllSubSectors(Connection connection) throws SQLException {
        Integer sectorId = 35;
        String sqlquery = """
                     select
                          *
                      from endeavour.subsector_lookup sl where sl.sector_id = ? ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        preparedStatement.setInt(1, sectorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubSectorVO> SubSectors = new ArrayList<>();
        while (resultSet.next()) {
            SubSectorVO subsectorVO = new SubSectorVO();
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            SubSectors.add(subsectorVO);

        }
         System.out.println(SubSectors);

    }

    private static void getAllSectors(Connection connection, int sectorID) throws SQLException {

        String sqlQuery = """
                    select
                      *
                    from endeavour.sector_lookup sl where sl.sector_id = ?;
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            //preparedStatement.setInt(1,sectorId);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            //System.out.println(resultSet);
            List<SectorVO> allSectors =  new ArrayList<>();
            while(resultSet.next())//
            {
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



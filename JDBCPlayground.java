import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockSectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayground {
    /**
     * POSTGREEsql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);// instance of DB connection
        //System.out.println(connection);
        //get the data from DB
        //getAllSectors(connection);
        //getAllSubSector(connection);

        getSpecificSectorID(connection);
    }
//private static void getAllSubSector(Connection connection) throws SQLException{
//        String sqlQuery= """
//                 select
//                	*
//                    from
//                	endeavour.subsector_lookup sl ;
//                """;
//    PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//    ResultSet resultSet = preparedStatement.executeQuery();
//    System.out.println(resultSet);
//    List<SubSectorVO> allSubSectorVO= new ArrayList<>();
//    while (resultSet.next()){
//        SubSectorVO SubSectorVO = new SubSectorVO(resultSet.getInt("sector_id"), resultSet.getString("subsector_name"),
//                resultSet.getInt("subsector_id"));
//        allSubSectorVO.add(SubSectorVO);


//    }
//    System.out.println(allSubSectorVO);
// }







//    private static void getAllSectors(Connection connection) throws SQLException {
//        String sqlQurey = """
//                select
//                    *
//                    from
//                        endeavour.sector_lookup sl ;
//                """;
//        PreparedStatement preparedStatement = connection.prepareStatement(sqlQurey);
//        // above we are holding the sqlqurey into an prepared statement
//        ResultSet resultSet = preparedStatement.executeQuery();
//        //executing the qurey the result
//        System.out.println(resultSet);
//        List<SectorVO> allSectors = new ArrayList<>();
//        while (resultSet.next()){
//            SectorVO sectorVO = new SectorVO();
//            sectorVO.setSectorId(resultSet.getInt("sector_id"));
//            sectorVO.setSectorName(resultSet.getString("sector_name"));
//            allSectors.add(sectorVO);
//
//        }
//        System.out.println(allSectors);
//
//    }

private static void getSpecificSectorID(Connection connection) throws SQLException{
        String sqlQuery= """
                  select
                 	sf.ticker_symbol,
                 	sf.sector_id,
                 	sf.subsector_id,
                 	sf.market_cap,
                 	sf.current_ratio
                 from
                 	endeavour.stock_fundamentals sf
                 where
                 	sf.sector_id = 44;
                """;
    PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
    ResultSet resultSet = preparedStatement.executeQuery();
    List<StockSectorVO> specificSector= new ArrayList<>();
    while (resultSet.next()){
        StockSectorVO stockSectorVO = new StockSectorVO(resultSet.getString("ticker_symbol"),
                resultSet.getInt("sector_id"),
                resultSet.getInt("subsector_id"),
                resultSet.getBigDecimal("market_cap"),
                resultSet.getFloat("current_ratio") );
        specificSector.add(stockSectorVO);


    }
    System.out.println(specificSector);

}

}

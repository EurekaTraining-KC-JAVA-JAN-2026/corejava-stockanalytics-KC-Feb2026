import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /*
    URL:endeavourtech.ddns.net
Database: StocksDB
Port: 50271
Username=evr_sql_app
Password=5LViU5pLkSjRHECec9NF4wRxxV
     */

    private static String jdbcUrl ="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String  userName = "evr_sql_app";
    private static String password="5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
       Connection connection =  DriverManager.getConnection(jdbcUrl,userName,password);//instance of db connection
        //we need driver to conect with postgresql database
        //java package from postgresql
        //retreive the data from the db
        getAllSectors(connection);
        getAllSubSectors(connection);
        //Assignment
        getSpecificSectorID(connection,34);
        getSpecificStockFundemental(connection,"AAPL");//specific ticker symbol uh should pass ticker symbol and get all values
        //
    }
    private static void getAllSubSectors(Connection connection) throws SQLException{
        String sqlQuery = """
                select
                *
                from
                endeavour.subsector_lookup sl ;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet1 = preparedStatement.executeQuery();
        //getAllSectors(Connection connection,tickerSymbol)throws SQLException
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        while(resultSet1.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSubSector_id(resultSet1.getInt("subsector_id"));
            subSectorVO.setSubSector_name(resultSet1.getString("subsector_name"));
            subSectorVO.setSector_id(resultSet1.getInt("sector_id"));
            allSubSectors.add(subSectorVO);
        }
        System.out.println(allSubSectors);
    }

    private static void  getAllSectors(Connection connection)throws SQLException {
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup sl where sl.sector_id =35;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //above we r holding the sql query into an prepared statement
        ResultSet resultSet = preparedStatement.executeQuery()  ;
        //executing
       // System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }

//specific sector
    private static void  getSpecificSectorID(Connection connection,int sectorId)throws SQLException {
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup sl where sl.sector_id =?;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //above we r holding the sql query into an prepared statement
   preparedStatement.setInt(1,sectorId);
        ResultSet resultSet = preparedStatement.executeQuery()  ;
        //executing
        // System.out.println(resultSet);
        List<SectorVO> specificSector = new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSector.add(sectorVO);
        }
        System.out.println(specificSector);
    }
    //specific stock fundemental
    private static void  getSpecificStockFundemental(Connection connection, String tickerSymbol) {
        String sqlQuery = """
                select
                *
                from endeavour.stock_fundamentals sf where sf.ticker_symbol =?;
                """;
        System.out.println("printing fundemental stocks");
       try {
           PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

           preparedStatement.setString(1, tickerSymbol);
           //above we r holding the sql query into an prepared statement
           ResultSet resultSet = preparedStatement.executeQuery();
           //executing
           // System.out.println(resultSet);
           List<StockFundementalVO> allStockList = new ArrayList<>();
           while (resultSet.next()) {
              // StockFundementalVO specificTicker = new StockFundementalVO(resultSet.getString("ticker_symbol"), resultSet.getInt("sector_id"), resultSet.getLong("market_cap"), resultSet.getInt("subsector_id"), resultSet.getBigDecimal("current_ratio"), resultSet.getBigDecimal("price_to_book_ratio"), resultSet.getBigDecimal("debt_equity_ratio"), resultSet.getBigDecimal("trailing_pe"), resultSet.getBigDecimal("forward_pe"), resultSet.getBigDecimal("insider_ownership"), resultSet.getBigDecimal("roe"), resultSet.getInt("peg"), resultSet.getBigDecimal("epsqq"), resultSet.getBigDecimal("eps_nxtyear"), resultSet.getBigDecimal("eps_ttm"));
              // allStockList.add(specificTicker);
           }
           System.out.println(allStockList);
       } catch (SQLException e) {
           System.out.println("Catch Block");
           System.out.println(e);

       }
       finally {
           System.out.println("finallyf");
           System.out.println("i will always run");
           //connection.close();
       }
//      PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

//        preparedStatement.setString(1,tickerSymbol);
//        //above we r holding the sql query into an prepared statement
//        ResultSet resultSet = preparedStatement.executeQuery()  ;
//        //executing
//        // System.out.println(resultSet);
//        List<StockFundementalVO> allStockList = new ArrayList<>();
//        while(resultSet.next()){
//            StockFundementalVO specificTicker = new StockFundementalVO(resultSet.getString("ticker_symbol"),resultSet.getInt("sector_id"),resultSet.getLong("market_cap"),resultSet.getInt("subsector_id"),resultSet.getBigDecimal("current_ratio"),resultSet.getBigDecimal("price_to_book_ratio") ,resultSet.getBigDecimal("debt_equity_ratio"),resultSet.getBigDecimal("trailing_pe"),resultSet.getBigDecimal("forward_pe"),resultSet.getBigDecimal("insider_ownership"),resultSet.getBigDecimal("roe"),resultSet.getInt("peg"),resultSet.getBigDecimal("epsqq"),resultSet.getBigDecimal("eps_nxtyear"),resultSet.getBigDecimal("eps_ttm"));
//           allStockList.add(specificTicker);
//        }
//        System.out.println(allStockList);
    }


}

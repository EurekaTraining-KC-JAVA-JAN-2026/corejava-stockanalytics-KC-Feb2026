import com.eurekaAccounts.stocks.vo.SectLookVO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    /**
     * Postgresql
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        //class, we got  connection method and pass these,instance of an db connection
        // System.out.println(connection);

        //retrieve the data from the DB
        //getAllSectors(connection);
        // getAllSubSectors(connection);
       // getSpecificSector(connection);
        getSpecificStockFundamental(connection,"GEO");
        //get specific ticker symbol


    }

    private static void getAllSectors(Connection connection)  {
        //we need to pass sql query to connection
        Integer sectorId = 35;
        String sqlQuery = """
                select
                *
                from endeavour.sector_lookup sl where sl.sector_id =?;
               
                
                """;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, sectorId);
            //above we are holding the sqlquery into a prepared statement
            ResultSet resultSet = preparedStatement.executeQuery();//convert from sql to proper query
            //executing the query and storing as the result set
            System.out.println(resultSet);
            //we connected to database, im trying to retrieve sector lookup
            //database only has query not strings
            //java understands only strings so,we did typecasting
            //typecasting here using prepared statement
            List<SectorVO> allSectors = new ArrayList<>();
            //above created a list of sector VO

            while (resultSet.next()) {   //to iterate over the result set
                SectorVO sectorVO = new SectorVO(); //object of sectorVO
                sectorVO.setSectorId(resultSet.getInt("sector_id"));
                //mapping sector id to the sectorvo object
                sectorVO.setSectorName(resultSet.getString("sector_name"));
                allSectors.add(sectorVO);// we are adding it to allsectors

            }
            System.out.println(allSectors);
        }catch(SQLException e){
            System.out.println("From Catch");
            System.out.println(e);
        }finally{
            System.out.println("From finally");
            System.out.println("i will always run");
        }


    }

    private static void getAllSubSectors(Connection connection) throws SQLException {

        String sqlQuery1 = """
                select
                *
                from endeavour.subsector_lookup sl;
               
                
                """;
        PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery1);

        ResultSet resultset1 = preparedStatement1.executeQuery();
        System.out.println(resultset1);
        List<SubSectorVO> allsubSectors = new ArrayList<>();

        while (resultset1.next()) {
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSubSectorId(resultset1.getInt("subsector_id"));
            subSectorVO.setSectorId(resultset1.getInt("sector_id"));
            subSectorVO.setSubSectorName(resultset1.getString("subsector_name"));
            allsubSectors.add(subSectorVO);

        }
        System.out.println(allsubSectors);
    }

    private static void getSpecificSector(Connection connection) throws SQLException {
        String sqlQuery2 = """
                select
                  *
                  from
                 endeavour.sector_lookup sl where sl.sector_name ='Energy';
                
                
                """;
        PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
        ResultSet resultSet2 = preparedStatement2.executeQuery();
        System.out.println(resultSet2);

        List<SectLookVO> allsectLookVO = new ArrayList<>();
        while (resultSet2.next()) {
            SectLookVO sectLookVO = new SectLookVO();
            sectLookVO.setSectorId(resultSet2.getInt("sector_id"));
            sectLookVO.setSectorName(resultSet2.getString("sector_name"));
            allsectLookVO.add(sectLookVO);


        }
        System.out.println(allsectLookVO);

    }


    private static void getSpecificStockFundamental(Connection connection,String tickerSymbol) throws SQLException {

        String sqlQuery3 = """
                select
                *
                from
                endeavour.stock_fundamentals sf where sf.ticker_symbol= ?;
                
                
                """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery3);
        preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet3 = preparedStatement3.executeQuery();
        System.out.println(resultSet3);
        List<StockFundamentalVO> specificstockVO = new ArrayList<>();

        while (resultSet3.next()) {
            StockFundamentalVO stockFundamentalVO = new StockFundamentalVO(
                    resultSet3.getString("ticker_symbol"),
                    resultSet3.getInt("sector_id"),
                    resultSet3.getInt("subsector_id"),
                    resultSet3.getBigDecimal("market_cap"),
                    resultSet3.getBigDecimal("current_ratio"),
                    resultSet3.getBigDecimal("price_to_book_ratio"),
                    resultSet3.getBigDecimal("peg"),
                    resultSet3.getBigDecimal("epsqq"),
                    resultSet3.getBigDecimal("eps_nxtyear"),
                    resultSet3.getBigDecimal("eps_ttm"),
                    resultSet3.getBigDecimal("roe"),
                    resultSet3.getBigDecimal("insider_ownership"),
                    resultSet3.getBigDecimal("debt_equity_ratio"),
                    resultSet3.getBigDecimal("trailing_pe"),
                    resultSet3.getBigDecimal("forward_pe"));


            specificstockVO.add(stockFundamentalVO);
        }
        System.out.println(" getSpecificStockFundamental" + specificstockVO);
    }
}
//the output will still run but we will get meaningful exceptions in the o/p










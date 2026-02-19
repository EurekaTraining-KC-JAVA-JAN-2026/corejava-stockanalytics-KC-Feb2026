import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    //    URL:endeavourtech.ddns.net
//    Database: StocksDB
//    Port: 50271
//    Username=evr_sql_app
//    Password=5LViU5pLkSjRHECec9NF4wRxxV
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";

    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);//instance of Db connection
//        System.out.println(connection);
//        getAllSectors(connection);
//        getAllSubSectors(connection);
        getSpecificSectorID(connection, 35);
        getSpecificStockFundemental(connection,"AAPL");

    }

    private static void getSpecificStockFundemental(Connection connection, String tickerSymbol) throws SQLException {
        String sqlQuery = """
                select
                                        *
                                       from
                                endeavour.stock_fundamentals sf where sf.ticker_symbol = ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
        List<StockFundamentalVO> stockFundamentalVO = new ArrayList<>();
        while(resultSet.next()){
            StockFundamentalVO stockFundamental = new StockFundamentalVO();
            stockFundamental.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamental.setSector_id(resultSet.getInt("sector_id"));
            stockFundamental.setSubsector_id(resultSet.getInt("subsector_id"));
            stockFundamental.setMarketCap(resultSet.getLong("market_cap"));
            stockFundamental.setCurrent_ratio(resultSet.getFloat("current_ratio"));
            stockFundamentalVO.add(stockFundamental);
        }
        System.out.println(stockFundamentalVO);
    }

    private static void getSpecificSectorID(Connection connection, int sectorId) throws SQLException {

        String sqlQuery = """
                    select
                	*
                    from
                	endeavour.sector_lookup sl where sl.sector_id =?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,sectorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SectorVO> allsectors = new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);

        }
        System.out.println(allsectors);


    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery1 = """
                select
                	*
                from
                	endeavour.subsector_lookup sl
                """;
        // we are converting the sql query into a string
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        ResultSet resultSet = preparedStatement.executeQuery();
        //we are executing the query
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        while (resultSet.next()) {
            SubSectorVO subsectorVo = new SubSectorVO();
            subsectorVo.setSubsector_id(resultSet.getInt("subsector_id"));
            subsectorVo.setSubsector_name(resultSet.getString("subsector_name"));
            subsectorVo.setSector_id(resultSet.getInt("sector_id"));
            allSubSectors.add(subsectorVo);
        }
        System.out.println(allSubSectors);
    }

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                	*
                from
                	endeavour.sector_lookup sl
                """;
        //storing the sql query
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing and printing it
        System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while (resultSet.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }


}

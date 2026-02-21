import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);//instance of DB Connection
        //System.out.println(connection);
        // retrieve data from DB
        getAllSectors(connection);
        getAllSubSectors(connection);
        getSpecificSectorID(connection);
        getSpecificStockFundemental(connection,"NFLX");



    }

    private static void getSpecificStockFundemental(Connection connection, String tickerSymbol) throws SQLException {
        String sqlQuery = """
                select 
                    sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                    from endeavour.stock_fundamentals  sf where sf.ticker_symbol = ?;
               """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement3.executeQuery();
        //System.out.println(resultSet);
        List<StockFundementalsVO> specificStocks =  new ArrayList<>();
        while(resultSet.next())
        {
            StockFundementalsVO stockFundementalsVO = new StockFundementalsVO();
            stockFundementalsVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));
            stockFundementalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));



            specificStocks.add(stockFundementalsVO);
        }
        System.out.println(specificStocks);
    }

    private static void getSpecificSectorID(Connection connection) throws SQLException {
        int sectorId = 41;
        String sqlQuery = """
                select 
                   * 
                    from endeavour.sector_lookup ssl where ssl.sector_id = ?;
                """;
        PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery);
        preparedStatement2.setInt(1,sectorId);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement2.executeQuery();
        //System.out.println(resultSet);
        List<SectorVO> specificSectors =  new ArrayList<>();
        while(resultSet.next())
        {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSectors.add(sectorVO);
        }
        System.out.println(specificSectors);
    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select 
                   * 
                    from endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement1.executeQuery();
        //System.out.println(resultSet);
        List<SubSectorVO> allSubSectors =  new ArrayList<>();
        while(resultSet.next())
        {
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSubsectorName(resultSet.getString("subsector_name"));
            subSectorVO.setSubsectorId(resultSet.getInt("subsector_id"));
            subSectorVO.setSectorid(resultSet.getInt("sector_id"));

            allSubSectors.add(subSectorVO);
        }
        //System.out.println(allSubSectors);
    }

    private static void getAllSectors(Connection connection) throws SQLException {

        String sqlQuery = """
                select 
                   * 
                    from endeavour.sector_lookup ssl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //preparedStatement.setInt(1,sectorId);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement.executeQuery();
        //System.out.println(resultSet);
        List<SectorVO> allSectors =  new ArrayList<>();
        while(resultSet.next())
        {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        //System.out.println(allSectors);


    }
}




import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentals;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

        private static String jdbcurl ="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
        private static String userName = "evr_sql_app";
        private static String password ="5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection=DriverManager.getConnection(jdbcurl,userName,password);//instance of connection
        //System.out.println(connection);
        //retrieve the data from DB
        getAllSectors(connection);
        getAllSubSectors(connection);
        getSpecificSector(connection);
        getSpecificStockFundemental(connection,"WMT");
    }

    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery1= """
                select * from endeavour.subsector_lookup ssl where ssl.sector_id=35
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        ResultSet resultSet1=preparedStatement.executeQuery();
        System.out.println(resultSet1);
        List<SubSector> allSubSectors=new ArrayList<>();
        while(resultSet1.next()){
            SubSector subsector=new SubSector();
            subsector.setSubsectorId(resultSet1.getInt("subsector_id"));
            subsector.setSubSectorName(resultSet1.getString("subsector_name"));
            subsector.setSectorId(resultSet1.getInt("sector_id"));
            allSubSectors.add(subsector);
        }
        System.out.println(allSubSectors);
    }

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery= """
                select * from endeavour.sector_lookup sl
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        //executing the query result
        //System.out.println(preparedStatement);
        System.out.println(resultSet);
        List<SectorVO> allSectors=new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO=new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }
    private static void getSpecificSector(Connection connection) throws SQLException {
        String sqlQuery2= """
                select * from endeavour.sector_lookup sl where sl.sector_name='Healthcare'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery2);
        ResultSet resultSet2=preparedStatement.executeQuery();
        //executing the query result
        //System.out.println(preparedStatement);
        System.out.println(resultSet2);
        List<SectorVO> allSectors=new ArrayList<>();
        while(resultSet2.next()){
            SectorVO sectorVO=new SectorVO();
            sectorVO.setSectorId(resultSet2.getInt("sector_id"));
            sectorVO.setSectorName(resultSet2.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }
    private static void getSpecificStockFundemental(Connection connection, String tickerSymbol) throws SQLException {
        String sqlQuery = """
                select 
                    sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                    from endeavour.stock_fundamentals  sf where sf.ticker_symbol = ?;
               """;
        PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery);
        preparedStatement3.setString(1,tickerSymbol);
        ResultSet resultSet3 = preparedStatement3.executeQuery();
        //System.out.println(resultSet);
        List<StockFundamentals> specificStocks =  new ArrayList<>();
        while(resultSet3.next())
        {
            StockFundamentals stockFundementals = new StockFundamentals();
            stockFundementals.setSectorId(resultSet3.getBigDecimal("sector_id"));
            stockFundementals.setSubSectorId(resultSet3.getInt("subsector_id"));
            stockFundementals.setTickerSymbol(resultSet3.getString("ticker_symbol"));
            stockFundementals.setMarketCap(resultSet3.getLong("market_cap"));
            stockFundementals.setCurrentRatio(resultSet3.getFloat("current_ratio"));
            specificStocks.add(stockFundementals);
        }
        System.out.println(specificStocks);
    }

}

import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     * postGreSQL
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */

    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB"  ;
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);//instance of an DB connection
        // System.out.println(connection);
        //retrieve the data from DB
        getAllSectors(connection);
        getAllSubSectors(connection);
        getSpecificSector(connection,35);
        getSpecificStockFundamental(connection ,"AAPL");
    }

    private static void getSpecificStockFundamental(Connection connection , String tickerSymbol) throws SQLException {
        String sqlQuery1 = """
                select *
                from endeavour.stock_fundamentals sf where sf.ticker_symbol = ? ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        preparedStatement.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockFundamentalsVO> specificStockFundamentals = new ArrayList<>();
        while(resultSet.next()){
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setSectorId(resultSet.getBigDecimal("sector_id"));
            stockFundamentalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundamentalsVO.setMarketCap(resultSet.getBigDecimal("market_cap"));
            stockFundamentalsVO.setCurrentRation(resultSet.getFloat("current_ratio"));
            specificStockFundamentals.add(stockFundamentalsVO);
        }
        System.out.println(specificStockFundamentals);
    }

    private static void getSpecificSector(Connection connection,int sectorId) throws SQLException {
        String sqlQuery1 = """
                select *
                from endeavour.sector_lookup sl where sl.sector_id= ? ;
                """;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            preparedStatement.setInt(1,sectorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SectorVO> specificSector = new ArrayList<>();
            while(resultSet.next()){
                SectorVO sectorVO = new SectorVO(resultSet.getInt("sector_id"),resultSet.getString("sector_name"));
                specificSector.add(sectorVO);
            }
            System.out.println(specificSector);

        }catch (SQLException e){
            System.out.println("From Catch");
            System.out.println(e.getStackTrace());
        }
    }
    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery1 = """
                select *
                         from endeavour.subsector_lookup sl ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubSectorVO> allSectors1 = new ArrayList<>();
        while(resultSet.next()){
            SubSectorVO subsectorVO = new SubSectorVO();
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            allSectors1.add(subsectorVO);
        }
        //System.out.println(allSectors1);
    }


    private static void getAllSectors(Connection connection) throws SQLException {
        Integer sectorId = 35;
        String sqlQuery = """
                select *
                     from endeavour.sector_lookup sl where sl.sector_id = ? ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,sectorId);
        //we are holding sql query in preparedStatement
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing the query to the resultSet
        //System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
       // System.out.println(allSectors);
    }
}

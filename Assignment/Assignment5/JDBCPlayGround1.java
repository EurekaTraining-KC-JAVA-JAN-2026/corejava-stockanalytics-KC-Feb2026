package Assignment.Assignment5;

import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround1 {

    /**
     * URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */

    private static String url = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String passWord = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String args[]) throws SQLException {

       Connection connection =  DriverManager.getConnection(url, userName, passWord);

        getSpecificSectorId(connection, 34);
        getSpecificStockFundamental(connection, "COCO");

    }

    private static void getSpecificStockFundamental(Connection connection, String tickerSymbol) throws SQLException{
        String sqlQuery = """
                select 
                * 
                from endeavour.stock_fundamentals sf 
                where sf.ticker_symbol = ?;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1, tickerSymbol);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockFundamentalVO> allStockFundamentalsVOS = new ArrayList<>();
        while (resultSet.next()) {
            StockFundamentalVO stockFundamentalVO = new StockFundamentalVO();
            stockFundamentalVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundamentalVO.setSubsectorId(resultSet.getInt("subsector_id"));
            stockFundamentalVO.setMarketCap(resultSet.getInt("market_cap"));
            stockFundamentalVO.setCurrentRatio(resultSet.getFloat("current_ratio"));
            stockFundamentalVO.setPriceToBookRa(resultSet.getFloat("price_to_book_ratio"));
            stockFundamentalVO.setPeg(resultSet.getFloat("peg"));
            stockFundamentalVO.setEpsqq(resultSet.getFloat("epsqq"));
            stockFundamentalVO.setEpsNxtYear(resultSet.getFloat("eps_nxtyear"));
            allStockFundamentalsVOS.add(stockFundamentalVO);
        }
        System.out.println(allStockFundamentalsVOS);
        System.out.println(allStockFundamentalsVOS.size());

    }

    private static void getSpecificSectorId(Connection connection, int sectorId) throws SQLException{
        String sqlString = """
                select
                *
                from endeavour.sector_lookup sl
                where sl.sector_id = ?;
               """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
        preparedStatement.setInt(1, sectorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SectorVO> sectorVOS = new ArrayList<>();
        while (resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            sectorVOS.add(sectorVO);
        }
        System.out.println(sectorVOS);
    }

}

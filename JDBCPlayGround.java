import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     *URL:endeavourtech.ddns.net
     * Database: StocksDB
     * Port: 50271
     * Username=evr_sql_app
     * Password=5LViU5pLkSjRHECec9NF4wRxxV
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName= "evr_sql_app";
    private static String password= "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);//instance of DB connection
        //System.out.println(connection);
        //Get the data from DB
        //getAllSectors(connection);
        //getAllSubSectors(connection);
       // getSpecificSectorID(connection,"Energy");
        getSpecificStockFundamental(connection,"TSLA");
    }

    private static void getSpecificStockFundamental(Connection connection, String ticker_symbol) throws SQLException {
        String sqlQuery = """
                select
                    sf.ticker_symbol,
                    sf.sector_id,
                    sf.subsector_id,
                    sf.market_cap,
                    sf.current_ratio,
                    sf.price_to_book_ratio
                    from 
                        endeavour.stock_fundamentals sf where sf.ticker_symbol = ?;
                """;
        PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,ticker_symbol);
        ResultSet resultSet=preparedStatement.executeQuery();
        List<StockFundamentalsVO> allStockFundamentals= new ArrayList<>();
        while(resultSet.next()){
            StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
            stockFundamentalsVO.setSectorID(resultSet.getInt("sector_id"));
            stockFundamentalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundamentalsVO.setCurrentRatio(resultSet.getFloat("current_ratio"));
            stockFundamentalsVO.setMarketCap(resultSet.getDouble("market_cap"));
            stockFundamentalsVO.setSubSectorID(resultSet.getInt("subsector_id"));
            stockFundamentalsVO.setPriceToBookRatio(resultSet.getFloat("price_to_book_ratio"));
            allStockFundamentals.add(stockFundamentalsVO);
        }
        System.out.println(allStockFundamentals);


    }

    private static void getSpecificSectorID(Connection connection, String sector_name) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.sector_lookup sl where sl.sector_name = ?;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,sector_name);
        ResultSet resultSet=preparedStatement.executeQuery();
        List<SectorVO> allsectors= new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        System.out.println(allsectors);
    }





    private static void getAllSubSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        List<SubSectorVO> allsubsectors= new ArrayList<>();
        while(resultSet.next()){
            SubSectorVO subSectorVO=new SubSectorVO();
            subSectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subSectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            allsubsectors.add(subSectorVO);
        }
        System.out.println(allsubsectors.size());
        System.out.println(allsubsectors);

    }

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.sector_lookup sl ;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        //executing query
        //System.out.println(resultSet);
        List<SectorVO> allsectors= new ArrayList<>();
        while(resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        System.out.println(allsectors);

    }
}

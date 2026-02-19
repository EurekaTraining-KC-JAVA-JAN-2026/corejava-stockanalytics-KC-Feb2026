import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockfundamentalVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        //instance of DB connection
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        //System.out.println(connection);
        //retrieving data from DB
        getAllSectors(connection);
        getAllSubsectors(connection);
        getSpecificSector(connection);
        getSpecificStockFundamental(connection);
    }

    private static void getSpecificSector(Connection connection) throws SQLException {
        String sqlQuery3 = """
                select
                	*
                	from endeavour.sector_lookup sl where sl.sector_name = 'Technology';
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery3);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<SectorVO> specificSector = new ArrayList<>();
        while (resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            specificSector.add(sectorVO);
        }
        System.out.println("Assignment for getSpecificSector" +specificSector);
    }

    private static void getSpecificStockFundamental(Connection connection) throws SQLException {
        //String tickerSymbol = "AAPL";
        String sqlQuery2 = """
                select
                	*
                	from endeavour.stock_fundamentals sf where sf.ticker_symbol = 'AAPL' ;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery2);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<StockfundamentalVO> specificstock = new ArrayList<>();
        while(resultSet.next()){
            //StockfundamentalVO stockfundamentalVO = new StockfundamentalVO();
            StockfundamentalVO stockfundamentalVO = new StockfundamentalVO(
                    resultSet.getString("ticker_symbol"),
                    resultSet.getInt("sector_id"),
                    resultSet.getInt("subsector_id"),
                    resultSet.getBigDecimal("market_cap"),
                    resultSet.getBigDecimal("current_ratio"),
                    resultSet.getBigDecimal("price_to_book_ratio"),
                    resultSet.getBigDecimal("peg"),
                    resultSet.getBigDecimal("epsqq"),
                    resultSet.getBigDecimal("eps_nxtyear"),
                    resultSet.getBigDecimal("eps_ttm"),
                    resultSet.getBigDecimal("roe"),
                    resultSet.getBigDecimal("insider_ownership"),
                    resultSet.getBigDecimal("debt_equity_ratio"),
                    resultSet.getBigDecimal("trailing_pe"),
                    resultSet.getBigDecimal("forward_pe"));
            specificstock.add(stockfundamentalVO);

        }
        System.out.println("Assignment for get getSpecificStockFundamental" +specificstock);
    }


    private static void getAllSubsectors(Connection connection) throws SQLException {
        String sqlQuery1 = """
                select
                	*
                	from endeavour.subsector_lookup sl ;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<SubsectorVO> allsubSectors = new ArrayList<>();
        while (resultSet.next()){
            SubsectorVO subsectorVO = new SubsectorVO();
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subsectorVO.subSectorName(resultSet.getString("subsector_name"));

            allsubSectors.add(subsectorVO);

        }
        System.out.println(allsubSectors);

    }
    

    private static void getAllSectors(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                	*
                	from endeavour.sector_lookup sl where sl.sector_id=35;
                """;
        //for older versions
        //preparedStatement.setInt(1,sector_id);
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        //System.out.println(preparedStatement); //this just prints the String
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing the query
        //System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while (resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);

    }

}

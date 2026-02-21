import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVo;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    private static String jdbcUrl =
            "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {

        try (Connection connection =
                     DriverManager.getConnection(jdbcUrl, userName, password)) {

            getAllSectors(connection);
            getAllSubSectors(connection);
            getSpecificSectorID(connection); //sectortable
            getSpecificStockFundamental(connection,"AAPL"); //Stock Fundamental table
        }
    }

    private static void getSpecificStockFundamental(Connection connection, String tickerSymbol) throws SQLException {
        String sqlQuery = """
                select 
                    sf.ticker_symbol, sf.sector_id, sf.subsector_id,sf.market_cap,sf.current_ratio
                    from endeavour.stock_fundamentals  sf where sf.ticker_symbol = ?;
               """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,tickerSymbol);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockFundamentalVo> specific =  new ArrayList<>();
        while(resultSet.next())
        {
            StockFundamentalVo stockFundementalsVO = new StockFundamentalVo();
            stockFundementalsVO.setSectorId(resultSet.getInt("sector_id"));
            stockFundementalsVO.setSubSectorId(resultSet.getInt("subsector_id"));
            stockFundementalsVO.setTickerSymbol(resultSet.getString("ticker_symbol"));
            stockFundementalsVO.setMarketCap(resultSet.getLong("market_cap"));

            specific.add(stockFundementalsVO);
        }
        System.out.println("Specific Stocks");
        System.out.println(specific);
    }

    private static void getSpecificSectorID(Connection connection) throws SQLException {
        String sqlQuery = """
                select *
                from endeavour.sector_lookup sl where sl.sector_id =35;
                """;

        try (PreparedStatement ps = connection.prepareStatement(sqlQuery);
             ResultSet rs = ps.executeQuery()) {

            List<SectorVO> sectors = new ArrayList<>();

            while (rs.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(rs.getInt("sector_id"));
                sectorVO.setSectorName(rs.getString("sector_name"));

                sectors.add(sectorVO);
            }

            System.out.println("Specific Sectors:");
            System.out.println(sectors);
        }

    }

    private static void getAllSectors(Connection connection) throws SQLException {

        String sqlQuery = """
                select *
                from endeavour.sector_lookup sl;
                """;

        try (PreparedStatement ps = connection.prepareStatement(sqlQuery);
             ResultSet rs = ps.executeQuery()) {

            List<SectorVO> allSectors = new ArrayList<>();

            while (rs.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(rs.getInt("sector_id"));
                sectorVO.setSectorName(rs.getString("sector_name"));
                allSectors.add(sectorVO);
            }

            System.out.println("All Sectors:");
            System.out.println(allSectors);
        }
    }

    private static void getAllSubSectors(Connection connection) throws SQLException {

        String sqlQuery = """
                select *
                from endeavour.subsector_lookup sl
                where sl.sector_id = 35;
                """;

        try (PreparedStatement ps = connection.prepareStatement(sqlQuery);
             ResultSet rs = ps.executeQuery()) {

            List<SubSectorVO> allSubSectors = new ArrayList<>();

            while (rs.next()) {
                SubSectorVO subSectorVO = new SubSectorVO();
                subSectorVO.setSectorId(rs.getInt("sector_id"));
                subSectorVO.setSubSectorId(rs.getInt("subsector_id"));
                subSectorVO.setSubSectorName(rs.getString("subsector_name"));
                allSubSectors.add(subSectorVO);
            }

            System.out.println("All SubSectors:");
            System.out.println(allSubSectors);
        } catch (SQLException e){
            System.out.println("FROM CATCH");
            System.out.println(e);
        }finally {
            System.out.println("I finally rum");
            System.out.println("I will always run");
            connection.close();
        }



    }
}

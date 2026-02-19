import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String username = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";


    public static void main(String[] args) throws SQLException {
        Connection connection =DriverManager.getConnection(jdbcurl,username, password );   // instance of DB connection
//        System.out.println(connection);

        getAllSector(connection);
        getAllSubSector(connection);
        getSpecificSectorID(connection);
        getSpecificStockFundemental(connection);
    }

    private static void getSpecificStockFundemental(Connection connection) throws SQLException {
        String sqlquery1 = """
             select
                    sf.ticker_symbol,
                    sf.sector_id,
                    sf.subsector_id,
                    sf.market_cap,
                    sf.debt_equity_ratio,
                    sf.eps_nxtyear,
                    sf.eps_ttm,
                    sf.epsqq,
                    sf.forward_pe,
                    sf.insider_ownership,
                    sf.peg,
                    sf.price_to_book_ratio,
                    sf.roe,
                    sf.trailing_pe,
                    sf.current_ratio
             from
                 endeavour.stock_fundamentals sf
             where
                 sf.ticker_symbol = 'PL'
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery1);
        ResultSet resultSet3 = preparedStatement.executeQuery();
        List<StockFundamentalsVO> allSectors1 = new ArrayList<>();
        while (resultSet3.next()){
           StockFundamentalsVO StockVO = new StockFundamentalsVO();
           StockVO.setSectorId(resultSet3.getInt("sector_Id"));
           StockVO.setSubsectorId(resultSet3.getInt("subsector_Id"));
           StockVO.setTickerSymbol(resultSet3.getString("ticker_symbol"));
           StockVO.setMarketCap(resultSet3.getLong("market_cap"));
           StockVO.setCurrentRatio(resultSet3.getDouble("current_ratio"));
           StockVO.setDebtEquityRatio(resultSet3.getDouble("debt_equity_ratio"));
           StockVO.setEpsNxtYear(resultSet3.getDouble("eps_nxtyear"));
           StockVO.setEpsTtm(resultSet3.getDouble("eps_ttm"));
           StockVO.setEpsQq(resultSet3.getDouble("epsqq"));
           StockVO.setForwardPe(resultSet3.getDouble("forward_pe"));
           StockVO.setInsiderOwnership(resultSet3.getDouble("insider_ownership"));
           StockVO.setPeg(resultSet3.getInt("peg"));
           StockVO.setPriceToBookRatio(resultSet3.getDouble("price_to_book_ratio"));
           StockVO.setRoe(resultSet3.getDouble("roe"));
           StockVO.setTrailing_pe(resultSet3.getDouble("trailing_pe"));
           allSectors1.add(StockVO);
        }
        System.out.println(allSectors1);
    }


    private static void getSpecificSectorID(Connection connection) throws SQLException {
        String sqlquery= """
            select
                sf.ticker_symbol,
                sf.sector_id,
                sf.subsector_id,
                sf.market_cap,
                sf.current_ratio
            from
                endeavour.stock_fundamentals sf
            where
                 sf.sector_id = 44;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        ResultSet resultSet2 = preparedStatement.executeQuery();
        List<StockFundamentalsVO> allSectors = new ArrayList<>();
        while (resultSet2.next()){
            StockFundamentalsVO VO = new StockFundamentalsVO();
            VO.setSectorId(resultSet2.getInt("sector_Id"));
            VO.setSubsectorId(resultSet2.getInt("subsector_Id"));
            VO.setTickerSymbol(resultSet2.getString("ticker_symbol"));
            VO.setMarketCap(resultSet2.getLong("market_cap"));
            VO.setCurrentRatio(resultSet2.getDouble("current_ratio"));
            allSectors.add(VO);
        }
        System.out.println(allSectors);
    }

    private static void getAllSubSector(Connection connection) throws SQLException {
        String sqlQuery1 = """
                select
                    *
                from
                    endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
        // above we r holding the sqlquery1 into an prepared statement
        ResultSet resultSet1 = preparedStatement.executeQuery();
        // executing the query result
//           System.out.println(preparedStatement);

        List<SubSectorVO> allSubSector = new ArrayList<>();
        while (resultSet1.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSubsectorId(resultSet1.getInt("subsector_Id"));
            subSectorVO.setSubsectorName(resultSet1.getString("subsector_Name"));
            subSectorVO.setSectorId(resultSet1.getInt("sector_Id"));
            allSubSector.add(subSectorVO);
        }
        System.out.println(allSubSector);


    }

    private static void getAllSector(Connection connection) throws SQLException {

        String sqlQuery = """
                select
                *
                from
                    endeavour.sector_lookup sl where sl.sector_id = 34;
                """;
           PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
           // above we r holding the sqlquery into an prepared statement
           ResultSet resultSet = preparedStatement.executeQuery();
           // executing the query result
//           System.out.println(preparedStatement);

            List<SectorVO> allSector = new ArrayList<>();
            while (resultSet.next()){
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(resultSet.getInt("sector_Id"));
                sectorVO.setSectorName(resultSet.getString("sector_Name"));
                allSector.add(sectorVO);
            }
            System.out.println(allSector);
    }


}

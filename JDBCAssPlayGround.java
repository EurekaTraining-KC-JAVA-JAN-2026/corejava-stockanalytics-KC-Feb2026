import com.eurekaAccount.sectorVO.StockSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCAssPlayGround {

    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
        getSpecificSector(connection);
        String tickersymbol = "H";
        getSpecificStockFundamental(connection,tickersymbol);
    }
    private static void getSpecificSector(Connection connection) throws SQLException{
    String sqlQuery= """
            select
                            sf.ticker_symbol,
                            sf.sector_id,
                            sf.subsector_id,
                            sf.market_cap,
                            sf.current_ratio
                        from
                            endeavour.stock_fundamentals sf
                        where
                             sf.sector_id = 34;
            """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet=preparedStatement.executeQuery();
        //preparedStatement.setInt(3,sectorId);
        System.out.println(resultSet);
        List<StockSectorVO> SpecificSector=new ArrayList<>();
        while(resultSet.next()){
            StockSectorVO stockSectorVO = new StockSectorVO(resultSet.getString("ticker_symbol"), resultSet.getInt("sector_id"), resultSet.getInt("subsector_id"),
                    resultSet.getBigDecimal("market_cap"), resultSet.getFloat("current_ratio") );
            SpecificSector.add(stockSectorVO);

        }
        System.out.println(SpecificSector);

        }
    private static void getSpecificStockFundamental(Connection connection, String tickersymbol) throws SQLException {
        String sqlQuery = """
                select
                                    sf.ticker_symbol,
                                    sf.sector_id,
                                    sf.subsector_id,
                                    sf.market_cap,
                                    sf.debt_equity_ratio,
                                    sf.eps_nxtyear,
                                    sf.current_ratio
                             from
                                 endeavour.stock_fundamentals sf
                             where
                                 sf.ticker_symbol = ?;
                """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1, tickersymbol.toString());
        ResultSet resultSet=preparedStatement.executeQuery();
        System.out.println(resultSet);
        List<StockSectorVO> SepcificSectorVO= new ArrayList<>();
        while(resultSet.next()) {
            StockSectorVO stockFSectorVO = new StockSectorVO(resultSet.getString("ticker_symbol"), resultSet.getInt("sector_id"),
                    resultSet.getInt("subsector_id"), resultSet.getBigDecimal("market_cap"),
                    resultSet.getFloat("debt_equity_ratio"), resultSet.getDouble("eps_nxtyear"),
                    resultSet.getFloat("current_ratio"));
                    SepcificSectorVO.add(stockFSectorVO);
        }
        System.out.println(SepcificSectorVO);



    }

    
    
}


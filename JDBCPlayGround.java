import com.eurekaAccounts.stocks.vo.SectorLookUpVO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
        private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
        private static String userName = "evr_sql_app";
        private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

        public static void main(String[] args) throws SQLException {
            Connection connection = DriverManager.getConnection(jdbcurl,userName,password); //instance of DB connection
            //System.out.println(connection);
            //retrieval/get the data from DB
            //getAllSectors(connection);
            getSpecificSector(connection);
            getSpecificStockFundamental(connection);
            //getAllSubSectors(connection);
    }


    private static void getAllSectors(Connection connection) throws SQLException {
            Integer sectorId = 35;
            String sqlQuery = """
                    select
                         	*
                         from
                         	endeavour.sector_lookup sl where sl.sector_id = ?;
                    """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,sectorId);
        //above we are holding the sql query
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing the query
        System.out.println(resultSet);
        List<SectorVO> allSectors = new ArrayList<>();
        while (resultSet.next()){
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);
    }

    private static void getAllSubSectors(Connection connection) throws SQLException{
            String sqlQuery1 = """
                    select
                    	*
                    from
                    	endeavour.sector_lookup sl
            
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SubsectorVO> allSubSectors = new ArrayList<>();
            while (resultSet.next()){
                SubsectorVO SubsectorVO = new SubsectorVO();
                SubsectorVO.setSectorId(resultSet.getInt("sector_id"));
                SubsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
                SubsectorVO.getSubSectorId(resultSet.getInt("subsector_id"));

                allSubSectors.add(SubsectorVO);
            }
        //System.out.println(allSubSectors);
    }
    private static void getSpecificSector(Connection connection) throws SQLException {
            String sqlQuery2 = """
                    select
                    	*
                    from
                    	endeavour.sector_lookup sl where sl.sector_name = 'Healthcare';
                    """;
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqlQuery2);
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            System.out.println(resultSet2);
            List<SectorLookUpVO> allSectorName = new ArrayList<>();
            while(resultSet2.next()){
                SectorLookUpVO SectorLookUpVO = new SectorLookUpVO();
                SectorLookUpVO.setSectorId(resultSet2.getInt("sector_id"));
                SectorLookUpVO.setSectorName(resultSet2.getString("sector_name"));

                allSectorName.add(SectorLookUpVO);
            }
            System.out.println("Assignment for getSpecificSector : " + allSectorName);
    }
    private static void getSpecificStockFundamental(Connection connection) throws SQLException{
            String sqlQuery3 = """
                    select
                    	*
                    from
                    	endeavour.stock_fundamentals sf where sf.ticker_symbol = 'GEV';
                    """;
            PreparedStatement preparedStatement3 = connection.prepareStatement(sqlQuery3);
            ResultSet resultSet3 = preparedStatement3.executeQuery();

            List<StockFundamentalVO> specificstock = new ArrayList<>();
            while(resultSet3.next()) {
                StockFundamentalVO stockFundamentalVO = new StockFundamentalVO(
                resultSet3.getString("ticker_symbol"),
                resultSet3.getInt("sector_id"),
                resultSet3.getInt("subsector_id"),
                resultSet3.getBigDecimal("market_cap"),
                resultSet3.getBigDecimal("current_ratio"),
                resultSet3.getBigDecimal("price_to_book_ratio"),
                resultSet3.getBigDecimal("peg"),
                resultSet3.getBigDecimal("epsqq"),
                resultSet3.getBigDecimal("eps_nxtyear"),
                resultSet3.getBigDecimal("eps_ttm"),
                resultSet3.getBigDecimal("roe"),
                resultSet3.getBigDecimal("insider_ownership"),
                resultSet3.getBigDecimal("debt_equity_ratio"),
                resultSet3.getBigDecimal("trailing_pe"),
                resultSet3.getBigDecimal("forward_pe"));
                specificstock.add(stockFundamentalVO);
            }
        System.out.println("Assignment for getSpecificStockFundamental"  + specificstock);
            }

    }


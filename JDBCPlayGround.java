import Eurekaaccounts.stocks.vo.SectorVO;
import Eurekaaccounts.stocks.vo.SubsectorVO;
import Eurekaaccounts.stocks.vo.stockfundamentalVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {


    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        getAllSectors(connection);
        getAllSubSectores(connection);
        getSpecificsectorid(connection,34);
        getSpecificStockFundamentlals(connection,"NVDA");
    }

    private static void getSpecificsectorid(Connection connection,int sector_id) throws SQLException {
        String sqlQuerey = """
               select
               *
                from   
               endeavour.sector_lookup sl
              where sl.sector_id=?
              """;
        PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);
        prepareStatement.setInt(1,sector_id);
        ResultSet resultSet = prepareStatement.executeQuery();
        List<SectorVO> allsectors = new ArrayList<>();
        while (resultSet.next()) {

            SectorVO sectorVO = new SectorVO();
            sectorVO.setSector_id(resultSet.getInt("sector_id"));
            sectorVO.setSector_name(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        System.out.println(allsectors);
    }
    private static void getSpecificStockFundamentlals(Connection connection,String ticker_symbol) throws SQLException {
        String sqlQuery= """
                
                  select
                                *
                                from
                                endeavour.stock_fundamentals sf
                  where sf.ticker_symbol=?
                                """;
        PreparedStatement prepareStatement=connection.prepareStatement(sqlQuery);
        prepareStatement.setString(1, ticker_symbol);
        ResultSet resultSet=prepareStatement.executeQuery();
        List<stockfundamentalVO> SpecificStockFundamentlals=new ArrayList<>();
        while(resultSet.next()){
            stockfundamentalVO stock1= new stockfundamentalVO();
            stock1.setCurrent_ratio(resultSet.getDouble("current_ratio"));
            stock1.setSubsector_id(resultSet.getInt("sector_id"));
            stock1.setMarket_cap(resultSet.getLong("market_cap"));
            stock1.setEpsqq(resultSet.getDouble("Epsqq"));
            stock1.setEps_nxtyear(resultSet.getDouble("Eps_nxtyear"));
            stock1.setForward_pe(resultSet.getDouble("forward_pe"));
            stock1.setPeg(resultSet.getFloat("peg"));
            stock1.setTicker_symbol(resultSet.getString("ticker_symbol"));
            stock1.setPrice_to_book_ratio(resultSet.getDouble("price_to_book_ratio"));
            stock1.setInsider_ownership(resultSet.getDouble("insider_ownership"));
            stock1.setRoe(resultSet.getDouble("roe"));
            stock1.setDebt_equity_ratio(resultSet.getDouble("debt_equity_ratio"));
            stock1.setTrailing_Pe(resultSet.getDouble("debt_equity_ratio"));
            stock1.setEps_ttm(resultSet.getDouble("eps_ttm"));
            SpecificStockFundamentlals.add(stock1);
        }
        System.out.println(SpecificStockFundamentlals);
    }
      static void getAllSectors(Connection connection)  {
//      Integer sector_id=35;
        //preparedstatemt
        String sqlQuerey = """
               select
               *
                from   
               endeavour.sector_lookup sl
              """;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);
//        prepareStatement.setInt(1, sector_id);
//        System.out.println(prepareStatement);
            ResultSet resultSet = prepareStatement.executeQuery();
            //executing the query the result
//        System.out.println(resultSet);
            List<SectorVO> allsectors = new ArrayList<>();
            while (resultSet.next()) {

                SectorVO sectorVO = new SectorVO();
                sectorVO.setSector_id(resultSet.getInt("sector_id"));
                sectorVO.setSector_name(resultSet.getString("sector_name"));
                allsectors.add(sectorVO);
            }
            System.out.println(allsectors);
        } catch(SQLException e) {
            System.out.println(e);
            System.out.println("from catch");
        }finally{
            System.out.println();
//            connection.close();
        }
    }
     static void getAllSubSectores(Connection connection) throws SQLException {
        String sqlQuerey = """
               select
               *
                from   
               endeavour.subsector_lookup sl
              """;
        PreparedStatement prepareStatement1 = connection.prepareStatement(sqlQuerey);
        ResultSet resultSet1 = prepareStatement1.executeQuery();
        List<SubsectorVO> allSubsectors = new ArrayList<>();
        while (resultSet1.next()) {
            SubsectorVO  subSectorVO= new SubsectorVO();
             subSectorVO.setSubsector_id(resultSet1.getInt("subsector_id"));
             subSectorVO.setSubsector_name(resultSet1.getString("subsector_name"));
            subSectorVO.setSector_id(resultSet1.getInt("sector_id"));
             allSubsectors.add(subSectorVO);
        }
        System.out.println(allSubsectors);
    }
}

import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.StockFundamentalsVO;
import eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    private static  String jdbcurl="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String Username="evr_sql_app";
    private static String Password="5LViU5pLkSjRHECec9NF4wRxxV";

     public static void main(String[] args) throws SQLException {
         Connection connection = DriverManager.getConnection(jdbcurl, Username, Password);
         getAllSectors(connection);
         getAllSubSectors(connection);
         getSpecificsector_id(connection,35);
         getSpecificStockFundamentals(connection,"AAPL");

     }

    private static void getSpecificStockFundamentals(Connection connection,String ticker_symbol ) throws SQLException {
         String sqlQuery= """
                  select *
                      from endeavour.stock_fundamentals sf
                       where ticker_symbol=?;
                 """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1,ticker_symbol);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StockFundamentalsVO> specificStock =new ArrayList<>();
         while(resultSet.next()){
             StockFundamentalsVO stockFundamentalsVO=new StockFundamentalsVO(resultSet.getFloat("current_ratio"),resultSet.getFloat("debt_equity_ratio"),resultSet.getFloat("eps_ttm"),
                     resultSet.getFloat("eps_nxtyear"),resultSet.getFloat("epsqq"),resultSet.getFloat("forward_pe"),resultSet.getFloat("insider_ownership"),
                     resultSet.getDouble("market_cap"),resultSet.getInt("peg"),resultSet.getFloat("price_to_book_ratio"),resultSet.getFloat("roe"),
                     resultSet.getInt("sector_id"),resultSet.getInt("subsector_id"),
                     resultSet.getString("ticker_symbol"),resultSet.getFloat("trailing_pe"));
             specificStock.add(stockFundamentalsVO);

         }
        System.out.println(specificStock);


    }

    private static  void getSpecificsector_id(Connection connection ,int sector_id) throws SQLException {
         String sqlQuery = """
                    select  *
                      from endeavour.subsector_lookup sl
                       where sector_id=?
                 """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setInt(1,sector_id);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubSectorVO> specificSector=new ArrayList<>();
        while(resultSet.next()){
            SubSectorVO subSector=new SubSectorVO(resultSet.getInt("sector_id"),resultSet.getInt("subsector_id"),resultSet.getString("subsector_name"));
            specificSector.add(subSector);

        }
        System.out.println(specificSector);


    }


    private static void getAllSubSectors(Connection connection) throws SQLException {
        // Integer sectorId=35;
         String sqlQuery= """
                 select *
                      from endeavour.subsector_lookup sl
                      
                 """;
  // holding subquery
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
         //preparedStatement.setInt(1,sector_id);
        //execute the query
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SubSectorVO> allSubSectors=new ArrayList<>();
         while(resultSet.next()){
             SubSectorVO subSectorVO=new SubSectorVO();
             subSectorVO.setSubsector_id(resultSet.getInt("subsector_id"));
             subSectorVO.setSector_id(resultSet.getInt("sector_id"));
             subSectorVO.setSubsector_name(resultSet.getString("subsector_name"));
             allSubSectors.add(subSectorVO);
         }
        System.out.println(allSubSectors);

    }

    private static void getAllSectors(Connection connection) throws SQLException {
         String sqlQuery= """
                 select * 
                   from endeavour.sector_lookup sl;
                 """;
         //connected to a database
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
       // System.out.println(resultSet);
        List<SectorVO> allSectors=new ArrayList<>();

        while(resultSet.next()){
            SectorVO sectorVO=new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));

            allSectors.add(sectorVO);
        }
        System.out.println(allSectors);




    }
}

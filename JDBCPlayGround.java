import com.eurekaAccounts.stocksVO.SectorVO;
import com.eurekaAccounts.stocksVO.StocksectorVO;
import com.eurekaAccounts.stocksVO.SubSectorVO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {
    /**
     * URL:endeavourtech
     */
     private static final String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
     private static final String userName = "evr_sql_app";
     private static final String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
       Connection connection= DriverManager.getConnection(jdbcUrl,userName,password);//instance of DB connection
        //System.out.println(connection);
        //get the data from DB
        getAllSubSector(connection);
        getAllSector(connection);

       // getSpecificSectorID(connection);
        getSpecificStockFundamental(connection);
    }
    private static void getAllSector(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                *
                from
                   endeavour.Sector_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<SectorVO> allSector = new ArrayList<>();
        while (resultSet.next()) {
            SectorVO SectorVO = new SectorVO();
            SectorVO.setSectorId(resultSet.getInt("sector_id"));
            SectorVO.setSectorName(resultSet.getString("sector_name"));
            SectorVO sectorVO;
            allSector.add(SectorVO);

        }
        System.out.println(allSector);


    }


    private static void getAllSubSector(Connection connection) throws SQLException {
        String sqlQuery = """
                select
                *
                from 
                    endeavour.Subsector_lookup sl where sl.sector_id =35;
                
                """;
         PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        //System.out.println(resultSet);
        List<SubSectorVO> allSubSector = new ArrayList<>();
        while (resultSet.next()){
            SubSectorVO SubsectorVO = new SubSectorVO();
            SubsectorVO.setSubsectorid(resultSet.getInt("subsector_id"));
            SubsectorVO.setSubsectorname(resultSet.getString("subsector_name"));
            SubsectorVO.setSectorId(resultSet.getInt("sector_id"));
            SubSectorVO SubSectorVO;
            allSubSector.add(SubsectorVO);
        }
        System.out.println(allSubSector);

    }


    private static void getSpecificStockFundamental(Connection connection) throws SQLException {
        String sqlQuery = """
         select
         	sf.ticker_symbol ,
         	sf.sector_id ,
         	sf.subsector_id ,
         	sf.current_ratio ,
         	sf.price_to_book_ratio
         from
         	endeavour.stock_fundamentals sf
         where
         	sf.ticker_symbol = 'AAPL';


         """;
        PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StocksectorVO> ticker = new ArrayList<>();
        while (resultSet.next()) {
            StocksectorVO stocksectorVO = new StocksectorVO(resultSet.getString("ticker_symbol"),
                    resultSet.getInt("sector_id"),
                    resultSet.getInt("subsector_id"),
                    resultSet.getFloat("current_ratio"),
                    resultSet.getDouble("price_to_book_ratio"));
            ticker.add(stocksectorVO);

        }
        System.out.println(ticker);

    }




}


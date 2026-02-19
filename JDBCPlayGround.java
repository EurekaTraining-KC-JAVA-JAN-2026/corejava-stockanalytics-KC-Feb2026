import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPlayGround {

    private static String url = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String user = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Connection established successfully, you can now create statements and execute queries
            Connection conn2 = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            System.out.println("Connected to PostgreSQL database");

           getAllSectors(conn2);
           getAllSubsectors(conn2);
           getSpecificSector(conn2);
           getSpecificStockFundamental(conn2);
        } catch (SQLException e) {
            // Handle exceptions
            System.out.println(e);
        }
    }
    private static void getAllSectors(Connection conn) throws SQLException {
        String sqlQuery = """
                            select * 
                            from endeavour.sector_lookup sl  where sl.sector_id=35;;
                            """;
        PreparedStatement ps1 = conn.prepareStatement(sqlQuery);
        //above we are holding the sqlquery
        ResultSet rs1 = ps1.executeQuery();

        //System.out.println(rs1);
        //executing the query the result
        //System.out.println(rs1);

        List<SectorVO> allSectors = new ArrayList<>();
        while (rs1.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(rs1.getInt("sector_id"));
            sectorVO.setSectorName(rs1.getString("sector_name"));
            allSectors.add(sectorVO);
//            allSectors.add(rs1.getInt("sector_id"), rs1.getString("sector_name"));  // first column
        }
        System.out.println(allSectors);
    }

    private static void getAllSubsectors(Connection conn) throws SQLException {
        String sqlQuery = """
                select 
                    * 
                from endeavour.subsector_lookup;
                """;

        PreparedStatement ps2 = conn.prepareStatement(sqlQuery);
        ResultSet rs2 = ps2.executeQuery();
        List<SectorVO> allSubsectors = new ArrayList<>();
        while (rs2.next()) {
            SectorVO sectorVO1 = new SectorVO();
            sectorVO1.setSubsectorId((rs2.getInt("subsector_id")));
            sectorVO1.setSectorName(rs2.getString("subsector_name"));
            sectorVO1.setSectorId(rs2.getInt("sector_id"));


            allSubsectors.add(sectorVO1);

        }
        System.out.println(allSubsectors);


    }
}

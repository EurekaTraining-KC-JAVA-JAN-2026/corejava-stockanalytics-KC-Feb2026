import com.eurekaAccounts.stocks.vo.SectorVO;
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
        }
    }
}

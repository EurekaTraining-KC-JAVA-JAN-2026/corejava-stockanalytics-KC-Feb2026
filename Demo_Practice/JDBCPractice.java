package Demo_Practice;


import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCPractice {
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcurl, userName, password);
        System.out.println(connection);
        getAllSubsectors(connection);

    }

    private static void getAllSubsectors(Connection connection) throws SQLException{
        String sqlQuery = """
                select
                	*
                	from endeavour.subsector_lookup sl ;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery(sqlQuery);

        List<SubSectorVO> allsubsectorVO = new ArrayList<>();
        while (resultSet.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            subSectorVO.setSubSectorName(resultSet.getString("subsector_name"));

            allsubsectorVO.add(subSectorVO);
        }
        System.out.println(allsubsectorVO);
    }


}

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;

//import static com.eurekaAccounts.stocks.dao.BaseDAO.password;

//import java.sql.*;
//import java.util.ArrayList;

public class dataBaseConn {
    //       private static String url =   "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
//       private static String Username = "evr_sql_app";
//          private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
//
//    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection(url, Username, password);
//        System.out.println(connection);
//         Allsubsectors
//                 (connection);
//
//    }
//
//    private static void Allsubsectors(Connection connection) throws SQLException {
//        String Query = """
//                select *
//                from
//                endeavour.subsector_lookup
//                """;
//        PreparedStatement preparedStatement = connection.prepareStatement(Query);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        System.out.println(resultSet);
//        ArrayList<SubSectorVO> subSectorVOS = new ArrayList<>();
//        while (resultSet.next()){
//            Connection subSectorVO = new SubSectorVO();
//            SubSectorVO.setsubsectorVO(
//            resultSet.getString("subsector_name"));
//            Allsubsectors(subSectorVO);
//
//
//        }
//        System.out.println(Allsubsectors);
//    }
    private static String url = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String username = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);
        sector(connection);
    }

    private static void sector(Connection connection) throws SQLException {
        String query = """
                  select *
                           from
             endeavour.subsector_lookup""";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet);
        //ArrayList

    }
}
package eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {

    /**
     * we will put our db config here
     */
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";


    private static String Username = "evr_sql_app";
    private static String Password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;

    public BaseDAO() throws SQLException {
        try {
            connection = DriverManager.getConnection(jdbcurl, Username, Password);
        } catch (SQLException e) {
            System.out.println("Print error occured");
        }
    }
}

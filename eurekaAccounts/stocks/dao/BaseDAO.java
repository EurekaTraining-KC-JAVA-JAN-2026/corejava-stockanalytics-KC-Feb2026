package eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    /**
     * we will put our configuration here
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public static Connection connection;

    public BaseDAO(){
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
        }catch (SQLException e){
            System.out.println("An Exception occured while connecting to DB"+e);
        }
    }
}

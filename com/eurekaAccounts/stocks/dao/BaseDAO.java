package com.eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    /**
     * we will put our DB configs here
     */

    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public static Connection connection;//holding the connection , should be public or protected

    public BaseDAO()  {
        try {
            connection = DriverManager.getConnection(jdbcurl, userName, password);

        }catch(SQLException e){
            System.out.println("An exception occurred while connecting to DB" +e);
        }
    }
}

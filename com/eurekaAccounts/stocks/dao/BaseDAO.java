package com.eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    //base for data access object

    /**
     * Will put DB configurations here
     */

    /**
     * Centralized DB config which has url,username and password
     * Reusable connection logic
     * Avoids duplication in everyDAO
     */

    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String passWord = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;//Holding the connection.

    public BaseDAO() {
        try {
          connection = DriverManager.getConnection(jdbcurl, userName, passWord);
        } catch (SQLException e) {
            System.out.println("An exception occured while connecting to DB : " + e);
        }
    }
}

package com.EurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    /**
     * we will put    our DB config here
     */
    private static String jdbcurl="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName="evr_sql_app";
    private static String password="5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;  //holding connection
    public BaseDAO()throws SQLException {
        try {
            connection= DriverManager.getConnection(jdbcurl, userName, password);
        } catch (SQLException e) {
            System.out.println("an exception occured");
        }
    }
}

package com.eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    /**
     * We will put our DB config here
     */
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName= "evr_sql_app";
    private static String password= "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;//holds the connection

    public BaseDAO() {
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
        }catch (SQLException e){
            System.out.println("An exception occurred while connecting to DB: "+e);
        }
    }
}

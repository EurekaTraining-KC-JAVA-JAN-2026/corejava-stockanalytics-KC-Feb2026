package com.eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    //base for data access objects
    /**
     * we will put our DB configs here
     */
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public static Connection connection; //holding the connection

    public BaseDAO() {
        try{
            connection = DriverManager.getConnection(jdbcurl, userName, password);
        } catch (SQLException e){
            System.out.println("An Exception occured while connecting to DB :" + e);
        }
    }
}

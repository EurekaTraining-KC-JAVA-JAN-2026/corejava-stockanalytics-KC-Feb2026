package com.eurekaAccounts.stocks.MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDAO2 {
    private static String jdbcurl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";

    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;

    public BaseDAO2() {
        try{
            connection = DriverManager.getConnection(jdbcurl,userName,password);
        }
        catch (SQLException e){
            System.out.println("An connection exception has occured");
        }
    }
}

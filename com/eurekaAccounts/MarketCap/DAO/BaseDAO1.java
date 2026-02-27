package com.eurekaAccounts.MarketCap.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO1 {

    private String jdbcURL = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private String userName = "evr_sql_app";
    private String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;

    public BaseDAO1() {
        try {
            connection = DriverManager.getConnection(jdbcURL, userName, password);
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}

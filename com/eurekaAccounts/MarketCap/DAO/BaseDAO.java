package com.eurekaAccounts.MarketCap.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    private static String jdbcUrl = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB"  ;
    private static String userName = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;//holding the connection

    public BaseDAO() {
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
        }catch(SQLException e){
            System.out.println("An Exception occuered while connection to DB :"+e);
        }
    }
}

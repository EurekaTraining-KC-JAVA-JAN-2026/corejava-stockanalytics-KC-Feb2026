package com.eurekaAccounts.stocks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BAse1DAO {

    private static String url = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String userName = "evr_sql_app";
    private static String passWord = "5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;

    public BAse1DAO() {

        try {
            connection = DriverManager.getConnection(url, userName, passWord);
        } catch (SQLException e) {
            System.out.println("Couldn't establish connection.");
        }

    }
}

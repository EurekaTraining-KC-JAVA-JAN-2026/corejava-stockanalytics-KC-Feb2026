package com.eurekaAccounts.stocks.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class BaseDAO {
    /**
     * we will put our configurations here
     *
     */
    private static String url = "jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String user = "evr_sql_app";
    private static String password = "5LViU5pLkSjRHECec9NF4wRxxV";
    protected Connection connection;

    public BaseDAO() throws SQLException {//base for data access
        try{
            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("We got db connection");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{

            System.out.println("Connection closed");
        }
    }



}

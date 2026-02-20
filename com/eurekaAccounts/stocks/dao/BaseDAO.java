package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDAO {

    /**
     * we will put our DB configurations here
     * if someonw wants to creste a object with base dao
     */

    private static String jdbcUrl ="jdbc:postgresql://endeavourtech.ddns.net:50271/StocksDB";
    private static String  userName = "evr_sql_app";
    private static String password="5LViU5pLkSjRHECec9NF4wRxxV";
    public Connection connection;//ho;lding connection

    public BaseDAO() throws SQLException {
        try {
            this.connection = DriverManager.getConnection(jdbcUrl, userName, password);
        }catch(SQLException e){
            System.out.println("An Exception occured while connecting to DB");
        }
    }
}

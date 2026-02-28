package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.StockVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.sql.Connection;

public class StockDAO  extends BaseDAO {


//    private static Object connection;

    public StockDAO() throws SQLException {

        super();
    }

    public  List<StockVO> getAStockWithReq() throws SQLException {


        List<StockVO> stocks = new ArrayList<>();

        String sql1 = """
                
                select * from endeavour.stock_fundamentals sf where sf.market_cap > 100000000000;
                """;


//        String sql1 = "select *, sl.ticker_name \n" +
//                "from\n" +
//                "\tendeavour.stock_fundamentals sf join endeavour.stocks_lookup sl on sl.ticker_symbol = sf.ticker_symbol \n" +
//                "order by\n" +
//                "\tsf.market_cap desc\n" +
//                "\t limit 5";
        try (PreparedStatement ps2 = this.connection.prepareStatement(sql1);
             ResultSet rs2 = ps2.executeQuery()) {
            while(rs2.next()){
                StockVO stocks1 = new StockVO();
                stocks1.setMarket_cap(rs2.getLong("market_cap"));
                stocks1.setSector_id(rs2.getInt("sector_id"));
                stocks1.setSub_sector_id(rs2.getInt("subsector_id"));
               // stocks1.setTicker_name(rs2.getString("ticker_name"));
                stocks.add(stocks1);
            }

        }
        return stocks;
    }


    public  List<StockVO> getAllBlueChipStoks() throws SQLException {


        List<StockVO> stocks1 = new ArrayList<>();

        String sql1 = """
                select sf.ticker_symbol,sf.sector_id, sf.market_cap, sl.ticker_name, sf.subsector_id  from endeavour.stock_fundamentals sf join endeavour.stocks_lookup sl on sl.ticker_symbol = sf.ticker_symbol\s
                	 where sf.market_cap > 100000000000;
                """;
        try (PreparedStatement ps2 = this.connection.prepareStatement(sql1);
             ResultSet rs2 = ps2.executeQuery()) {
            while(rs2.next()){
                StockVO stocks2 = new StockVO();
                stocks2.setMarket_cap(rs2.getLong("market_cap"));
                stocks2.setSector_id(rs2.getInt("sector_id"));
                stocks2.setTicker_symbol(rs2.getString("ticker_symbol"));
                stocks2.setSub_sector_id(rs2.getInt("subsector_id"));
                stocks2.setTicker_name(rs2.getString("ticker_name"));
                stocks1.add(stocks2);
            }

        }
        return stocks1;
    }


}

package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.MVC.BaseDAO2;
import com.eurekaAccounts.stocks.vo.SPHVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class LookUpSPH extends BaseDAO {

    public LookUpSPH() {

    }
    public List<SPHVO> getallsph(String ticker, LocalDate x) throws SQLException {
        List<SPHVO> allsph = new ArrayList<>();

        String sqlquery = """
                select *
                from endeavour.stocks_price_history sph
                where sph.ticker_symbol = ?
                and sph.trading_date between ? and ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
        preparedStatement.setString(1,ticker);
        preparedStatement.setDate(2, Date.valueOf(x.minusMonths(12)));
        preparedStatement.setDate(3, Date.valueOf(x));
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            SPHVO sphvo = new SPHVO();
            sphvo.setTickerSymbol(resultSet.getString("ticker_symbol"));
            sphvo.setTradingDate(resultSet.getDate("trading_date"));
            sphvo.setOpenPrice(resultSet.getDouble("open_price"));
            sphvo.setClosePrice(resultSet.getDouble("close_price"));
            allsph.add(sphvo);
        }

        return allsph;
    }
}

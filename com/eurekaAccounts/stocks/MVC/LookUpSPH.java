package com.eurekaAccounts.stocks.MVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpSPH extends BaseDAO2{

    public LookUpSPH() {

    }
    public List<SPHVO> getallsph() throws SQLException {
        List<SPHVO> allsph = new ArrayList<>();

        String sqlquery = """
                select *
                from endeavour.stocks_price_history sph
                limit 1000
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
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

package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SFDemoVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SFDemo extends BAse1DAO{

    public SFDemo() {
    }

    public List<SFDemoVO> getAllSF() {
        List<SFDemoVO> sfDemoVOS = new ArrayList<>();
        String sql = """
                select * from endeavour.stock_fundamentals sf where sf.sector_id = 37;
                
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                SFDemoVO sfDemoVO = new SFDemoVO();
                sfDemoVO.setSectorId(resultSet.getBigDecimal("sector_id"));
                sfDemoVO.setTickerSymbol(resultSet.getString("AMD"));
                sfDemoVO.setMarketCap(resultSet.getBigDecimal("market_cap"));
                sfDemoVOS.add(sfDemoVO);
            }
        } catch (Exception e) {
            System.out.println("");
        }
        return sfDemoVOS;
    }
}

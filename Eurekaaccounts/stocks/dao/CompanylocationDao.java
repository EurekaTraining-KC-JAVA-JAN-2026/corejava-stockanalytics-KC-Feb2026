package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.vo.CompanylocationVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanylocationDao extends BaseDAO{

    public CompanylocationDao() {
    }
 public static List<CompanylocationVO> getspecifclocation() throws SQLException {
        List<CompanylocationVO> companylocationVOS=new ArrayList<>();
        String sqlQuerey= """
                select
                      cl.ticker_symbol ,cl.address
                      from
                      endeavour.company_locations cl
                      where cl.ticker_symbol='AAPL'
                """;
       PreparedStatement preparedStatement= connection.prepareStatement(sqlQuerey);
       ResultSet resultSet=preparedStatement.executeQuery();
       while(resultSet.next()){
           CompanylocationVO companylocationVO =new CompanylocationVO();
           companylocationVO.setTicker_symbol(resultSet.getString("ticker_symbol"));
           companylocationVO.setAddress(resultSet.getString("address"));
           companylocationVOS.add(companylocationVO);
       }
     return companylocationVOS;
 }
}

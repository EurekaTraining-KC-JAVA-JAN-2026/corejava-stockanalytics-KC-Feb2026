package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class LookUpAllSubSectorDAO  extends BaseDAO{
    public LookUpAllSubSectorDAO() throws SQLException {
    }
    public  List<SubSectorVO> getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors =  new ArrayList<>();
        String sqlQuery = """
                select
                                                *
                                                from endeavour.stock_fundamentals sf
                """;
        PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
        //System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement1.executeQuery();
        //System.out.println(resultSet);
        //List<SubSectorVO> allSubSectors =  new ArrayList<>();
        while(resultSet.next())
        {

            SubSectorVO subSectorVO = new SubSectorVO();
            //subSectorVO.setCount(resultSet.getInt("count"));
            subSectorVO.setSectorid(resultSet.getInt("sector_id"));
//            subSectorVO.setSubsectorId(resultSet.getInt("subsector_id"));
//            subSectorVO.setMarketcap(resultSet.getBigDecimal("market_cap"));
//            subSectorVO.setTickersymbol(resultSet.getString("ticker_symbol"));
//            subSectorVO.setTickername(resultSet.getString("ticker_name"));




//            subSectorVO.setSectorid(resultSet.getInt("sector_id"));
//            subSectorVO.setSubsectorName(resultSet.getString("subsector_name"));
//            subSectorVO.setSubsectorId(resultSet.getInt("subsector_id"));

            allSubSectors.add(subSectorVO);
        }
        return allSubSectors;

    }
}
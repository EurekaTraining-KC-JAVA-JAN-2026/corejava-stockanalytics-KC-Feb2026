package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpDAO extends BaseDAO {

    public LookUpDAO() {
    }

    public List<SectorVO> getAllSectorsDAO() throws SQLException {
        List<SectorVO> allsectors = new ArrayList<>();
        String sqlQuery = """
                select
                    *
                    from 
                        endeavour.sector_lookup sl ;
                """;

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        //executing query
        //System.out.println(resultSet);
        //List<SectorVO> allsectors= new ArrayList<>();
        while (resultSet.next()) {
            SectorVO sectorVO = new SectorVO();
            sectorVO.setSectorId(resultSet.getInt("sector_id"));
            sectorVO.setSectorName(resultSet.getString("sector_name"));
            allsectors.add(sectorVO);
        }
        //System.out.println(allsectors);
        return allsectors;
    }

}

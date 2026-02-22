package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO{

    //We cant create the main method here and print the data because we are following the architectural Layout.
    //So as per AL, DAO is only used to data access.

    /**
     * Like doing the data access, executing it, presenting it includes All, end of the
     * day its same like using Main() method to do everything.
     */

    public LookupAllSubSectorsDAO() {
    }

    public List<SubSectorVO> getAllSubSectorsDAO() throws SQLException {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select * from endeavour.subsector_lookup sl;\s
                """;
        //Using the connection object, we prepare and execute the queries.
        PreparedStatement preparedStatement =  connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            SubSectorVO subsectorVO = new SubSectorVO();
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subsectorVO);
        }
        return allSubSectors;

    }
}
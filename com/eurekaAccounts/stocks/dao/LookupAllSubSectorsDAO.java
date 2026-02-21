package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubsectorVO;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO {
    public LookupAllSubSectorsDAO() {
    }

    public List<SubsectorVO> getAllSubSectorsDAO() throws SQLException {
        List<SubsectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select
                	*
                from
                	endeavour.subsector_lookup;
                
                """;
        PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement1.executeQuery();
        while (resultSet.next()) {
            SubsectorVO subsectorVO = new SubsectorVO();
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subsectorVO);


        }


        return allSubSectors;
    }

}
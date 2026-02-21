package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpAllSubSectorsDAO extends BaseDAO{
    public LookUpAllSubSectorsDAO() {
    }

    public List<SubSectorVO> getAllSubSectorsDAO() throws SQLException{
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select 
                *
                from
                endeavour.subsector_lookup;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            subSectorVO.setSubsectorId((resultSet.getInt("subsector_id")));
            subSectorVO.setSubSectorName((resultSet.getString("subsector_name")));
            allSubSectors.add(subSectorVO);
        }

        return allSubSectors;
    }
}

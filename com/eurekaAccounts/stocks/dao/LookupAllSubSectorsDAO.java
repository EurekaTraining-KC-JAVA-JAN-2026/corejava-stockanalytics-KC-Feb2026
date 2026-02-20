package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO{
    public LookupAllSubSectorsDAO(){
    }
    public List<SubSectorVO> getAllSubSectorsDAO() throws SQLException{
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select
                	*
                from
                	endeavour.subsector_lookup sl;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            SubSectorVO subsectorVO = new SubSectorVO();
            subsectorVO.setSectorId(resultSet.getInt("sector_id"));
            subsectorVO.setSubsectorId(resultSet.getInt("subsector_id"));
            subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subsectorVO);
        }
        return allSubSectors;
    }

}

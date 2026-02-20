package com.eurekaAccounts.DAO;

import com.eurekaAccounts.stocksVO.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO{
    public LookupAllSubSectorsDAO() throws SQLException {
    }
    public List<SubSectorVO> getAllSubSector() throws SQLException {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String  sqlQuery = """
                select
                * 
                from enedeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
        //System.out.println(preparedStatement);
        ResultSet resultSet =preparedStatement1.executeQuery();
        //System.out.println(resultSet);
        //List<SubSectorVO> allSubSectors = new ArrayList<>();
        while(resultSet.next())
        {
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSubsectorname(resultSet.getString("subsector_name"));
            subSectorVO.setSubsectorid(resultSet.getInt("subsector_id"));
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            allSubSectors.add(subSectorVO);

        }
        return allSubSectors;
    }
}

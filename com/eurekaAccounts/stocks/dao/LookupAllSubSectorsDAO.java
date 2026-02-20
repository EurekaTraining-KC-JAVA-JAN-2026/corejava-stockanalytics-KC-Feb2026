package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO{
    public LookupAllSubSectorsDAO() {
    }

    public List<SubSectorVO> getAllSubSectorsDAO() throws SQLException {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQurey = """
                select\s
                	*
                	from \s
                		endeavour.subsector_lookup;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQurey);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            subSectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subSectorVO.setSunSectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subSectorVO);
        }
        return allSubSectors;
    }
}

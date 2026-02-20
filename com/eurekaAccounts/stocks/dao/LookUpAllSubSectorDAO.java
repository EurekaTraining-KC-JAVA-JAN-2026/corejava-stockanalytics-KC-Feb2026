package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpAllSubSectorDAO extends BaseDAO {
    public LookUpAllSubSectorDAO()  throws SQLException{
    }
    public  List<SubSectorVO> getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery= """
                select
                *
                from
                endeavour.subsector_lookup sl;
                """;
        PreparedStatement preparedStatement1= connection.prepareStatement(sqlQuery);
        ResultSet resultSet= preparedStatement1.executeQuery();
        while (resultSet.next()){
            SubSectorVO subSectorVO=new SubSectorVO();
            subSectorVO.setSectorId(resultSet.getInt("sector_id"));
            subSectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
            subSectorVO.setSubSectorName(resultSet.getString("subsector_name"));
            allSubSectors.add(subSectorVO);

        }
        return allSubSectors;


    }
}

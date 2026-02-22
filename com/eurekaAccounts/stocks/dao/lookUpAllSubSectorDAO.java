package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class lookUpAllSubSectorDAO extends  BaseDAO{

    public lookUpAllSubSectorDAO() {
    }

    public List<SubSectorVO> getAllSubSectors() {
        String sqlQuery1 = """
                select *
                from endeavour.subsector_lookup sl ;
                """;
        List<SubSectorVO> sectorList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            ResultSet resultSet = preparedStatement.executeQuery();
            //List<SectorVO> specificSector = new ArrayList<>();
            while (resultSet.next()) {
                SubSectorVO subsectorVO = new SubSectorVO();
                subsectorVO.setSectorId(resultSet.getInt("sector_id"));
                subsectorVO.setSubSectorName(resultSet.getString("subsector_name"));
                subsectorVO.setSubSectorId(resultSet.getInt("subsector_id"));
                sectorList.add(subsectorVO);
            }

        } catch (SQLException e) {
            System.out.println("From Catch");
            System.out.println(e.getStackTrace());
        }
        return sectorList;
    }
}

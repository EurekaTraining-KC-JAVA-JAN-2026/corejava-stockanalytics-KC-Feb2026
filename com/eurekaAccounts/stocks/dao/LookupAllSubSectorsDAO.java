package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO extends BaseDAO{
    BaseDAO baseDAO = new BaseDAO();
    public  LookupAllSubSectorsDAO()throws SQLException {

    }
    public List<SubSectorVO> getAllSubSectorsDAO() throws SQLException{
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select
                *
                from endeavour.subsector_lookup sl;
                """;
        //Connection connection =;
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                SubSectorVO subSectorVO = new SubSectorVO();
                subSectorVO.setSubsectorId(resultSet.getInt("subsector_id"));
                subSectorVO.setSubsectorName(resultSet.getString("subsector_name"));
                subSectorVO.setSectorId(resultSet.getInt("sector_id"));
                allSubSectors.add(subSectorVO);

            }
        } catch (SQLException e) {
            System.out.println("Catch Block");
            System.out.println(e.getStackTrace());
        }finally {
            System.out.println("finallyf");
            System.out.println("i will always run");
            //connection.close();
        }
        return allSubSectors;
    }
}
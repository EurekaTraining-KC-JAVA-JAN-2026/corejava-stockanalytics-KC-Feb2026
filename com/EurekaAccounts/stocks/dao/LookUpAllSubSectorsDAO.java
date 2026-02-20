package com.EurekaAccounts.stocks.dao;

import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpAllSubSectorsDAO extends BaseDAO {
    BaseDAO baseDAO = new BaseDAO();

    public LookUpAllSubSectorsDAO() throws SQLException {

    }

    public List<SubSectorVo> getAllSubSectors() throws SQLException {
        List<SubSectorVo> allSubSectors = new ArrayList<>();
        String sqlQuery = """
               
                select\s
                              	*
                              	from \s
                              		endeavour.s
                                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                SubSectorVo subSectorVo = new SubSectorVo();
                subSectorVo.setSectorId(resultSet.getInt("sector_id"));
                subSectorVo.setSubSectorId(resultSet.getInt("subsector_id"));
                subSectorVo.setSectorName(resultSet.getString("subsector_name"));
                allSubSectors.add(subSectorVo);

            }
        } catch (SQLException e) {
            System.out.println("Catch Block");
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("finallyf");
            System.out.println("i will always run");
            //connection.close();

            return allSubSectors;
        }
    }

    public List<SubSectorVo> getAllSubSectorsDAO() {
        return List.of();
    }

}

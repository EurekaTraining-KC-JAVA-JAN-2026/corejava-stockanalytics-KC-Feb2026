package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUPSubDAO extends BaseDAO {

    public LookUPSubDAO() throws SQLException {
        super();
    }

    public List<SubSectorVO> getAllSubSectorVO() {
        List<SubSectorVO> allSubsectors = new ArrayList<>();

        String sqlQuery = """
                select *
                from endeavour.subsector_lookup;
                """;

        try (PreparedStatement ps2 = this.connection.prepareStatement(sqlQuery);
             ResultSet rs2 = ps2.executeQuery()) {

            while (rs2.next()) {
                SubSectorVO sub = new SubSectorVO();
                sub.setSubSectorId(rs2.getInt("subsector_id"));
                sub.setSubSectorName(rs2.getString("subsector_name"));
                sub.setSectorId(rs2.getInt("sector_id"));

                allSubsectors.add(sub);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return allSubsectors;
    }
}
package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LookUPSubDAO extends BaseDAO {

    public LookUPSubDAO() throws SQLException {
        super();
    }

    public List<SectorVO> getAllSubSectorVO() {
        List<SectorVO> allSubsectors = new ArrayList<>();

        String sqlQuery = """
                select *
                from endeavour.subsector_lookup where subsector_id = 388 ;
                """;

        try (PreparedStatement ps2 = this.connection.prepareStatement(sqlQuery);
             ResultSet rs2 = ps2.executeQuery()) {

            while (rs2.next()) {
                SectorVO sectorVO1 = new SectorVO();
                sectorVO1.setSubsectorId(rs2.getInt("subsector_id"));

                // If you have setSubsectorName(), use that instead:
                // sectorVO1.setSubsectorName(rs2.getString("subsector_name"));
                sectorVO1.setSectorName(rs2.getString("subsector_name")); // only if SectorVO doesn't have subsectorName

                sectorVO1.setSectorId(rs2.getInt("sector_id"));
                allSubsectors.add(sectorVO1);
                this.connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

        }

        return allSubsectors;
    }
}

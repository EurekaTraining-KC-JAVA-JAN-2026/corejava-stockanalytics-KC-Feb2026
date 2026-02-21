package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LookupSubSectorDAO extends BaseDAO {
    public LookupSubSectorDAO() {
    }

    public List<SubSector> getAllSubSectors() throws SQLException {
        List<SubSector> allSubSectors = new ArrayList<>();
        try {
            String sqlQuery1 = """
                    select * from endeavour.subsector_lookup sl
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            ResultSet resultSet1 = preparedStatement.executeQuery();
            System.out.println(resultSet1);

            while (resultSet1.next()) {
                SubSector subsector = new SubSector();
                subsector.setSubsectorId(resultSet1.getInt("subsector_id"));
                subsector.setSubSectorName(resultSet1.getString("subsector_name"));
                subsector.setSectorId(resultSet1.getInt("sector_id"));
                allSubSectors.add(subsector);
            }

        } catch (RuntimeException e) {
            throw new StockException("An throwble msg", e.getCause());
        } finally {
            System.out.println("from final block");
            System.out.println("finally");
            connection.close();
        }
        Collections.sort(allSubSectors);
        return allSubSectors;
    }
}

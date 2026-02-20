package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.exception.StockException;
import com.eurekaAccounts.stocks.vo.SubSector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupupSubSectorDOA extends BaseDAO {
    public LookupupSubSectorDOA() {
    }

    public List<SubSector> getAllSubSectors() throws SQLException {
        try{
            String sqlQuery1= """
                select * from endeavour.subsector_lookup ssl where ssl.sector_id=35
                """;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            ResultSet resultSet1=preparedStatement.executeQuery();
            System.out.println(resultSet1);
            List<SubSector> allSubSectors=new ArrayList<>();
            while(resultSet1.next()){
                SubSector subsector=new SubSector();
                subsector.setSubsectorId(resultSet1.getInt("subsector_id"));
                subsector.setSubSectorName(resultSet1.getString("subsector_name"));
                subsector.setSectorId(resultSet1.getInt("sector_id"));
                allSubSectors.add(subsector);
            }
            return allSubSectors;
        } catch (RuntimeException e) {
            throw new StockException("An throwble msg",e.getCause());
        }finally {
            System.out.println("from final block");
            System.out.println("finally");
            connection.close();
        }
    }
}

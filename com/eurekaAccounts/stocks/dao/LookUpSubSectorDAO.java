package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpSubSectorDAO extends BaseDAO{
    public LookUpSubSectorDAO() {
    }

    public List<SubSectorVO> getAllSubSectors() {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery1 = """
                select
                	*
                from
                	endeavour.subsector_lookup sl
                """;
        try{
            // we are converting the sql query into a string
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery1);
            ResultSet resultSet = preparedStatement.executeQuery();
            //we are executing the query
//        List<SubSectorVO> allSubSectors = new ArrayList<>();
            while (resultSet.next()) {
                SubSectorVO subsectorVo = new SubSectorVO();
                subsectorVo.setSubsector_id(resultSet.getInt("subsector_id"));
                subsectorVo.setSubsector_name(resultSet.getString("subsector_name"));
                subsectorVo.setSector_id(resultSet.getInt("sector_id"));
                allSubSectors.add(subsectorVo);
            }
//        System.out.println(allSubSectors);
        }
        catch(SQLException e){
            System.out.println("We are getting it from catch");
            System.out.println(e.getStackTrace());
        }
        return allSubSectors;
    }

}

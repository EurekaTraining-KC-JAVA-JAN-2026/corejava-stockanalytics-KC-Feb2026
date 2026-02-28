package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVVo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUPSectors extends BAse1DAO{

    public LookUPSectors(){
    }

    public List<SectorVVo> getAllSectors() throws SQLException {
        String SQL = """
                select * from endeavour.sector_lookup sl order by sl.sector_id desc limit 10;
                """;

       PreparedStatement preparedStatement = connection.prepareStatement(SQL);
       ResultSet resultSet = preparedStatement.executeQuery();
       List<SectorVVo> sectorVOS = new ArrayList<>();
       while (resultSet.next()) {
           SectorVVo sectorVO = new SectorVVo();
           sectorVO.setSector_id(resultSet.getInt("sector_id"));
           sectorVO.setSector_name(resultSet.getString("sector_name"));
           sectorVOS.add(sectorVO);
       }
       return sectorVOS;
    }
}

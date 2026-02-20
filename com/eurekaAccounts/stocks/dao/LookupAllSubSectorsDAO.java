package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupAllSubSectorsDAO  extends BaseDAO{
    public LookupAllSubSectorsDAO() {
    }

    public void getAllSubSectorsDAO() throws SQLException {
        List<SubSectorVO> allSubSectors = new ArrayList<>();
        String sqlQuery = """
                select
                *
                from
                 endeavour.subsector_lookup;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            SubSectorVO subSectorVO = new SubSectorVO();
        }
    }
}

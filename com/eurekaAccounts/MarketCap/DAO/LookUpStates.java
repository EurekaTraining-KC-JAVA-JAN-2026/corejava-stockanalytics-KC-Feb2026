package com.eurekaAccounts.MarketCap.DAO;

import com.eurekaAccounts.MarketCap.StateLookUpVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpStates extends BaseDAO1{

    public List<StateLookUpVO> getTotalNumberOfStates() throws SQLException {
        String sqlQuery = """
                select count(sl.state_name) as total_states
                from endeavour.state_lookup sl;
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StateLookUpVO> stateLookUpVOS = new ArrayList<>();
        while (resultSet.next()){
            StateLookUpVO stateLookUpVO = new StateLookUpVO();
            stateLookUpVO.setTotalStates(resultSet.getInt("total_states"));
            //stateLookUpVO.setStateSymbol(resultSet.getString("state_symbol"));
            stateLookUpVOS.add(stateLookUpVO);
        }
        return stateLookUpVOS;
    }
}

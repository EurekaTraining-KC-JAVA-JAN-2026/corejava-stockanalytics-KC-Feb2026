package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.ComapnyLocationVO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpCompanyLocationDAO extends BaseDAO {

    public LookUpCompanyLocationDAO() throws SQLException {
    }
    public List<BigDecimal> getComapnyLocationsDAO() throws SQLException {
      List<BigDecimal> stateCount =new ArrayList<>();
        String SQuery= """
                     select  count(* ) as count
                          from endeavour.state_lookup sl ;
                
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            BigDecimal value=resultSet.getBigDecimal("count");

            stateCount.add(value);
        }
        return stateCount ;
    }
}

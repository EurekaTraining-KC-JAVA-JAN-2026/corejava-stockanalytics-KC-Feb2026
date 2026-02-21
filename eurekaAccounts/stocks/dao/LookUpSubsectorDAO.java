package eurekaAccounts.stocks.dao;

import eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookUpSubsectorDAO extends BaseDAO {
    public LookUpSubsectorDAO() throws SQLException {
    }

    public List<SubSectorVO> getAllSubSectorsDAO(){
            List<SubSectorVO> allSubSectors=new ArrayList<>();
            String sqlQuery= """
                 select *
                      from endeavour.subsector_lookup sl
                   
                 """;
            // holding subquery
            try {

                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                //preparedStatement.setInt(1, sector_id);
                //execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    SubSectorVO subSectorVO = new SubSectorVO();
                    subSectorVO.setSubsector_id(resultSet.getInt("subsector_id"));
                    subSectorVO.setSector_id(resultSet.getInt("sector_id"));
                    subSectorVO.setSubsector_name(resultSet.getString("subsector_name"));
                    allSubSectors.add(subSectorVO);
                }
            } catch (SQLException e) {
                System.out.println("ERROR");
            }

            return allSubSectors;
        }

    }



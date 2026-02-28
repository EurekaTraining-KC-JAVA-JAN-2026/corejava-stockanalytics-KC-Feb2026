package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.vo.SubsectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupsubsectorDAO extends BaseDAO {

    public LookupsubsectorDAO() throws SQLException {
    }

////    public static List<stockfundamentalVO> getAllstockfundamentals() {
//        return null;
//    }

    public List<SubsectorVO> getAllSubsectors(){
    List<SubsectorVO> allSubsectors = new ArrayList<>();
        String sqlQuerey = """
               select
               *
                from
               endeavour.subsector_lookup sl
              """;
        try {
            PreparedStatement prepareStatement1 = connection.prepareStatement(sqlQuerey);
            ResultSet resultSet1 = prepareStatement1.executeQuery();
            while (resultSet1.next()) {
                SubsectorVO subSectorVO = new SubsectorVO();
                subSectorVO.setSubsector_id(resultSet1.getInt("subsector_id"));
                subSectorVO.setSubsector_name(resultSet1.getString("subsector_name"));
                subSectorVO.setSector_id(resultSet1.getInt("sector_id"));
                allSubsectors.add(subSectorVO);
            }
        }catch (SQLException e){
            System.out.println("error");
        }
//        System.out.println(allSubsectors);
        return allSubsectors;
    }
}


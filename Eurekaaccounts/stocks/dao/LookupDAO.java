package Eurekaaccounts.stocks.dao;

import Eurekaaccounts.stocks.Exceptions.Stockexception;
import Eurekaaccounts.stocks.vo.SectorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LookupDAO extends BaseDAO {


    public LookupDAO() throws SQLException {
    }

    public List<SectorVO> getAllSectors(int sector_id) {
        List<SectorVO> allsectors = new ArrayList<>();
        String sqlQuerey = """
               select
               *
                from
               endeavour.sector_lookup sl
              """;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sqlQuerey);
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSector_id(resultSet.getInt("sector_id"));
                sectorVO.setSector_name(resultSet.getString("sector_name"));
                allsectors.add(sectorVO);
            }
            System.out.println(allsectors);
//        }catch (SQLException e){
//            System.out.println("from catch");
//            System.out.println(e);


        } catch (Stockexception | SQLException e) {
            System.out.println("from cath");
        throw new Stockexception("an exception");
//            System.out.println(e);
//            System.out.println("from catch");
        } catch (RuntimeException e){
            throw new Stockexception("an exception",e.getCause());
        }
        finally {
            System.out.println("finally");
        }
        return allsectors;
    }
}

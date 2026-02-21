//package com.eurekaAccounts.stocks.dao;
//
//import com.eurekaAccounts.stocks.vo.SectorVO;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LookUpDAO extends BaseDAO {
//    public LookUpDAO() {
//        super();
//    }
//
//    public static List<SectorVO> getAllSectorsDAO() throws SQLException {
//        List<SectorVO> allSectors = new ArrayList();
//        try {
//            String sqlQuery = """
//                    select *
//                    from endeavour.sector_lookup sl  where sl.sector_id=35;
//                    """;
//            PreparedStatement ps1=null;
//            try{
//                  connection.prepareStatement(sqlQuery);
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//            ResultSet rs1 = ps1.executeQuery();
//
//
//            while (rs1.next()) {
//                SectorVO sectorVO = new SectorVO();
//                sectorVO.setSectorId(rs1.getInt("sector_id"));
//                sectorVO.setSectorName(rs1.getString("sector_name"));
//                allSectors.add(sectorVO);
//            }
//
//            System.out.println(allSectors);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return allSectors;
//    }
//}




package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LookUpDAO extends BaseDAO {

    public LookUpDAO() throws SQLException {
        super();
    }

    public List<SectorVO> getAllSectorsDAO() throws SQLException {
        List<SectorVO> allSectors = new ArrayList<>();

        String sqlQuery = """
                select sector_id, sector_name
                from endeavour.sector_lookup;
               
                """;

        try (PreparedStatement ps1 = this.connection.prepareStatement(sqlQuery);
             ResultSet rs1 = ps1.executeQuery()) {

            while (rs1.next()) {
                SectorVO sectorVO = new SectorVO();
                sectorVO.setSectorId(rs1.getInt("sector_id"));
                sectorVO.setSectorName(rs1.getString("sector_name"));
                allSectors.add(sectorVO);
            }
        }
        Collections.sort(allSectors);

        return allSectors;
    }
}

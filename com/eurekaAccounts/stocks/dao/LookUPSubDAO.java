package com.eurekaAccounts.stocks.dao;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//
public class LookUPSubDAO extends BaseDAO {

    public LookUPSubDAO() throws SQLException {
        super();
    }
//
//    public List<SubSectorVO> getAllSubSectorVO() {
//        List<SubSectorVO> allSubsectors = new ArrayList<>();
//
//        String sqlQuery = """
//                select sector_id, subsector_id, market_cap,subsector_name
//                from endeavour.subsector_lookup sl join endeavour.stock_fundamentals  sf  on sf.subsector_id = sl.subsector_id
//                """;
//
//        try (PreparedStatement ps2 = this.connection.prepareStatement(sqlQuery);
//             ResultSet rs2 = ps2.executeQuery()) {
//
//            while (rs2.next()) {
//                SubSectorVO sub = new SubSectorVO();
//                sub.setSubSectorId(rs2.getInt("subsector_id"));
//                sub.setSubSectorName(rs2.getString("subsector_name"));
//                sub.setSectorId(rs2.getInt("sector_id"));
//                sub.setTicker_name(rs2.getString("ticker_name"));
//
//                allSubsectors.add(sub);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        return allSubsectors;
//    }
//}


    public List<SubSectorVO> getAllSubSectorVO() {

        List<SubSectorVO> allSubsectors = new ArrayList<>();

        String sqlQuery = """
                select sf.sector_id        as sector_id,
                       sf.subsector_id     as subsector_id,
                       sl.subsector_name   as subsector_name,
                       st.ticker_name      as ticker_name
                from endeavour.stock_fundamentals sf
                join endeavour.subsector_lookup sl
                  on sl.subsector_id = sf.subsector_id
                join endeavour.stocks_lookup st
                  on st.ticker_symbol = sf.ticker_symbol
                """;

        try (PreparedStatement ps2 = this.connection.prepareStatement(sqlQuery);
             ResultSet rs2 = ps2.executeQuery()) {

            while (rs2.next()) {
                SubSectorVO sub = new SubSectorVO();
                sub.setSectorId(rs2.getInt("sector_id"));
                sub.setSubSectorId(rs2.getInt("subsector_id"));
                sub.setSubSectorName(rs2.getString("subsector_name"));
                sub.setTicker_name(rs2.getString("ticker_name"));
                allSubsectors.add(sub);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return allSubsectors;
    }
}
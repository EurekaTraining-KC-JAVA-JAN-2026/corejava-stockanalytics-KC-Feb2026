package Eurekaaccounts.stocks.service;

import Eurekaaccounts.stocks.Sorting.SubsectorsnameComparator;
import Eurekaaccounts.stocks.dao.LookupDAO;
import Eurekaaccounts.stocks.dao.LookupStockfundamentalsDAO;
import Eurekaaccounts.stocks.dao.LookupsubsectorDAO;
import Eurekaaccounts.stocks.vo.SectorVO;
import Eurekaaccounts.stocks.vo.SubsectorVO;
import Eurekaaccounts.stocks.vo.stockfundamentalVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsservice {
    LookupDAO lookup = new LookupDAO();
    LookupsubsectorDAO lookupsubsectorDAO = new LookupsubsectorDAO();
    public MarketAnalyticsservice() throws SQLException {
    }
    public String getAllsectorservices() throws SQLException{
        List<SectorVO> AllSectors=lookup.getAllSectors(34);
       // Collections.sort(AllSectors);
        // comparable is like natural order
        Collections.sort(AllSectors);//here we r putting the sectors in desc order by implementing comparable interface
;        return AllSectors.toString();
    }

    public String tostring() {
        List<SectorVO> allSectors =lookup.getAllSectors(30);
        return allSectors.toString();
    }

    public String getAllsubsectorservices() {
        List<SubsectorVO> AllSubSectors=lookupsubsectorDAO.getAllSubsectors(34);
//       Collections.sort(AllSubSectors);
//getAllsubsectorservices()
//        AllSubSectors.sort(sub);
        Collections.sort(AllSubSectors,new SubsectorsnameComparator().thenComparing(SubsectorVO ::getSubsector_name));
//        AllSubSectors
        return AllSubSectors.toString();
    }
    public List<stockfundamentalVO> getstockfundamental() throws SQLException{
        List<stockfundamentalVO> stockfundamental= LookupStockfundamentalsDAO.getAllstockfundamentals(34);
        Collections.sort(stockfundamental);
        return stockfundamental;
    }
}

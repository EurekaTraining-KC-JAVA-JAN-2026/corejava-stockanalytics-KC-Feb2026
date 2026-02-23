package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorsNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalVO;
import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {

    /**
     * using the service layer we fetch the data from DAO, and here we perform
     * some logic like converting the list to string or just get the data as usual
     * from DAO and pass it to main, or to filter the data
     */



    //Means this class depends on DAO
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorDAO lookupAllSubSectorDAO = new LookupAllSubSectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();

    public String getAllSector() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Collections.sort(allSectors);
        return allSectors.toString();
    }

     public long getAllSubSectors() throws SQLException {
         List<SubsectorVO> allSubSectors = lookUpDAO.getAllSubSectors();
         //Collections.sort(allSubSectors);
         /**
          * USING comparable is like using natural order.
          * Here we are printing the seco
          */
        // allSubSectors.stream().filter(subsectorVO -> subsectorVO.getSubSectorId()%2 == 0).collect(Collectors.toList());
        long collect =  allSubSectors.stream().filter(subsectorVO -> subsectorVO.getSubSectorId()%2 == 0).count();


         Collections.sort(allSubSectors);
         return collect;
     }

    public String getAllSubSectorsService() throws SQLException {
         List<SubsectorVO> allsubSectorDAO =  lookupAllSubSectorDAO.getAllSubSectorsDAO();
        // Collections.sort(allsubSectorDAO);
         //allsubSectorDAO.sort(SubsectorVO::compareTo);
        //Collections.sort(allsubSectorDAO, new SubSectorsNameComparator());
//         allsubSectorDAO.sort(Comparator.comparing(SubsectorVO::getSectorId)
//                 .thenComparing(SubsectorVO::getSubSectorName)
//                 .thenComparing(SubsectorVO::getSubSectorId));
        //Collections.sort(allsubSectorDAO);
        Collections.sort(allsubSectorDAO, new SubSectorsNameComparator().thenComparing(SubsectorVO::getSubSectorName));
         return allsubSectorDAO.toString();
    }

    public String getStockFundamentals() throws SQLException {
       List<StockFundamentalVO> allStockFundamentals =   lookUpStockFundamentals.getAllStockFundamentals();
       Collections.sort(allStockFundamentals);
       StockFundamentalVO stockFundamentalVO = allStockFundamentals.get(0);
       return stockFundamentalVO.toString();
    }
}

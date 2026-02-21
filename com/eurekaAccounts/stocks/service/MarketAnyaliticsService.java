package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.MarketCapReveresd;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketAnyaliticsService {
    public MarketAnyaliticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();
    public String getAllSectorsService(){
        //some opertaions as per requirement
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        /**
         * USING comparable is like using natural order
         * USING comparator we sort in unnatural, fexibility for us sort what ever and what ever...
         * // here we are printing the sectors in desc. order by implementing Comparable interface and overriding compareTo method
         */
        Collections.sort(allSectors); return allSectors.toString();
    }

    public List<SubSectorVO> getAllSubSectorsService() throws SQLException {
        List<SubSectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //Collections.sort(allSubSectorsDAO);
        //allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::toString)
               // .thenComparing(SubSectorVO::getSectorId));
        //allSubSectorsDAO.sort(SubSectorVO::compareTo);
       // Collections.sort(allSubSectorsDAO,new SubSectorNameComparator());
       // allSubSectorsDAO.sort(SubSectorNameComparator,);
//        allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::getSectorId)
//                                        .thenComparing(SubSectorVO::getSubSectorName)
//                                        .thenComparing(SubSectorVO::getSubSectorId));

        Collections.sort(allSubSectorsDAO,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        return allSubSectorsDAO;
    }

    public List<StockFundamentalsVO> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        //here we are sorting the SF's details on marketCap
        return allStockFundamentals;
    }
}

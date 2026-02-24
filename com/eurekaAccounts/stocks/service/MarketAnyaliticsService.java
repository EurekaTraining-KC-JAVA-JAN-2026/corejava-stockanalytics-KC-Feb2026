package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundementals;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarketAnyaliticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO= new LookupAllSubSectorsDAO();
    LookUpStockFundementals lookUpStockFundementalsDAO = new LookUpStockFundementals();
     public String getAllSectors()throws SQLException{

        List<SectorVO>  allSectors = lookUpDAO.getAllSectors();
         Collections.sort(allSectors);
         /**
          *  we will not get error now coz we have implemented comparable and overriding compareto method
          *  comparator takes 2 objects and compare
          *
          */

        return allSectors.toString();
        //List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAll;
    }
    public String getAllSubSectors()throws SQLException{
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        Collections.sort(allSubSectors);
      //  allSubSectors.sort(Comparator.comparing(SubSectorVO::getSector_id).thenComparing(SubSectorVO::getSubSector_name).thenComparing(SubSectorVO::getSubSector_id));
      //  Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSector_name));
        //allSubSectors.sort();
        long collect = allSubSectors.stream().filter(subSectorVO -> subSectorVO.getSector_id() % 2 == 0).collect(Collections)
        return collect;//allSubSectors.toString();

    }
    public MarketAnyaliticsService()throws SQLException{
    }

    public String getAllStockFundementals() throws SQLException {
       List<StockFundementalVO> allStockFundemental = lookUpStockFundementalsDAO.getAllStockFundementals();
       Collections.sort(allStockFundemental);
       StockFundementalVO highestmarketStock = allStockFundemental.get(0);
       return  highestmarketStock.toString() ;
    }
}

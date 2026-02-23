package eurekaAccounts.stocks.service;

import eurekaAccounts.stocks.dao.LookUpDAO;
import eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.StockfundamentalVO;
import eurekaAccounts.stocks.vo.SubsectorVO;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MarketAnalyticsService {
    // this service layer is for doing operations as per requirement
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentals = new LookUpStockFundamentalsDAO();


    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

    }

    public long getAllSubSectorsService() throws SQLException {
        List<SubsectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::toString));

        //Collections.sort(allSubSectorsDAO);
        //allSubSectorsDAO.sort(SubsectorVO::compareTo);
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::getSectorId).thenComparing(SubsectorVO::getSectorName).thenComparing(SubsectorVO::getSubSectorId));
        //allSubSectorsDAO.sort(allSubSectorsDAO, new SubSectorNameComparator());
        long collect = allSubSectorsDAO.stream()
                .filter(subsectorVO -> subsectorVO.getSectorId()%2 == 0)
                .count();

        Collections.sort(allSubSectorsDAO, new SubSectorNameComparator().thenComparing(SubsectorVO::getSubSectorName));
        return collect;
        //return allSubSectors.toString();

    }

    public String getStockFundamental() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockfundamentalVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();

    }
}





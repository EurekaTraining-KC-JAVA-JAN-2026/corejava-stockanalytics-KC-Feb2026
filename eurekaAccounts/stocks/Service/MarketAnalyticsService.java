package eurekaAccounts.stocks.Service;

import eurekaAccounts.stocks.StocksAnalytics;
import eurekaAccounts.stocks.dao.LookUpDAO;
import eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import eurekaAccounts.stocks.dao.LookUpSubsectorDAO;
import eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.StockFundamentalsVO;
import eurekaAccounts.stocks.vo.SubSectorVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MarketAnalyticsService {

    LookUpDAO lookUpDAO=new LookUpDAO();
    LookUpSubsectorDAO lookUpSubsectorDAO =new LookUpSubsectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals=new LookUpStockFundamentals();


    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllSectorsServices() throws SQLException {
        List<SectorVO> allSectors=lookUpDAO.getAllSectorsDAO();
            Collections.sort(allSectors);//here we printing the sector in desc by overiding the compareTo method
            return  allSectors.toString();

    }

   public String getALlSubSectorServices() {
      List<SubSectorVO> allSubsectors= lookUpSubsectorDAO.getAllSubSectorsDAO();
//       Collections.sort(allSubsectors);
//       Collections.sort(allSubsectors, new SubSectorNameComparator());
       long count = allSubsectors.stream().filter(subSectorVO -> subSectorVO.getSector_id() % 2 == 0).count();
       System.out.println(count);
       allSubsectors.sort(Comparator.comparing(SubSectorVO::getSector_id).thenComparing(SubSectorVO::getSubsector_name).thenComparing(SubSectorVO::getSubsector_id));

        return allSubsectors.toString();
    }


    public String getAllstockfundamentalsService() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals =lookUpStockFundamentals.getAllStockFundamentalsDAO();
        Collections.sort(allStockFundamentals);
        return allStockFundamentals.toString();
    }
}

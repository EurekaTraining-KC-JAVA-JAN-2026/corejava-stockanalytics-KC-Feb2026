package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SectorsComparator;
import com.eurekaAccounts.stocks.sorting.SubSectorsNameComparator;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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
    LookUPSectors lookUPSectors = new LookUPSectors();
    CompanyLocationDAO companyLocationDAO = new CompanyLocationDAO();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();
    SFDemo sfDemo = new SFDemo();

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

     public List<BigDecimal> getCount() throws SQLException {
        List<BigDecimal> gettingCount = lookUpDAO.getTheStateCount();
        return gettingCount;

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

//    public String getStockFundamentals() throws SQLException {
//       List<StockFundamentalVO> allStockFundamentals =   lookUpStockFundamentals.getAllStockFundamentals();
//      // Collections.sort(allStockFundamentals);
//       //StockFundamentalVO stockFundamentalVO = allStockFundamentals.get(0);
//       return allStockFundamentals;
//    }

    public List<StockFundamentalVO> getTopFiveStoack() throws SQLException {
        List<StockFundamentalVO> fiveStocks = lookUpStockFundamentals.getAllStockFundamentals();
        List<StockFundamentalVO> highStock= fiveStocks.stream().sorted(Comparator.comparing(StockFundamentalVO::getMarketCap,Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
        return highStock;
    }

    public List<SectorVVo> getFewSectors() throws SQLException {
       List<SectorVVo> sectorVOS =  lookUPSectors.getAllSectors();
       Collections.sort(sectorVOS, new SectorsComparator().thenComparing(SectorVVo::getSector_id).thenComparing(SectorVVo::getSector_name));
       return sectorVOS;
    }

    public List<CompanyLocationsVo> getLocation() throws SQLException {
        List<CompanyLocationsVo> companyLocationsVos = companyLocationDAO.getlocation();
        return companyLocationsVos;
    }

    public String getAllHealthCareSectors() throws SQLException {
      List<StockFundamentalVO> allStockFundamentals =  lookUpStockFundamentals.getAllStockFundamentals();
      List<StockFundamentalVO> allHealthCareStocks = new ArrayList<>();
      //Using a for loop is
//      allStockFundamentals.forEach(stockFundamentalVO -> {
//          if (stockFundamentalVO.getSectorId().equals(new BigDecimal(34))) {
//              allHealthCareStocks.add(stockFundamentalVO);
//          }
//      });

        //Getting all HEalth Care stocks and then seeing best performing and then seeing top 5
        List<StockFundamentalVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundamentalVO::getMarketCap).reversed())//Something with methodf reference
               // .map(StockFundamentalVO::getTickerSymbol)
                .limit(5)
                .collect(Collectors.toList());

        String ListOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.joining(","));

        return ListOfTop5PerformingStocks;

    }

    public void getSumOfMarketCapOfHealthCareSectors() throws SQLException {
       List<StockFundamentalVO> allStockFundamentals =  lookUpStockFundamentals.getAllStockFundamentals();
       Optional<BigDecimal> reduce = allStockFundamentals.stream().map(x -> x.getMarketCap())
               .reduce((a, b) -> a.add(b));

       reduce.ifPresent(x -> System.out.println(x));
       reduce.ifPresent(System.out::println);

       allStockFundamentals.parallelStream().map(x -> x.getMarketCap())
               .reduce((a, b) -> a.add(b));
    }

    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsVo = lookUpDAO.getAllSectors();
        Map<Integer, String> allSectorsMap = allSectorsVo.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
        return allSectorsMap;
    }

    //key as a subsectorId and value as list of tickerSymbols, connecting to the id.
//    public void getAllSubsectorNameWithId() throws SQLException {
//        List<StockFundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
//        allStockFundamentals.stream().collect(groupingBy(StockFundamentalVO::getSubsectorId))
//
////               .collect(Collectors.toList());
//
//      // Map<BigDecimal, List<StockFundamentalVO>> KeyValues =  allStockFundamentals.stream().collect(Collectors.toMap(StockFundamentalVO::getSubsectorId, getAllSubSectors()));
//
//
//       //System.out.println(KeyValues);
//
//        //listOFTickerSymbols.stream().map(StockFundamentalVO::getSubsectorId, listOFTickerSymbols.stream()
//    }

    public List<String> getTopHealthCareTikerSymbols() throws SQLException {
        List<StockFundamentalVO> healthCareTickerSymbol = lookUpStockFundamentals.getAllStockFundamentals();
        List<StockFundamentalVO> finalResult =  healthCareTickerSymbol.stream()
                                                                      .filter(ticker ->
                                                                       ticker.getSectorId().equals(new BigDecimal(34)))
                                                                      .collect(Collectors.toList());

        List<String> topPerformingHealthCare = finalResult.stream()
                                                          .filter(marketCap -> marketCap.getMarketCap()
                                                                  .compareTo(new BigDecimal("10000000000"))>0)
                                                           .map(tickerSymbol -> tickerSymbol.getTickerSymbol())
                                                           .collect(Collectors.toList());
        return topPerformingHealthCare;
    }

    public void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVo> lookUpStockPriceHistoryDAOS = lookUpStockPriceHistoryDAO.getAllStockPriceHistroy(tesla, now);
        System.out.println(lookUpStockPriceHistoryDAOS);

    }
}

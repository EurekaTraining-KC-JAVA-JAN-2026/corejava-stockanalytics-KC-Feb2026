package com.eurekaAccounts.stocks.service;


import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.stocksVO.CompanyLocationVO;
import com.eurekaAccounts.stocks.stocksVO.SectorVO;
import com.eurekaAccounts.stocks.stocksVO.SubSectorVO;
import com.eurekaAccounts.stocks.stocksVO.StocksectorVO;
import com.eurekaAccounts.stocks.DAO.LookupStockFundamentsDAO;
import com.eurekaAccounts.stocks.DAO.LocationDAO;
import com.eurekaAccounts.stocks.DAO.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.DAO.LookupDAO;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class MarketAnalyticsService {
    LookupDAO lookupDAO = new LookupDAO();
    LookupDAO lookupDAO2 = new LookupDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LocationDAO locationDAO = new LocationDAO();
    LookupDAO locationDAO1 = new LookupDAO();
    LookupStockFundamentsDAO lookupStockFundamentsDAO = new LookupStockFundamentsDAO();
    LookupStockFundamentsDAO lookupStockFundamentsDAO2 = new LookupStockFundamentsDAO();

    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllSectors() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        Collections.sort(allSectors);
        /**
         * using comparable is like using natural order
         * //here we are printing the sectors in desc order by implementing comparable
         *
         */
        return allSectors.toString();
    }

    public String getSpecificSectors() throws SQLException {
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();
    }

    public String getAllSubSector() throws SQLException {
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSector();
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorname));
        return allSubSectors.toString();
    }

   public String getAllSubSectors() throws SQLException {
       List<StocksectorVO> allStockFundamentals = lookupStockFundamentsDAO.getStockFundamentals();
       Collections.sort(allStockFundamentals);
       // StocksectorVO highestStock = allStockFundamentals.get(0);
       return allStockFundamentals.toString();
   }
//        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
//        // Collections.sort(allSubSectors,new SubSectorNameComparator());
//        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
//        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
//        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
//        Collections.sort(allSubSectors, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorname));
//        return allSubSectors.toString();
//        //return allSubSectorsDAO;
//        //return allSubSectors.
//    }

    public String getAppleStock() throws SQLException{
        List<CompanyLocationVO> appleAddress = locationDAO.getAlllocations();
        return appleAddress.toString();
    }

    public String getTopStockFundamentals() throws SQLException{
        List<StocksectorVO> topStockFundamentals = lookupStockFundamentsDAO.getStockFundamentals();
        List<StocksectorVO> top5Stocks = topStockFundamentals.stream().sorted(Comparator.comparing(StocksectorVO::getMarketCap,Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
        return top5Stocks.toString();
    }

    public List<BigDecimal> getStateCount() throws SQLException{
        //List<BigDecimal> statecount = LocationDAO.getstatecount();
        //return statecount;
        return null;
    }

    public String getAllHealthCareSectors() throws SQLException{
        List<StocksectorVO> allStockFundamentals = lookupStockFundamentsDAO.getStockFundamentals();
        List<StocksectorVO> allHealthCareStocks = new ArrayList<>();
        allStockFundamentals.forEach(stocksectorVO -> {
            if(stocksectorVO.getSectorId().equals(new BigDecimal(34)))
            {
                allHealthCareStocks.add(stocksectorVO);
            }
        });
        List<StocksectorVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x->x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StocksectorVO::getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());
        String ListOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream().map(x->x.getTickerSymbol()).collect(Collectors.joining(","));
        return ListOfTop5PerformingStocks;
    }
//    public void getSumOfMktCapOfHealthCareStocks() throws SQLException{
//        List<StocksectorVO> allStockFundamentals = lookupStockFundamentsDAO.getStockFundamentals();
//        //Optional<Long> reduce = allStockFundamentals.stream().map(x->x.getMarketCap()).reduce(a, b)-> a + b);
//        //System.out.println(reduce);
//       // reduce.ifPresent(x->System.out.println(x));
//        allStockFundamentals.parallelStream().map(x->x.getMarketCap()).reduce(a,b)->a+b);
//    }
    public Map<Integer,String> getAllSectorsMap() throws SQLException{
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer,String> collect = allSectorsDAO.stream().collect(Collectors.toMap(SectorVO::getSectorId,SectorVO::getSectorName));
        return collect;
    }
    public Map<Integer,List<String>> getGroupOfTickerSymbols() throws SQLException{
        List<StocksectorVO> allSubSectorGroup = lookupStockFundamentsDAO.getStockFundamentals();
        Map<Integer,List<String>> groupByTickersSymbol = allSubSectorGroup.stream().collect(Collectors.groupingBy(StocksectorVO :: getSubSectorId,Collectors.mapping(StocksectorVO::getTickerSymbol,Collectors.toList())));
        return groupByTickersSymbol;
    }
    public List<String> getBlueChipStocks() throws SQLException
    {
        List<StocksectorVO> blueTickerSymbols = lookupStockFundamentsDAO.getBlueChipStocks();
        List<String> blueTickerStreams = blueTickerSymbols.stream().filter(x ->
                        BigDecimal.valueOf(34).equals(x.getSectorId()) && x.getMarketCap() > 10_000_000_000L)
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.toList());

        return  blueTickerStreams;
    }

//    public List<CompanyLocationVO> getAlllocations() throws SQLException{
//        LocationDAO locationDAO1 = new LocationDAO();
//        List<CompanyLocationVO> alllocation = locationDAO1.getAlllocations();
//
//        return alllocation;
//    }

//    public String getAllStockFundementals() throws SQLException {
//        List<StocksectorVO> allStockFundamentals = LookupAllSubSectorsDAO.getStockSector();
        //Collections.sort(allStockFundamentals);
        //StocksectorVO highestStock = allStockFundamentals.get(0);
        //return highestStock.toString();
//public List<StocksectorVO> getStockFundamentals() throws SQLException {
//    List<StocksectorVO> allStockFundamentals = lookupStockFundamentsDAO.getStockFundamentals();
//    List<StocksectorVO> StockFundeamentals1 = new ArrayList<>();
//    allStockFundamentals.stream().filter(stockFundamentalsVO -> {
////        if(stockFundamentalsVO.getSectorId()==34)) {
////            StockFundeamentals1.add(stockFundamentalsVO);
////
////        }
//    });
//    List<StocksectorVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
//            .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
//            //.sorted(Comparator::comparing(StocksectorVO::getMarketCap).reversed()) // to see
//            .collect(Collectors.toList());
//
//    return  allHealthCareStocksFromStreams;
//
//
//    }
//    public void getSumofMKtCapOfHealthCareStocks() throws SQLException {
//        List<StocksectorVO> allStockFundamental2 = lookupStockFundamentsDAO.getStockFundamentals();
//        Optional<BigDecimal> sumOfMktCap = allStockFundamental2.stream();
//        allStockFundamental2.stream().map(x -> x.getMarketCap()).reduce((aLong, aLong2) -> aLong.add(aLong2));
//        sumOfMktCap.ifPresent(System.out::println);
//
//        allStockFundamental2.parallelStream().map(x -> x.getMarketCap()).reduce((aLong, aLong2) -> aLong.add(aLong2));
//    }
//
//    public Map<Integer,String> getAllSectorsMap(){
//    List<SectorVO> getAllSectorsMap = lookupDAO.getAllSectors();
//    Map<Integer, String> collect = getAllSectorsMap.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
//    return getAllSectorsMap();
//
//    List<StocksectorVO> listBySubsectorIdAndTickerSymbol = getStockFundamentals();
//    List<StocksectorVO> listBySubsectorIdAndTickerSymbol = getStockFundamentals();
//       public void  getTelsaStockPriceHistory() throws SQLException{
//       LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();
//           System.out.println(lookUpStockPriceHistoryDAO.getStockPriceHistory(M,now));
//
//}
}






package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.*;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {
LookUpDAO lookupDAO = new LookUpDAO();
LookUpDAO lookupDAO2 = new LookUpDAO();
LookUpAllSubSectorDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorDAO();
LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO2 = new LookUpStockFundamentalsDAO();

CompanyLocationsDAO companyLocationsDAO =  new CompanyLocationsDAO();
CompanyLocationsDAO companyLocationsDAO2 =  new CompanyLocationsDAO();

StockPriceHistoryDAO StockPriceHistoryDAO =  new StockPriceHistoryDAO();

public String getAllSectors() throws SQLException {
    List<SectorVO> allSectors = lookupDAO.getAllSectors();
    Collections.sort(allSectors);

    // used comparable interface by overriding compareTo and did descending order
    // comparable to perform natural sorting order
    return allSectors.toString();


}
    public String getSpecificSectors() throws SQLException {
        List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();


    }
    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        //Collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
       // Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
       // long collect = allSubSectors.stream().filter(subSectorVO -> subSectorVO.getSubsectorId() % 2 != 0).collect(Collectors.toList()).stream().count();
        //System.out.println(collect);
        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        //.thenComparing(SubSectorVO::getSubsectorName, Comparator.reverseOrder())- for descending order
        return allSubSectors.toString();
        //return allSubSectorsDAO;
        //return allSubSectors.


    }
    public String getAllStockFundementals() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        //StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return allStockFundamentals.toString();


    }

    public MarketAnalyticsService() throws SQLException {
    }

    public String getAppleStock() throws SQLException {
        List<CompanyLocationsVO> appleAddress = companyLocationsDAO.appleLocation();
        //Collections.sort(allStockFundamentals);
        //StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return appleAddress.toString();


    }
    public String getTopStockFundementals() throws SQLException {
        List<StockFundementalsVO> topStockFundamentals = lookUpStockFundamentalsDAO2.getStockFundamentals();
        List<StockFundementalsVO> top5Stocks = topStockFundamentals.stream().sorted(Comparator.comparing(StockFundementalsVO::getMarketCap,Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
        //StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return top5Stocks.toString();


    }

    public List<BigDecimal>  getStateCount() throws SQLException {
       // List<BigDecimal> stateCount = companyLocationsDAO2.getStateCount();
        //return stateCount;
        return null;
    }

    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO2.getStockFundamentals();
        List<StockFundementalsVO> allHealthCareStocks = new ArrayList<>();
        allStockFundamentals.forEach(stockFundamentalsVO -> {
                if(stockFundamentalsVO.getSectorId().equals(new BigDecimal(34)))
            {
                allHealthCareStocks.add(stockFundamentalsVO);
            }
    });
        List<StockFundementalsVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundementalsVO ::getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());
        String ListOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream().map(x -> x.getTickerSymbol()).collect(Collectors.joining(","));

        return ListOfTop5PerformingStocks;
    }
    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Optional<Long> reduce = allStockFundamentals.stream().map(x -> x.getMarketCap()).reduce((a, b) -> a + b);
        System.out.println(reduce);
        reduce.ifPresent(x -> System.out.println(x));
        //reduce.ifPresent(System.out.println);

        allStockFundamentals.parallelStream().map(x-> x.getMarketCap())
                .reduce((a,b)-> a+b);
    }

    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer, String> collect = allSectorsDAO.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
        return collect;
    }
   // public Map<Integer, List<StockFundementalsVO>> getSubSectorIdGroup() throws SQLException {
        //List<StockFundementalsVO> allGroupSubSectorId = lookUpStockFundamentalsDAO.getStockFundamentals();
        //Map<Integer, List<StockFundementalsVO>> collect = allGroupSubSectorId.stream().collect(Collectors.groupingBy(StockFundementalsVO::getSubSectorId, StockFundementalsVO::getTickerSymbol));
        //return collect;
   // }

    //public void getMapOfSubSectors() throws SQLException {
         //List<StockFundementalsVO> allStockFundamentals =
         //allStockFundamentals.stream().sorted(Comparator.comparing(StockFundementalsVO :: getSubSectorId).thenComparing(StockFundementalsVO :: getTickerSymbol)).collect(Collectors.toList());

    //}

    public Map<Integer,List<String>> getGroupOfTickerSymbols() throws SQLException {
        List<StockFundementalsVO> allSubSectosGroup = lookUpStockFundamentalsDAO.getStockFundamentals();
        Map<Integer,List<String>> groupByTickersSymbol = allSubSectosGroup.stream().collect(Collectors.groupingBy(StockFundementalsVO :: getSubSectorId,Collectors.mapping(StockFundementalsVO::getTickerSymbol,Collectors.toList())));
        return groupByTickersSymbol;
    }

    public List<String> getBlueChipStocks() throws SQLException
    {
      List<StockFundementalsVO> blueTickerSymbols = lookUpStockFundamentalsDAO.getBlueChipStocks();
      List<String> blueTickerStreams = blueTickerSymbols.stream().filter(x ->
            BigDecimal.valueOf(34).equals(x.getSectorId()) && x.getMarketCap() > 10_000_000_000L)
              .map(x -> x.getTickerSymbol())
              .collect(Collectors.toList());

      return  blueTickerStreams;
    }

    public List<StockPriceHistoryVO> getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVO> teslaList =  StockPriceHistoryDAO.getStockPriceHistory(tesla,now);

        return teslaList;


    }

    public Map<BigDecimal,Double> getAvgMarketCap() throws SQLException {
        List<StockFundementalsVO> stockFundamentalsVOS = lookUpStockFundamentalsDAO.getStockFundamentals();
        Map<BigDecimal,Double> averageMarketCap = stockFundamentalsVOS.stream().collect(Collectors.groupingBy(StockFundementalsVO::getSectorId
                , Collectors.averagingLong(StockFundementalsVO::getMarketCap)));
        return averageMarketCap;
    }


}

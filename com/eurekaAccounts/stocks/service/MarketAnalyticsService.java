package com.eurekaAccounts.stocks.service;
// camel casing - sector name - sectorName
 // get sector name - getSectorName()
// Eureka  class - E capital
import com.eurekaAccounts.stocks.Sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {
    LookUpDAO lookupDAO = new LookUpDAO();
    LookUpDAO lookupDAO2 = new LookUpDAO();
    LookUpAllSubSectorDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorDAO();
    LookUpStockFundamentals lookUpStockFundamentalsDAO = new LookUpStockFundamentals();
    companyLocation companyLocation = new companyLocation();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();

    public String getAllSectors() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        Collections.sort(allSectors); // used comparable interface by overriding compareTo and did descending order
        // comparable to perform natural sorting order
        return allSectors.toString();


    }
    //public String getSpecificSectors() throws SQLException {
        //List<SectorVO> specificSectors = lookupDAO2.getSpecificSectorID();
        //return specificSectors.toString();


    //}
    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();

        //Collections.sort(allSubSectors);
        //Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName());
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));

        return allSubSectors.toString();


    }

    public String getAllStockFundementals() throws SQLException {
        List<StockFundamentalVo> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundamentalVo highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }

    public MarketAnalyticsService() throws SQLException {
    }

    public List<CompanyLocationsDAO> getCompanyLocations() throws SQLException {

        List<CompanyLocationsDAO> companyLocationsDAOList = companyLocation.companyLocation();
        return companyLocationsDAOList;

    }


    public List<BigDecimal> getCount() throws SQLException{
        List<BigDecimal> bigDecimals = lookupDAO.getSpecificSectorID();
        return  bigDecimals;
    }
    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundamentalVo> stockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<StockFundamentalVo>allHealthcareStocks = new ArrayList<>();
        stockFundamentals.forEach(stockFundamentalVo -> {
            if ((stockFundamentalVo.getSectorId()==34)) {
                allHealthcareStocks.add(stockFundamentalVo);
            }

        });
        //getting all hea
        List<StockFundamentalVo> allHealthCareStocksFromStreams = stockFundamentals.stream()
                .filter(x -> x.getSectorId()==34)
                .sorted(Comparator.comparing(StockFundamentalVo::getMarketCap).reversed())//to see the best healthcare stock
                .limit(5)
                .collect(Collectors.toList());

        String listOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                .map( x-> x.getTickerSymbol())
                .collect(Collectors.joining(","));

        return listOfTop5PerformingStocks;
    }
    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockFundamentalVo> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
//Optional<StockFundamentalVo> reduce = all
        Optional<Long> sumOfMktCap = allStockFundamentals.stream()
        //allStockFundamentals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a,b)->a+b);
        //sumOfMktCap.ifPresent(x-> System.out.println(x));
        sumOfMktCap.ifPresent(x -> System.out.println(x));

        allStockFundamentals.parallelStream()
                .map(x -> x.getMarketCap())
                .reduce((a,b)->a+b);
    }

    public Map getAllSectorsMap() throws SQLException {
      List<SectorVO> allSectorsDAO=lookupDAO.getAllSectors();
        Map<Integer, String> allSectorsMap = allSectorsDAO.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,
                        SectorVO::getSectorName));
        return allSectorsMap;

    }
   // public Map<Integer,String>getSubSectorIdGroup() throws SQLException {
      //  List<SectorVO> allSectorsDAO = lookUpAllSubSectorDAO.getAllSubSectors();
       // Map<Integer, String> allSectorsMap = allSectorsDAO.stream()
             //   .collect(Collectors.toMap(SectorVO::getSectorId,
                        //SectorVO::getSectorName));
     public void getMapOfSubSectors() throws SQLException {
        List<StockFundamentalVo> allStockFundamental = lookUpStockFundamentalsDAO.getStockFundamentals();
        //allStockFundamental.stream().sorted(Comparator::comparing(StockFundamentalVo::setSubSectorId)
         allStockFundamental.stream()
                 .sorted(Comparator.comparing(StockFundamentalVo::getSubSectorId))
                 .forEach(stock ->
                         System.out.println(
                                 stock.getSubSectorId() + " -> " + stock.getTickerSymbol()
                         )
                 );
     }


    public List<StockPriceHistoryVO> getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVO> teslaList = lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla, now);
        return teslaList;
    }
    public List<String> getBlueChipStocks() throws SQLException
    {
        List<StockFundamentalVo> blueTickerSymbols = lookUpStockFundamentalsDAO.getBlueChipStocks();
        List<String> blueTickerStreams = blueTickerSymbols.stream().filter(x -> x.getSectorId() == 34  && x.getMarketCap() > 10_000_000_000L)
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.toList());

        return  blueTickerStreams;


    }

    public Map<Integer,Double> getAvgMarketCap() throws SQLException {
        List<StockFundamentalVo> stockFundamentalsVOS = lookUpStockFundamentalsDAO.getStockFundamentals();
        Map<Integer, Double> averageMarketCap = stockFundamentalsVOS.stream().collect(Collectors.groupingBy(StockFundamentalVo::getSectorId
                , Collectors.averagingLong(StockFundamentalVo::getMarketCap)));
        return averageMarketCap;


    }


}
package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpAllSubSectorDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
//import com.eurekaAccounts.stocks.dao.LookUpSpecific;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockPriceHistoryDAO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalsVO;
import com.eurekaAccounts.stocks.vo.StockPirceHistoryVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

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
   // LookUpSpecific lookUpDemo = new LookUpSpecific();
    public String getAllSectors(
    ) throws SQLException {
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
        //Collections.sort(new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        //Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        //return allSubSectors.toString();
        //return allSubSectorsDAO;
        return null;


    }

//    public String getLookupDemo() throws SQLException{
//        List<SpecificSectorVO> demos = lookUpDemo.getLookUpDemo();
//        //Collections.sort(demos);
//        return demos.toString();
//    }

    public String getAllStockFundementals() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }

    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllHealthCareSectors() throws SQLException{
        List<StockFundementalsVO> allStockFundamentals =  lookUpStockFundamentalsDAO.getStockFundamentals();
        List<StockFundementalsVO> allHealthCareStocks= new ArrayList<>();
        allStockFundamentals.forEach(stockFundementalsVO -> {
        if(stockFundementalsVO.getSectorId()==34){
            allHealthCareStocks.add(stockFundementalsVO);
        }
    });
        List<StockFundementalsVO> collect = allStockFundamentals.stream()
                .filter(x -> x.getSectorId()==34)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());

        //now only want to see the TickerSymbol
        String ListofTopPerformingStock = allStockFundamentals.stream()
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.joining(","));

        return ListofTopPerformingStock;
    }
    public void getallSumOfMktCap() throws SQLException{
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Optional<BigDecimal> SumofMktCap = allStockFundamentals.stream().map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));


        SumofMktCap.ifPresent(x-> System.out.println());
        SumofMktCap.ifPresent(System.out::println);

         allStockFundamentals.parallelStream().map(x->x.getMarketCap())
                 .reduce((a, b) -> a.add(b));
    }

    public Map<Integer , String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer, String> collect = allSectorsDAO.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));

    return collect;
    }

//    public boolean allSectorsGroup() throws SQLException {
//
//        List<StockFundementalsVO> allSectorDAO1 =
//                lookUpStockFundamentalsDAO.getStockFundamentals();
//
//        List<Integer> subSectorIds = allSectorDAO1.stream()
//                .map(StockFundementalsVO::getSubSectorId)
//                .distinct()
//                .toList();
//
//        System.out.println(subSectorIds);
//
//        return collect;
//    }
    public Map<Integer,List<String>> getGroupOfTickerSymbols() throws SQLException {
    List<StockFundementalsVO> allSubSectosGroup = lookUpStockFundamentalsDAO.getStockFundamentals();
    Map<Integer,List<String>> groupByTickersSymbol = allSubSectosGroup.stream().collect(Collectors.groupingBy(StockFundementalsVO :: getSubSectorId,Collectors.mapping(StockFundementalsVO::getTickerSymbol,Collectors.toList())));
    return groupByTickersSymbol;
}
    public void getTeslaStockPriceHistory(String Tesla, LocalDate now) throws SQLException {
        LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();

//        LocalDate fromDate = LocalDate.of(2024, 10, 1);   // Oct 1, 2024
//        LocalDate toDate   = LocalDate.of(2024, 12, 31);

        List<StockPirceHistoryVO> lookUpStockPriceHistoryDAOStockPriceHistory = lookUpStockPriceHistoryDAO.getStockPriceHistory("TSLA", now);

        System.out.println(lookUpStockPriceHistoryDAOStockPriceHistory);
    }
    public List<String> getBlueChipStocks() throws SQLException
    {
        List<StockFundementalsVO> blueTickerSymbols = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<String> blueTickerStreams = blueTickerSymbols.stream()
                .filter(x -> x.getSectorId() == 34
                        && x.getMarketCap().compareTo(BigDecimal.valueOf(10_000_000_000L)) > 0)
                .map(StockFundementalsVO::getTickerSymbol)
                .collect(Collectors.toList());

        return  blueTickerStreams;
    }
}
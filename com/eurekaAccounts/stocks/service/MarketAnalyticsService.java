package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpAllSubSectorDAO;
import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockPriceHistoryDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalsVO;
import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;
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
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();

    public MarketAnalyticsService() throws SQLException {
    }


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


    public long getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        Collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
        //Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
        //Collections.sort(new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        long collect = allSubSectors.stream().filter(SubSectorVO -> SubSectorVO.getSectorid() % 2 == 0).count();

        Collections.sort(allSubSectors, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        return collect;
        //return allSubSectorsDAO;
        //return allSubSectors


    }

    public String getAllStockFundamentals() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }


    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundementalsVO> allStockFudamentals = lookUpStockFundamentalsDAO.getStockFundamentals();

        List<StockFundementalsVO> allHealthCareStocks = new ArrayList<>();
        allStockFudamentals.forEach(stockFundementalsVO -> {
            if (stockFundementalsVO.getSectorId().equals(new BigDecimal(34))) {  //we cant pass.equals in objects
                allHealthCareStocks.add(stockFundementalsVO);
            }

        });
        //getting all healthcare stocks and then seeing best performance and then seeing top5
        List<StockFundementalsVO> allHealthCareStocksFromStreams = allStockFudamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundementalsVO::getMarketCap).reversed())
                //to see best healthcare stocks
                // 34 sector ids
                .limit(5)  //the best performance
                .collect(Collectors.toList());
        //count is a terminal operator

        //now only to see tickersymbol
        String ListofTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                //.map(x->x.tickersymbol)
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.joining(","));


        return ListofTop5PerformingStocks;

    }

    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Optional<BigDecimal> sumOfMktCap = allStockFundamentals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));
        sumOfMktCap.ifPresent(x -> System.out.println(x));
        sumOfMktCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream().map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));


    }

    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectors = lookupDAO.getAllSectors();
        Map<Integer, String> allSectorsMap = allSectors.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,
                        SectorVO::getSectorName));
        //mapping list to map using tomap method
        return allSectorsMap;
    }


    //value as tickersymbol,key as a subsectorid

    public Map<BigDecimal, List<String>> getAllSubSectorsMap() throws SQLException {

        List<StockFundementalsVO> allstockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Map<BigDecimal, List<String>> collectby = allstockFundamentals.stream()
                .collect(Collectors.groupingBy(StockFundementalsVO::getSectorId, Collectors.mapping(StockFundementalsVO::getTickerSymbol, Collectors.toList())));

        return collectby;
    }






    //stream(), is generally used when we want to do different options like map(), sorting and collect
    // map() is used when there are string objects and we just neeed names, or strings
    // and wee collect them to a list


    public List<String> getAllBlueChipTickers() throws SQLException {
        List<StockFundementalsVO> allBlueTickers = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<String> tickerslistallBlue = allBlueTickers.stream().
                filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .filter(x -> x.getMarketCap().compareTo(new BigDecimal("10000000000")) > 0)
                .map(StockFundementalsVO::getTickerSymbol)
                .collect(Collectors.toList());

        return tickerslistallBlue;


    }


   //


    public void getTeslaStockPriceHistory() {
    }

    public void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVO> allStockPriceHistory = lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla, now);
        System.out.println(allStockPriceHistory);
    }
}





































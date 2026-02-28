package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.sql.Date;

public class MarketAnalyticsService {
    LookUpDAO lookupDAO = new LookUpDAO();
    LookUpDAO lookupDAO2 = new LookUpDAO();
    LookUpDAO lookUpDAO3 = new LookUpDAO();
    LookUpAllSubSectorDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    LookUpCompanyLocationsDAO lookUpCompanyLocationsDAO = new LookUpCompanyLocationsDAO();
    StockFundamentalsVO stockFundamentalsVO = new StockFundamentalsVO();
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
    public String getAllSubSectors() throws SQLException {
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        //Collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
        // Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        return allSubSectors.toString();
        //return allSubSectorsDAO;
        //return allSubSectors.


    }
    public String getAllStockFundementals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundamentalsVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }


    public String getLookUpCompany() throws SQLException{
        List<Companylocation> companylocations = lookUpCompanyLocationsDAO.getLookUpCompany();
        return companylocations.toString();
    }


//    public MarketAnalyticsService() throws SQLException {
//    }
//
//    public boolean getSpecificLocations() {
//        return false;
//    }

    public String getAllHealthCAreSectors() throws SQLException {

        List<StockFundamentalsVO>allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
        allStockFundamentals.forEach(stockFundamentalsVO-> {
            if(stockFundamentalsVO.getSectorId().equals(new BigDecimal(34))){
                stockFundamentalsVOS.add(stockFundamentalsVO);
            }
        });
        //Getting All health Care Sectors
        List<StockFundamentalsVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundamentalsVO::getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());

        //Only See TickerSymbol

        String listofTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                        .map(x->x.getTickerSymbol())
                        .limit(5)
                        .collect(Collectors.joining(","));

        return listofTop5PerformingStocks;

    }


    public void getSumofMaktCapofHelathCareStocks() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Optional<BigDecimal> sumOfMarketCap = allStockFundamentals.stream()
                .map(x->x.getMarketCap())
                .reduce((a,b)->a.add(b));

        sumOfMarketCap.ifPresent(x-> System.out.println(x));
        sumOfMarketCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream().map(x->x.getMarketCap())
                .reduce((a,b)->a.add(b));
    }
    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer, String> collect = allSectorsDAO.stream()
                                        .collect(Collectors.toMap(SectorVO::getSectorId,
                                        SectorVO::getSectorName));

        return collect;
    }

    public void getMapOfSubSectors() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<StockFundamentalsVO> listBySubsectorsAndTickerSymbol =allStockFundamentals.stream()
                                    .sorted(Comparator.comparing(StockFundamentalsVO::getSubSectorId)
                                            .thenComparing(StockFundamentalsVO::getTickerSymbol))
                .collect(Collectors.toList());
        System.out.println(listBySubsectorsAndTickerSymbol);


    }

    public List<String> getAllTopHealthSectorTickers() throws SQLException {
        List<StockFundamentalsVO> topHealthSectors = lookUpStockFundamentalsDAO.getStockFundamentals();
        List<StockFundamentalsVO> sectorList = topHealthSectors.stream().filter(sector -> sector.getSectorId().equals(new BigDecimal(34))).collect(Collectors.toList());

        List<String> TopMostHealthCareTickerSymbols = sectorList.stream().filter(marketCap -> marketCap.getMarketCap().
                compareTo(new BigDecimal("10000000000")) > 0).map(tickerSymbol -> tickerSymbol.getTickerSymbol()).collect(Collectors.toList());

        return TopMostHealthCareTickerSymbols;
    }

    public List<StockPriceHistoryVO>getTeslaStockPriceHistory() throws SQLException {
        LocalDate threeMonthsAgo = LocalDate.now().minusMonths(12);
        Date sqlDate = Date.valueOf(threeMonthsAgo);
         List<StockPriceHistoryVO> Akshay = lookUpStockPriceHistoryDAO.getStockPriceHistory("TSLA", sqlDate);
        return Akshay;
    }



//    public void getTeslaStockPriceHistory(String tsla, LocalDate now) {
//    }
}
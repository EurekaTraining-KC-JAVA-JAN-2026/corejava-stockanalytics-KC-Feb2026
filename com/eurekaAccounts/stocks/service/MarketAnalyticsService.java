package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.CompanyLocationVO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalsVO;
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
    LookUpLocationDAO lookUpLocationDAO =new LookUpLocationDAO();
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
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Collections.sort(allStockFundamentals);
        StockFundementalsVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();


    }

    public MarketAnalyticsService() throws SQLException {
    }
    public String Companydata() throws SQLException {
        List<CompanyLocationVO> Comapnydata = lookUpLocationDAO.getCompanydata();
        return Comapnydata.toString();
    }
    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
//        List<StockFundementalsVO> allHealthCareStocks = new ArrayList<>();
//        allStockFundamentals.forEach(stockFundamentalsVO -> {
//            if(allStockFundamentals.getSectorId().equals(new BigDecimal(34))) {
//                allHealthCareStocks.add(stockFundamentalsVO);
//
//            }
//        });
        List<StockFundementalsVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)) )
                .sorted(Comparator.comparing(StockFundementalsVO::getMarketCap).reversed()).limit(5)
                .collect(Collectors.toList());

//now only want to see TICKER_SYMBOL
        String listofTop5PerformingStocks= allHealthCareStocksFromStreams.stream()
                .map(x-> x.getTickerSymbol())
                .collect(Collectors.joining(","));

        return  listofTop5PerformingStocks;
    }

    public void getSumofMktCapofHealthCareStocks() throws SQLException {
        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        Optional<Long> sumOfMktCap = allStockFundamentals.stream()
                .map(x->x.getMarketCap())
                .reduce((a,b)-> a+b);
        sumOfMktCap.ifPresent(x-> System.out.println(x));
        sumOfMktCap.ifPresent(System.out::println);

//        allStockFundamentals.parallelStream().map(StockFundamentalsVO)
    }
    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer, String> allSectorsMap =  allSectorsDAO.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,SectorVO::getSectorName));
        return allSectorsMap;

    }
    public void getMapOfSubSectors() throws SQLException {
//        List<StockFundementalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        return;
    }

    public void getTeslaStockpricehistory(String tesla, LocalDate now) throws SQLException {
        LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO =new LookUpStockPriceHistoryDAO();
        System.out.println(lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla,now));
    }
}
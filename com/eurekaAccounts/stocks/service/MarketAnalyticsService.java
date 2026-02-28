package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {

    LookupDAO lookupDAO = new LookupDAO();
    LookupSubSectorDAO lookupSubSectorDAO = new LookupSubSectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();
    CompanyLocation companyLocation = new CompanyLocation();
    LookUpStockPriceHistoryDAO stockPriceHistoryDAO=new LookUpStockPriceHistoryDAO();

    public List<SectorVO> getAllSectors() throws SQLException {
        List<SectorVO> resultsector = lookupDAO.getAllSectors();
        return resultsector;
    }

    public List<SubSector> getAllSubSectors() throws SQLException {
        List<SubSector> resultsector1 = lookupSubSectorDAO.getAllSubSectors();
        //resultsector1.stream().filter(subSector->)
        return resultsector1;
    }

    public List<StockFundamentals> getAllStockFundamentals() throws SQLException {
        List<StockFundamentals> resultsector2 = lookUpStockFundamentals.getAllStockFundamentals();
        return resultsector2;
    }

    public List<CompanyLocationsVO> getAllLocations() throws SQLException {
        List<CompanyLocationsVO> resultsector3 = companyLocation.getLocations();
        return resultsector3;
    }

    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundamentals> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        List<StockFundamentals> allHealthCareStocks= new ArrayList<>();
        /*using for loop*/
        allStockFundamentals.forEach(stockFundamentals -> {
            if(stockFundamentals.getSectorId().equals(new BigDecimal(34))){
                allHealthCareStocks.add(stockFundamentals);
            }
                }
                );
        //getting all health care stocks of sector id 34 AND THEN SEEING THE BEST PERFORMING IN TOP 5
        List<StockFundamentals> allHealthCareStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundamentals::getMarketCap).reversed())//to see the best performing health care stock
                .limit(5)
                .collect(Collectors.toList());
        //NOW ONLY WANT TO SEE THE TICKER SYMBOL
        String listofTop5PerfomanceStocks = allHealthCareStreams.stream()
                //.map(x -> x.getTickerSymbol())
                .map(StockFundamentals::getTickerSymbol)
                .collect(Collectors.joining(","));
                //.collect(Collectors.toList());
        return listofTop5PerfomanceStocks;
    }
    public List<String> getBlueChipTickers() throws SQLException {
        List<StockFundamentals> blueChipTickers=lookUpStockFundamentals.getAllStockFundamentals();
        List<String> stockFundamentalsStream = blueChipTickers.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .filter(x -> x.getMarketCap().compareTo(new BigDecimal("10000000000")) > 0)
                .map(StockFundamentals::getTickerSymbol)
                .collect(Collectors.toList());
        return stockFundamentalsStream;
    }

    public void getSumOfMktCapOfHealthCarestocks() throws SQLException {
        List<StockFundamentals> allStockFundamentals =lookUpStockFundamentals.getAllStockFundamentals();
        Optional<BigDecimal> sumOfMarketCap= allStockFundamentals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));

        sumOfMarketCap.ifPresent(x-> System.out.println(x));
        sumOfMarketCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream()
                .map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));



    }
    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookupDAO.getAllSectors();
        Map<Integer, String> allSectorsMap = allSectorsDAO.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,
                        SectorVO::getSectorName));
        return allSectorsMap;
    }

    public Map<Integer, List<String>> getAllStockFundamentalsMap() throws SQLException {
        List<StockFundamentals> allStockFundamentalsMap= lookUpStockFundamentals.getAllStockFundamentals();
        Map<Integer, List<String>> Result = allStockFundamentalsMap.stream()
                .collect(Collectors.groupingBy(StockFundamentals::getSubSectorId, Collectors.mapping(StockFundamentals::getTickerSymbol, Collectors.toList())));

        return Result;
    }
    public List<StockPriceHistoryVO> getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVO> stockPriceHistoryVOS= stockPriceHistoryDAO.getStockPriceHistory(tesla,now);
        return stockPriceHistoryVOS;
    }

}


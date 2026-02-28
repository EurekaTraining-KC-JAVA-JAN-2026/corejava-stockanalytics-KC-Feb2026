package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {
    //this service layer is for doing operations as per requirement
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpAllSubSectorsDAO lookUpAllSubSectorsDAO = new LookUpAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    LookUpCompanyLocationsDAO lookUpCompanyLocationsDAO = new LookUpCompanyLocationsDAO();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();

    public List<CompanyLocationsVO> getAllCompanyLocationsService() throws SQLException {
        List<CompanyLocationsVO> allLocations = lookUpCompanyLocationsDAO.getAllCompanyLocations();
        return allLocations;
    }

    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

    }

    public long getAllSubSectorsService() throws SQLException {
        List<SubSectorVO> allSubSectorDAO = lookUpAllSubSectorsDAO.getAllSubSectorsDAO();
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::toString));

        //Collections.sort(allSectorsDAO);
        //allSubSectorsDAO.sort(SubsectorVO::compareTo);
        //allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::getSectorId).thenComparing(SubSectorVO::getSectorName).thenComparing(SubSectorVO::getSubSectorId));
        //allSubSectorDAO.sort(allSubSectorDAO, new SubSectorNameComparator());
        long collect = allSubSectorDAO.stream().filter(subSectorVO -> subSectorVO.getSectorId() % 2 == 0).count();
        Collections.sort(allSubSectorDAO, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        return collect;
        //return allSubSectors.toString();
    }

    public String getStockFundamentals() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getAllStockFundamentals();
        //Collections.sort(allStockFundamentals);
        //StockfundamentalVO highestStock = allStockFundamentals.get(0);
        //return highestStock.toString();
        return allStockFundamentals.toString();
    }

    public String getAllHealthCareSectors() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getAllStockFundamentals();
        List<StockfundamentalVO> allHealthCareStocks = new ArrayList<>();
        //using a for-loop os traditional way
        allStockFundamentals.forEach(stockfundamentalVO -> {
            if (stockfundamentalVO.getSectorId().equals(new BigDecimal(34))) {
                allHealthCareStocks.add(stockfundamentalVO);

            }
        });
        //getting all healthcare stocks and then seeing best performing and then seeing top 5
        List<StockfundamentalVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockfundamentalVO::getMarketCap).reversed()) //to see best healthcare stocks
                .limit(5) //to see top 5 healthcare stocks
                .collect(Collectors.toList());

        //now only want to see the TICKER_SYMBOL
        String listOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                .map(StockfundamentalVO::getTickerSymbol)
                //.collect(Collectors.toList());
                .collect(Collectors.joining(","));
        return listOfTop5PerformingStocks;
    }

    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getAllStockFundamentals();
        Optional<BigDecimal> sumOfMktCap = allStockFundamentals.stream()
                .map(x->x.getMarketCap())
                .reduce((a,b)->a.add(b));
        sumOfMktCap.ifPresent(x-> System.out.println(x));
        sumOfMktCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream().map(x->x.getMarketCap())
                .reduce((a,b)->a.add(b));
    }

    public Map<Integer, String> getAllSectorsMap() {
        List<SectorVO> allSectorsDAO = lookUpDAO.getAllSectorsDAO();
        Map<Integer, String> allSectorsMap = allSectorsDAO.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,
                        SectorVO::getSectorName));
        return allSectorsMap;
    }

    public void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<StockPriceHistoryVO> allStockPriceHistory = lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla,now);
        System.out.println(allStockPriceHistory);

    }


    //key as a subsector id and value as a list of specific strings (ticker symbol)
    public void getMapOfSubSectors() throws SQLException{

    }


    //get list of bluechip tickersymbols for healthcare sector
//    //blue chip = marketcap>10B
//    public void getBlueChipTickers() throws SQLException {
//        List<StockfundamentalVO> blueChipTickers = lookUpStockFundamentalsDAO.getAllStockFundamentals();
//        List<>

    public List<String> getAllBlueChipTickers() throws SQLException{
        List<StockfundamentalVO> blueChipTickers = lookUpStockFundamentalsDAO.getAllStockFundamentals();
        List<String> stockFundamentalsStream = blueChipTickers.stream().filter(x->x.getSectorId().equals(new BigDecimal(34))).filter(x->x.getMarketCap().compareTo(new BigDecimal("10000000000"))>0).map(StockfundamentalVO::getTickerSymbol).collect(Collectors.toList());
        return stockFundamentalsStream;
    }
}
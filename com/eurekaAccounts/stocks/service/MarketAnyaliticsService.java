package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookUpStockPriceHistoryDAO;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.MarketCapReveresd;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MarketAnyaliticsService {
    public MarketAnyaliticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();

    public String getAllSectorsService() {
        //some opertaions as per requirement
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        /**
         * USING comparable is like using natural order
         * USING comparator we sort in unnatural, fexibility for us sort what ever and what ever...
         * // here we are printing the sectors in desc. order by implementing Comparable interface and overriding compareTo method
         */
        Collections.sort(allSectors);
        return allSectors.toString();
    }

    public long getAllSubSectorsService() throws SQLException {
        List<SubSectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //Collections.sort(allSubSectorsDAO);
        //allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::toString)
        // .thenComparing(SubSectorVO::getSectorId));
        //allSubSectorsDAO.sort(SubSectorVO::compareTo);
        // Collections.sort(allSubSectorsDAO,new SubSectorNameComparator());
        // allSubSectorsDAO.sort(SubSectorNameComparator,);
//        allSubSectorsDAO.sort(Comparator.comparing(SubSectorVO::getSectorId)
//                                        .thenComparing(SubSectorVO::getSubSectorName)
//                                        .thenComparing(SubSectorVO::getSubSectorId));
        long collect = allSubSectorsDAO.stream()
                .filter(subSectorVO -> subSectorVO.getSectorId() % 2 == 0)
                .count();
        Collections.sort(allSubSectorsDAO, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        return collect;
    }

    public List<StockFundamentalsVO> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        //here we are sorting the SF's details on marketCap
        return allStockFundamentals;
    }

    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();

        List<StockFundamentalsVO> allHealCareStocks = new ArrayList<>();
        //using a for-loop is traditional way
        allStockFundamentals.forEach(stockFundamentalsVO -> {
            if (stockFundamentalsVO.getSectorId().equals(new BigDecimal(34))) {
                allHealCareStocks.add(stockFundamentalsVO);
            }
        });
        //getting all health care stocks and then seeing best performing and then seeing top5
        List<StockFundamentalsVO> allHealtCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundamentalsVO::getMarketCap).reversed())
                .limit(5)//to see best healtcare stocks
                .collect(Collectors.toList());

        //now only want to see the TICKER_SYMBOL
        String listOfTop5PerformingStocks = allHealtCareStocksFromStreams.stream()
                // .map(x -> x.getTickerSymbol())// doing by lambda function
                .map(StockFundamentalsVO::getTickerSymbol)//same thing with method referencing
                .collect(Collectors.joining(","));
        return listOfTop5PerformingStocks;
    }


    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Optional<BigDecimal> sumOfMktCap = allStockFundamentals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));
        sumOfMktCap.ifPresent(x -> System.out.println(x));
        sumOfMktCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream().map(x -> x.getMarketCap())
                .reduce((a, b) -> a.add(b));
    }

    public Map<Integer, String> getAllSectorsMap() {
        List<SectorVO> allSectorsDAO = lookUpDAO.getAllSectorsDAO();
        Map<Integer, String> allSectorsMap = allSectorsDAO.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,
                        SectorVO::getSectorName));

        return allSectorsMap;
    }

    public void getMapOfSubSectors() throws SQLException {
        // List<SubSectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
//        Map<City, Set<String>> namesByCity
//                = people.stream().collect(
//                groupingBy(Person::getCity,
//                        mapping(Person::getLastName,
//                                toSet())));
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Map<BigDecimal, List<String>> collect = allStockFundamentals.stream().collect(
                groupingBy(StockFundamentalsVO::getSubSectorId, mapping(StockFundamentalsVO::getTickerSymbol, toList()))
        );
        System.out.println(collect);
    }


    public void getTelsaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();
        System.out.println(lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla,now));
    }
}


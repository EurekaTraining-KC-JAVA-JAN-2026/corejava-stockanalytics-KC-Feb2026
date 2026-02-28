package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.LookUpDAO;
import com.eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import com.eurekaAccounts.stocks.dao.LookUpStockPriceHistoryDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundamentalsVO;
import com.eurekaAccounts.stocks.vo.StockPriceHistoryVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;
import com.eurekaAccounts.stocks.dao.lookUpAllSubSectorDAO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.sql.Date;

public class MarketAnalyticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    lookUpAllSubSectorDAO lookupAllSubSectorsDAO1 = new lookUpAllSubSectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals = new LookUpStockFundamentals();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();

    public String getAllSectorService() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getSpecificSector(35);
        return allSectors.toString();
    }


    public List<SubSectorVO>  getAllSubSectorService() {
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO1.getAllSubSectors();
        Collections.sort(allSubSectors);
        Collections.sort(allSubSectors,new SubSectorNameComparator());
        //allSubSectors.sort(Comparator.comparing(SubSectorVO ::toString));
        allSubSectors.sort(Comparator.comparing(SubSectorVO::getSectorId).
                thenComparing(SubSectorVO::getSubSectorName).
                thenComparing(SubSectorVO::getSubSectorId));

        return allSubSectors;
    }

    public List<StockFundamentalsVO> getStockFundamentals() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Collections.sort(allStockFundamentals);
        return allStockFundamentals;
    }


    public String getAllHealthCareSectors() throws SQLException {

        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
//        List<StockFundamentalsVO> stockFundamentalsVOS = new ArrayList<>();
//        allStockFundamentals.forEach(stockFundamentalsVO -> {
//            if(stockFundamentalsVO.getSectorId().equals(new BigDecimal(34))){
//                stockFundamentalsVOS.add(stockFundamentalsVO);
//
//            }
//        });
        //getting all health care stocks and then seeing best performing and then seeing top 5
        List<StockFundamentalsVO> allHealthCareStocks = allStockFundamentals.stream().
                filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundamentalsVO :: getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());

        //now only want to see the tickersymbol
        //List<Integer> onlyTicketSymbol = allStockFundamentals.stream().map()
       String ListofTopPerformingStocks = allHealthCareStocks.stream()
                .map(x -> x.getTickerSymbol())
                //.collect(Collectors.toList());
                .collect(Collectors.joining(","));

        return ListofTopPerformingStocks;
    }
    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOS = lookUpStockFundamentals.getAllStockFundamentals();
        Optional<Long> sumOfMktCap = stockFundamentalsVOS.stream()
                .map(x->x.getMarketCap())
                .reduce((a,b)->a+b);
        sumOfMktCap.ifPresent(x-> System.out.println(x));

        sumOfMktCap.ifPresent(System.out::println);

        stockFundamentalsVOS.parallelStream().map(x->x.getMarketCap())
                .reduce((a,b)->a+b);

    }

    public Map<Integer,String> getAllSubSectorsMap(){
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO1.getAllSubSectors();
       Map<Integer,String> allSubSectorsMap = allSubSectors.stream()
               .collect(Collectors.toMap(SubSectorVO ::getSubSectorId,
                       SubSectorVO ::getSubSectorName));

       return allSubSectorsMap;

    }

    public Map<Integer,List<String>> getGroupOfTickerSymbols() throws SQLException {
        List<StockFundamentalsVO> allSubSectosGroup = lookUpStockFundamentals.getAllStockFundamentals();
        Map<Integer,List<String>> groupByTickersSymbol = allSubSectosGroup.stream().
                collect(Collectors.groupingBy(StockFundamentalsVO :: getSubSectorId,Collectors
                        .mapping(StockFundamentalsVO::getTickerSymbol,
                                Collectors.toList())));
        return groupByTickersSymbol;
    }


    public List<String> getBlueChipTickerSymbols() throws SQLException {

        List<StockFundamentalsVO> stockFundamentalsVOS = lookUpStockFundamentals.getAllStockFundamentals();

        List<String> blueChipTickerSymbols = stockFundamentalsVOS.stream()
                .filter(x-> x.getSectorId().equals(new BigDecimal(34)))
                .filter(x->x.getMarketCap()> 10000000000L)
                .map(StockFundamentalsVO::getTickerSymbol)
                .toList();
        return blueChipTickerSymbols;
    }



    public List<StockPriceHistoryVO> getTeslaStockPriceHistory(String tsla,Date date) throws SQLException {
        LocalDate threeMonthsAgo = LocalDate.now().minusMonths(12);
        Date sqlDate = Date.valueOf(threeMonthsAgo);
        List<StockPriceHistoryVO> stockPriceHistoryVOS = lookUpStockPriceHistoryDAO.getStockPriceHistory(tsla,date);
        return stockPriceHistoryVOS;
    }


    //get the ave marketcap for each sector store in map int and bigDecimal , key is sectorId and value is ave marketCap
    public Map<BigDecimal,Double> getAveMarketCap() throws SQLException {
        List<StockFundamentalsVO> stockFundamentalsVOS = lookUpStockFundamentals.getAllStockFundamentals();
        Map<BigDecimal,Double> averageMarketCap = stockFundamentalsVOS.stream().collect(Collectors.groupingBy(StockFundamentalsVO::getSectorId
                , Collectors.averagingLong(StockFundamentalsVO::getMarketCap)));
        return averageMarketCap;
    }
}

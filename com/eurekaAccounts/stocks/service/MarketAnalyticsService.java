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
    // this service layer is for doing operations as per requirement
    public MarketAnalyticsService() throws SQLException {
    }

    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO = new LookupAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentals = new LookUpStockFundamentalsDAO();
    StockLookUpsDAO stockLookUpsDAO = new StockLookUpsDAO();
    LookupComanyLocationsDAO lookupComanyLocationsDAO = new LookupComanyLocationsDAO();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();


    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

    }

    public List<CompanyLocationsVO> getCompanyLocationService() throws SQLException {
        List<CompanyLocationsVO> companyLocations = lookupComanyLocationsDAO.getCompanyLocation();
        return companyLocations;

    }

    public List<StockLookupVO> getAllStockLookUpsService() throws SQLException{
        //List<StockLookupVO> stockLookupVOS = stockLookUpsDAO.getAllStockLookUps();
        List<StockLookupVO> stockLookup = stockLookUpsDAO.getAllStockLookUps();
       // Collections.sort(stockLookup);
        return stockLookup;



    }

    public long getAllSubSectorsService() throws SQLException {
        List<SubsectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::toString));

        //Collections.sort(allSubSectorsDAO);
        //allSubSectorsDAO.sort(SubsectorVO::compareTo);
        //allSubSectorsDAO.sort(Comparator.comparing(SubsectorVO::getSectorId).thenComparing(SubsectorVO::getSectorName).thenComparing(SubsectorVO::getSubSectorId));
        //allSubSectorsDAO.sort(allSubSectorsDAO, new SubSectorNameComparator());
        long collect = allSubSectorsDAO.stream()
                .filter(subsectorVO -> subsectorVO.getSectorId()%2 == 0)
                .count();

        Collections.sort(allSubSectorsDAO, new SubSectorNameComparator().thenComparing(SubsectorVO::getSubSectorName));
        return collect;
        //return allSubSectors.toString();

    }

    public String getStockFundamental() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        //Collections.sort(allStockFundamentals);
        //StockfundamentalVO highestStock = allStockFundamentals.get(0);
        return allStockFundamentals.toString();

    }
    //getting all healthcare stocks and then sorting them to top 5
    public String getAllHealthCareSectors() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        List<StockfundamentalVO> allHealthCareStocks = new ArrayList<>();
        allStockFundamentals.forEach(stockfundamentalVO -> {
            if (stockfundamentalVO.getSectorId().equals(new BigDecimal(34))){
                allHealthCareStocks.add(stockfundamentalVO);
            }
        });
        List<StockfundamentalVO> allHealthCareStocksFromStreams = allStockFundamentals
                .stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockfundamentalVO::getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());

        //get only tickersymbol
        String listOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream()
                .map(StockfundamentalVO :: getTickerSymbol)
                .collect(Collectors.joining(","));


        return listOfTop5PerformingStocks;
    }

    public void  getSumOfMktCapOfHealthCareStocks() throws SQLException {
        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
        Optional<BigDecimal> sumOfMktCap = allStockFundamentals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a,b) -> a.add(b));


        sumOfMktCap.ifPresent(x -> System.out.println(x));
        sumOfMktCap.ifPresent(System.out::println);

        allStockFundamentals.parallelStream().map(x -> x.getMarketCap())
                .reduce((a,b) -> a.add(b));
    }

//    public Map<Integer, String> getAllSectorsMap(){
//        List<SectorVO> allSectorsDAO = lookUpDAO.getAllSectorsDAO();
//        Map<Integer, String> collect = allSectorsDAO.stream()
//                .collect(Collectors.groupingBy(StockfundamentalVO::getSubSectorId),
//                Collectors.mapping(Collectors.
//
//        return collect;
//    }

    public List<String> getAllBlueTickers() throws SQLException {
        List<StockfundamentalVO> blueChipTickers = lookUpStockFundamentals.getAllStockFundamentals();
        List<String> stockFundamentalsStream = blueChipTickers.stream().filter(x -> x.getSectorId().equals(new BigDecimal(34))).filter(x->x.getSectorId().equals(new BigDecimal(34))).filter(x->x.getMarketCap().compareTo(new BigDecimal("10000000000"))>0).map(StockfundamentalVO :: getTickerSymbol).collect(Collectors.toList());
        return stockFundamentalsStream;
    }

    public void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException{

        List<StockPriceHistoryVO> stockPriceHistory = lookUpStockPriceHistoryDAO.getStockPriceHistory(tesla,now);
        System.out.println(stockPriceHistory);
    }

//    public void getMapOfSubSectors() throws SQLException {
//        //List<SubsectorVO> allSubSectorsDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
//        List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
//        allStockFundamentals.stream().map(Collectors)


//    public void getBlueChipTicker() throws SQLException {
//        List<StockfundamentalVO> blueChipTickers = lookUpStockFundamentals.getAllStockFundamentals();



    }













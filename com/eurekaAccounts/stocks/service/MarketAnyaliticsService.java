package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MarketAnyaliticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpPractiseDAO lookUpPractiseDAO =new LookUpPractiseDAO();
    LookupAllSubSectorsDAO lookupAllSubSectorsDAO= new LookupAllSubSectorsDAO();
    LookUpStockFundementals lookUpStockFundementalsDAO = new LookUpStockFundementals();
    LookupCompanyLocationsDAO lookupCompanyLocationsDAO = new LookupCompanyLocationsDAO();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();
   // private Object sumOfMarketCap;

    public String getallSectorsFromPractise() throws SQLException{
        List<StockFundementalVO> allfundementals = lookUpPractiseDAO.getallSectorsFromPractise();
        Collections.sort(allfundementals);
        return allfundementals.toString();
    }
     public String getAllSectors()throws SQLException{
        List<SectorVO>  allSectors = lookUpDAO.getAllSectors();
         Collections.sort(allSectors);
         /**
          *  we will not get error now coz we have implemented comparable and overriding compareto method
          *  comparator takes 2 objects and compare
          *
          */
        return allSectors.toString();
        //List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAll;
    }
    public List<SubSectorVO> getAllSubSectors()throws SQLException{
        List<SubSectorVO> allSubSectors = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        Collections.sort(allSubSectors);
      //  allSubSectors.sort(Comparator.comparing(SubSectorVO::getSector_id).thenComparing(SubSectorVO::getSubSector_name).thenComparing(SubSectorVO::getSubSector_id));
      //  Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSector_name));
        //allSubSectors.sort();
        List<SubSectorVO> collect = allSubSectors.stream().filter(subSectorVO -> subSectorVO.getSector_id() % 2 == 0).collect(Collectors.toList());
        return collect;//allSubSectors.toString();
    }
    public MarketAnyaliticsService()throws SQLException{
    }
    public String getAllStockFundementals() throws SQLException {
       List<StockFundementalVO> allStockFundemental = lookUpStockFundementalsDAO.getAllStockFundementals();
//       Collections.sort(allStockFundemental);
      List<StockFundementalVO> highStock= allStockFundemental.stream().sorted(Comparator.comparing(StockFundementalVO::getMarketCap,Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
//        StockFundementalVO highestmarketStock = allStockFundemental.get(0);
        // return  highestmarketStock.toString() ;
        return highStock.toString();
    }
    public String getAllCompanyLocations() throws SQLException {
        List<CompanyLocationsVO> allCompanyLocations = lookupCompanyLocationsDAO.getAllCompanyLocations();
        return allCompanyLocations.toString();
    }

    public String getStatesCount() throws SQLException{
        List<BigDecimal> allStatesCount =lookupCompanyLocationsDAO.getStatesCount();
        return allStatesCount.toString();
    }
    public String getAllHealthcareSectors() throws SQLException {
        List<StockFundementalVO> allStockFundemental = lookUpStockFundementalsDAO.getAllStockFundementals();
        List<StockFundementalVO> allHealthCareStocks = new ArrayList<>();
        //traditional way
     allStockFundemental.forEach(stockFundementalVO -> {
            if(stockFundementalVO.getSectorID().equals(new BigDecimal(34))){
                allHealthCareStocks.add(stockFundementalVO);
            }
        });
        //performing top 5 healthcare stocks
        List<StockFundementalVO> allHealthCareStocksFromStreams = allStockFundemental.stream()
                .filter(x -> x.getSectorID().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockFundementalVO::getMarketCap).reversed())
                .limit(5)
                .collect(Collectors.toList());

        //now only want to see ticker symbol
        String listofHealthCarewithTickerSymbol = allHealthCareStocksFromStreams
                .stream()
                .map(StockFundementalVO::getTickerSymbol)
              //  .map(x -> x.tickerSymbol)
                .collect(Collectors.joining(","));
                //.collect(Collectors.toList());
        // /return listofHealthCarewithTickerSymbol;
        return listofHealthCarewithTickerSymbol;
    }
  public List<String> getBlueChipHealthcareSectors() throws SQLException {
       List<StockFundementalVO> allStockFundementals = lookUpStockFundementalsDAO.getAllStockFundementals();
        List<String> allBlueChipStocksList = allStockFundementals.stream()
                .filter(x->(new BigDecimal(34).equals(x.getSectorID()))&&(x.getMarketCap() > 10_000_000_000L))
                     //.sorted(Comparator.comparing(StockFundementalVO::getMarketCap).reversed())
               .map(x->x.getTickerSymbol())
                .collect(Collectors.toList());
       return allBlueChipStocksList;
    }


    public void getSumOfMarketCapofHealthcareStocks() throws SQLException {
        List<StockFundementalVO> allStockFundementals = lookUpStockFundementalsDAO.getAllStockFundementals();
        Optional<Long> sumOfMarketCap = allStockFundementals.stream()
                .map(x -> x.getMarketCap())
                .reduce((a, b) -> a+b);
        sumOfMarketCap.ifPresent(x-> System.out.println(x));
     sumOfMarketCap.ifPresent(System.out::println);
        allStockFundementals.parallelStream().map(x->x.getMarketCap())
                .reduce((a,b)->a+b);
    }
    public Map<Integer, String> getAllSectorsMAp() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Map<Integer, String> allSectorsMap= allSectors.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId,SectorVO::getSectorName));
        return allSectorsMap;
    }
    //for each sector id list of subsectors name
//    public Map<Integer,List<String>> getAllSubSectorsMap() throws SQLException {
//        List<StockFundementalVO> allStockFundementals = lookUpStockFundementalsDAO.getAllStockFundementals();
//        Map<Integer,List<String>> allStocksSubSector = allStockFundementals.stream().collect(Collectors.groupingBy(StockFundementalVO::getSubSectorID),Collectors.mapping(getTickerSymbol,Collectors.toList()));
//     return allStocksSubSector;
//    }
    //get list of bluechip tickersymbols for healthcare sector
    //blue chip = marketcap>10B
   //get the avg market cap for each sector  key {int and bigdecimal )
    public List<StockPriceHistory> getStockPriceHistory(String tickerSymbol, LocalDate date) throws SQLException {
       List<StockPriceHistory> stockPriceHistories= lookUpStockPriceHistoryDAO.getStockPriceHistory(tickerSymbol,date);
        return stockPriceHistories;
    }

    public Map<BigDecimal,Double> getAvgMarketCap() throws SQLException {
       List<StockFundementalVO> allStockFundementals= lookUpStockFundementalsDAO.getAllStockFundementals();
       Map <BigDecimal,Double> avgMarketCap = allStockFundementals.stream()
               .collect(Collectors.groupingBy(StockFundementalVO::getSectorID,Collectors.averagingLong(StockFundementalVO::getMarketCap)));
       return avgMarketCap;
    }


}

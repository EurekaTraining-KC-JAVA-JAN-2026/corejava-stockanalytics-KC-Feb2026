package eurekaAccounts.stocks.Service;

import eurekaAccounts.stocks.StocksAnalytics;
import eurekaAccounts.stocks.dao.LookUpCompanyLocationDAO;
import eurekaAccounts.stocks.dao.LookUpDAO;
import eurekaAccounts.stocks.dao.LookUpStockFundamentals;
import eurekaAccounts.stocks.dao.LookUpSubsectorDAO;
import eurekaAccounts.stocks.sorting.StockFundamentalComapartor;
import eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import eurekaAccounts.stocks.vo.ComapnyLocationVO;
import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.StockFundamentalsVO;
import eurekaAccounts.stocks.vo.SubSectorVO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MarketAnalyticsService {

    LookUpDAO lookUpDAO=new LookUpDAO();
    LookUpSubsectorDAO lookUpSubsectorDAO =new LookUpSubsectorDAO();
    LookUpStockFundamentals lookUpStockFundamentals=new LookUpStockFundamentals();
    LookUpCompanyLocationDAO lookUpCompanyLocationDAO=new LookUpCompanyLocationDAO();


    public MarketAnalyticsService() throws SQLException {
    }

    public String getAllSectorsServices() throws SQLException {
        List<SectorVO> allSectors=lookUpDAO.getAllSectorsDAO();
            Collections.sort(allSectors);//here we printing the sector in desc by overiding the compareTo method
            return  allSectors.toString();

    }

   public String getALlSubSectorServices() {
      List<SubSectorVO> allSubsectors= lookUpSubsectorDAO.getAllSubSectorsDAO();
//       Collections.sort(allSubsectors);
//       Collections.sort(allSubsectors, new SubSectorNameComparator());
       long count = allSubsectors.stream().filter(subSectorVO -> subSectorVO.getSector_id() % 2 == 0).count();
       System.out.println(count);
       allSubsectors.sort(Comparator.comparing(SubSectorVO::getSector_id).thenComparing(SubSectorVO::getSubsector_name).thenComparing(SubSectorVO::getSubsector_id));

        return allSubsectors.toString();
    }


    public String getAllstockfundamentalsService() throws SQLException {
         List<StockFundamentalsVO> allStockFundamentals =lookUpStockFundamentals.getAllStockFundamentalsDAO();
         Collections.sort(allStockFundamentals,new StockFundamentalComapartor());
         List<StockFundamentalsVO> highest=new ArrayList<>();
           for(int i=0;i<=5;i++){
           highest.add(allStockFundamentals.get(i));

        }


        return highest.toString();


    }

    public String getCompanyLocationServices() throws SQLException {
        List<BigDecimal> allLocations = lookUpCompanyLocationDAO.getComapnyLocationsDAO();
        return allLocations.toString();

    }
    public String getAllHealthCareSectors() throws SQLException {
        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentalsDAO();
        List<StockFundamentalsVO> allHealthCareStocks = new ArrayList<>();
        allStockFundamentals.forEach(stockFundamentalsVO -> {
            if(stockFundamentalsVO.getSector_id()==34)
            {
                allHealthCareStocks.add(stockFundamentalsVO);
            }
        });
        List<StockFundamentalsVO> allHealthCareStocksFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSector_id()==34)
                .sorted(Comparator.comparing(StockFundamentalsVO ::getMarket_cap).reversed())
                .limit(5)
                .collect(Collectors.toList());
        String ListOfTop5PerformingStocks = allHealthCareStocksFromStreams.stream().map(x -> x.getTicker_symbol()).collect(Collectors.joining(","));

        return ListOfTop5PerformingStocks;
    }
//    public void getSumOfMktCapOfHealthCareStocks() throws SQLException {
//        List<StockFundamentalsVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentalsDAO();
//        Optional<Long> reduce = allStockFundamentals.stream().map(x -> x.getMarket_cap()).reduce(BigDecimal.ZERO, BigDecimal::add);
//        reduce.ifPresent(x -> System.out.println(x));
//        //reduce.ifPresent(System.out.println);
//
//        allStockFundamentals.parallelStream().map(x-> x.getMarket_cap())
//                .reduce((a,b)-> a+b);
//    }

    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectorsDAO = lookUpDAO.getAllSectorsDAO();
        Map<Integer, String> collect = allSectorsDAO.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
        return collect;
    }
    // public Map<Integer, List<StockFundementalsVO>> getSubSectorIdGroup() throws SQLException {
    //List<StockFundementalsVO> allGroupSubSectorId = lookUpStockFundamentalsDAO.getStockFundamentals();
    //Map<Integer, List<StockFundementalsVO>> collect = allGroupSubSectorId.stream().collect(Collectors.groupingBy(StockFundementalsVO::getSubSectorId, StockFundementalsVO::getTickerSymbol));
    //return collect;
    // }

    //public void getMapOfSubSectors() throws SQLException {
    //List<StockFundementalsVO> allStockFundamentals =
    //allStockFundamentals.stream().sorted(Comparator.comparing(StockFundementalsVO :: getSubSectorId).thenComparing(StockFundementalsVO :: getTickerSymbol)).collect(Collectors.toList());

    //}

    public Map<Integer,List<String>> getGroupOfTickerSymbols() throws SQLException {
        List<StockFundamentalsVO> allSubSectosGroup = lookUpStockFundamentals.getAllStockFundamentalsDAO();
        Map<Integer,List<String>> groupByTickersSymbol = allSubSectosGroup.stream().collect(Collectors.groupingBy(StockFundamentalsVO :: getSubsector_id,Collectors.mapping(StockFundamentalsVO::getTicker_symbol,Collectors.toList())));
        return groupByTickersSymbol;
    }

    public List<String> getBlueChipStocks() throws SQLException
    {
        List<StockFundamentalsVO> blueTickerSymbols = lookUpStockFundamentals.getBlueChipStocks();
        List<String> blueTickerStreams = blueTickerSymbols.stream()
                .filter(x ->
                        x.getSector_id() == 34 &&
                                x.getMarket_cap() > 10_000_000_000.0
                )
                .map(x -> x.getTicker_symbol())
                .collect(Collectors.toList());
        return  blueTickerStreams;
    }

}


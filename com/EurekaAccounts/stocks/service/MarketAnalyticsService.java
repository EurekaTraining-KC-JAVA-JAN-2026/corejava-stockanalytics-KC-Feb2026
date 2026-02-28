package com.EurekaAccounts.stocks.service;

import com.EurekaAccounts.stocks.dao.LookUpAllSubSectorsDAO;
import com.EurekaAccounts.stocks.dao.LookUpDAO;
import com.EurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import com.EurekaAccounts.stocks.dao.LookUpStockPrceHistoryDAO;
import com.EurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.EurekaAccounts.stocks.vo.SectorVo;
import com.EurekaAccounts.stocks.vo.StockFundamentalsVo;
import com.EurekaAccounts.stocks.vo.StockPricehistoryVO;
import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {
    LookUpDAO lookupDAO = new LookUpDAO();
    LookUpDAO lookupDAO2 = new LookUpDAO();
    StockFundamentalsVo stockFundamentalsVo = new StockFundamentalsVo();
    LookUpAllSubSectorsDAO lookUpAllSubSectorDAO = new LookUpAllSubSectorsDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();

    public String getAllSectors() throws SQLException {
        List<SectorVo> allSectors = lookupDAO.getAllSectors();
        Collections.sort(allSectors);

        // used comparable interface by overriding compareTo and did descending order
        // comparable to perform natural sorting order
        return allSectors.toString();


    }

    public String getSpecificSectors() throws SQLException {
        List<SectorVo> specificSectors = lookupDAO2.getSpecificSectorID();
        return specificSectors.toString();


    }

    public String getAllSubSectors() throws SQLException {
        List<SubSectorVo> allSubSectors = lookUpAllSubSectorDAO.getAllSubSectors();
        //Collections.sort(allSubSectors);
        //SubSectorNameComparator subSectorNameComparator = new SubSectorNameComparator();
        // Collections.sort(allSubSectors,new SubSectorNameComparator());
        //LookUpAllSubSectorDAO.sort(Comparator.comparing)
        //allSubSectors.sort(Comparator.comparing(SubSectorVO :: getSectorid).thenComparing(SubSectorVO :: getSubsectorName));
        //Collections.sort(,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubSectorName));
        Collections.sort(allSubSectors, new SubSectorNameComparator().thenComparing(SubSectorVo::getSubSectorId));
        return allSubSectors.toString();
        //return allSubSectorsDAO;
        //return allSubSectors.


    }

    public List<String> getAllStockFundementals() throws SQLException {
        List<StockFundamentalsVo> allStockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
        //Collections.sort(allStockFundamentals);
        StockFundamentalsVo highestStock = allStockFundamentals.get(0);
        return Collections.singletonList(highestStock.toString());


    }

    public MarketAnalyticsService() throws SQLException {
    }

    public String getTop5HealthCareStocksTraditional() throws SQLException {

        List<StockFundamentalsVo> allStocks =
                lookUpStockFundamentalsDAO.getStockFundamentals();

        List<StockFundamentalsVo> healthCareStocks = new ArrayList<>();

        for (StockFundamentalsVo stock : allStocks) {
            if (stock.getSector_id() == 34) {
                healthCareStocks.add(stock);
            }
        }

        healthCareStocks.sort((a, b) ->
                b.getMarket_cap().compareTo(a.getMarket_cap()));

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.min(5, healthCareStocks.size()); i++) {
            result.append(healthCareStocks.get(i).getTicker_symbol());
            if (i < 4 && i < healthCareStocks.size() - 1) {
                result.append(",");
            }
        }

        return result.toString();
    }

        public boolean getSumOfMktCapOfHealthCareStocks () throws SQLException {
            List<StockFundamentalsVo> allstockFundamentals = lookUpStockFundamentalsDAO.getStockFundamentals();
            Optional<BigDecimal> sumOfMktCap = allstockFundamentals.stream()
                    .map(x -> x.getMarket_cap())
                    .reduce((a, b) -> a.add(b));

            sumOfMktCap.ifPresent(x -> System.out.println(x));
            sumOfMktCap.ifPresent( System.out::println);


            allstockFundamentals.parallelStream().map(x -> x.getMarket_cap())
                    .reduce((a, b) -> a.add(b));
            return false;
        }

        public Map<Integer, String> getAllSectorsMap () throws SQLException {
            List<SectorVo> allSectorsDAO = lookupDAO.getAllSectors();
            Map<Integer, String> allSectorMap = allSectorsDAO
                    .stream()
                    .collect(Collectors.toMap(SectorVo::getSectorId, SectorVo::getSectorName));
            return allSectorMap;
        }


//public boolean allSectorsGroup() throws SQLException {
//
//    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = null;
//    List<StockFundamentalsVo> allSectorDAO1 =
//            lookUpStockFundamentalsDAO.getStockFundamentals();
//
//    List<Integer> subSectorIds = allSectorDAO1.stream().collect()
//            .map(StockFundamentalsVo::getSubsector_id)
//            .distinct()
//            .toList();
//
//    System.out.println(subSectorIds);
//
//    return false;
//}


    //
    public void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException{
        LookUpStockPrceHistoryDAO lookUpStockPrceHistoryDAO = new LookUpStockPrceHistoryDAO();


        LocalDate fromDate = LocalDate.of(2024, 10, 1);   // Oct 1, 2024
        LocalDate toDate   = LocalDate.of(2024, 12, 31);

        List<StockPricehistoryVO> lookUpStockPriceHistoryDAOStockPriceHistory = lookUpStockPrceHistoryDAO.getStockPriceHistory("TSLA", fromDate, toDate);

        System.out.println(lookUpStockPriceHistoryDAOStockPriceHistory);
    }

}
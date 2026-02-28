package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookUpSubSectorDAO lookUpSubSectorDAO = new LookUpSubSectorDAO();
    LookUpStockFundamentalsDAO lookUpStockFundamentalsDAO = new LookUpStockFundamentalsDAO();
    LookUpSPH lookUpSPH = new LookUpSPH();

    LookUpCompanylocations lookUpCompanylocations = new LookUpCompanylocations();

    public String getallcomp() throws SQLException {
        List<CompanyLocationsVO> allcompdetails = lookUpCompanylocations.getallcompanydata();
        return allcompdetails.toString();
    }

    public List<Integer> getallstatecount() throws SQLException {
        List<Integer> newInt = lookUpDAO.getCountStates();

        return newInt;
    }

    public MarketAnalyticsService() {
    }

    public String getAllSectors() {

        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Collections.sort(allSectors);
        return allSectors.toString();
    }

    public String getAllSubSectors() {

        List<SubSectorVO> allSubSectors = lookUpSubSectorDAO.getAllSubSectors();
//        Collections.sort(allSubSectors);
        long count = allSubSectors.stream().filter(subSectorVO -> subSectorVO.getSector_id() % 2 == 0).count();
        Collections.sort(allSubSectors, new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsector_name));
        return allSubSectors.toString();
    }

    public String getAllStockFundamentals() {
        List<StockFundamentalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getallStockFundemental();
        Collections.sort(allStockFundamentals);
        return allStockFundamentals.toString();
    }

    public List<String> getAllhealthSectors() {
        List<StockFundamentalVO> stockFundamentalVOS = lookUpStockFundamentalsDAO.getallStockFundemental();
        List<StockFundamentalVO> allHealthCareStocks = new ArrayList<>();
        stockFundamentalVOS.forEach(stockFundamentalVO -> {
            if (stockFundamentalVO.getSector_id() == 34) {
                allHealthCareStocks.add(stockFundamentalVO);
            }
        });
        List<StockFundamentalVO> collect = stockFundamentalVOS.stream()
                .filter(x -> x.getSector_id() == 34)
                .sorted(Comparator.comparing(StockFundamentalVO::getMarketCap).reversed())
                .collect(Collectors.toList());

        List<String> collect1 = collect.stream().map(x -> x.getTickerSymbol()).collect(Collectors.toList());

        return collect1;
    }

    public void getSumofMktcapofHealthStocks() {
        List<StockFundamentalVO> stockFundamentalVOS = lookUpStockFundamentalsDAO.getallStockFundemental();
        Optional<Long> SumofMktCap = stockFundamentalVOS.stream().map(x -> x.getMarketCap()).reduce((a, b) -> a + b);
        SumofMktCap.ifPresent(x -> System.out.println(x));

//        stockFundamentalVOS.stream()
//                .map(x -> x.getMarketCap())
//                .reduce((a, b) -> a + b);
    }

    public Map<Integer, String> getAllSectorsMap() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectors();
        Map<Integer, String> allSectorsMap = allSectors.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
        return allSectorsMap;
    }

        public Map<Integer, List<String>> getallSubSectorsMap(){
        List<StockFundamentalVO> alldata = lookUpStockFundamentalsDAO.getallStockFundemental();
            Map<Integer, List<String>> map1 = alldata.stream()
                    .collect(Collectors.groupingBy(StockFundamentalVO::getSubsector_id,
                            Collectors.mapping(StockFundamentalVO::getTickerSymbol, Collectors.toList())));

            return map1;
        }
//    public Map<Integer, List<String>> getSubSectorMap() {
//        List<StockFundamentalVO> alldata = lookUpStockFundamentalsDAO.getallStockFundemental();
//        Map<Integer, List<String>> map1 = new HashMap<>();
//        alldata.forEach(Obj -> {
//            map1.computeIfAbsent(Obj.getSubsector_id(), x->new ArrayList<>()).add(Obj.getTickerSymbol());
//        });
//        return map1;
//    }


    public List<StockFundamentalVO> getallBluechipHealthStocks() {
        List<StockFundamentalVO> allStockData = lookUpStockFundamentalsDAO.getallStockFundemental();
        List<StockFundamentalVO> allBluechipHealthStocks = allStockData.stream()
                .filter(x -> ((x.getSector_id() == 34) && (x.getMarketCap() >= 10000000000L)))
                .collect(Collectors.toList());
        return allBluechipHealthStocks;
    }

    public Map<Integer, Long> getallSectoravgMktCap(){
        List<StockFundamentalVO> allStockData = lookUpStockFundamentalsDAO.getallStockFundemental();
        Map<Integer, Long> mapofsectorandmktcp = allStockData.stream()
                .collect(Collectors.groupingBy(StockFundamentalVO::getSector_id,
                        Collectors.collectingAndThen(Collectors.averagingLong(StockFundamentalVO::getMarketCap),
                                Double::longValue)));
        return mapofsectorandmktcp;

    }
//    public String getallsph() throws SQLException {
//        List<SPHVO> sphvo = lookUpSPH.getallsph();
//        return sphvo.toString();
//    }
    public List<SPHVO> getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        List<SPHVO> sphalldata = lookUpSPH.getallsph(tesla,now);
//        List<SPHVO> teslatradingdata = sphalldata.stream()
//                .filter(x -> ((x.getTickerSymbol().equals(tesla)) && (x.getTradingDate().equals(now))))
//                .collect(Collectors.toList());
        return sphalldata;
    }
}

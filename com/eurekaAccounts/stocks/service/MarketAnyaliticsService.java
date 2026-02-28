package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
import com.eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.CompanyLocationsVO;
import com.eurekaAccounts.stocks.vo.SectorVO;
import com.eurekaAccounts.stocks.vo.StockFundementalVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnyaliticsService {
    LookUpDAO lookUpDAO = new LookUpDAO();
    LookupAllSubSectorsDAO lookUpAllSubSectorsDAO= new LookupAllSubSectorsDAO();
    LookUpStockFundementals lookUpStockFundamentalsDAO = new LookUpStockFundementals();
    LookUpCompanyLocationsDAO lookUpCompanyLocationsDAO = new LookUpCompanyLocationsDAO();
    LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO = new LookUpStockPriceHistoryDAO();




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
    public String getAllSubSectors()throws SQLException{
        List<SubSectorVO> allSubSectors = lookUpAllSubSectorsDAO.getAllSubSectorsDAO();
        Collections.sort(allSubSectors);
        allSubSectors.sort(Comparator.comparing(SubSectorVO::getSectorId).thenComparing(SubSectorVO::getSubsectorName).thenComparing(SubSectorVO::getSubsectorId));
        Collections.sort(allSubSectors,new SubSectorNameComparator().thenComparing(SubSectorVO::getSubsectorName));
        //allSubSectors.sort();
        return allSubSectors.toString();
    }
    public MarketAnyaliticsService()throws SQLException{
    }

    public String getAllStockFundementals() throws SQLException {
        List<StockFundementalVO> allStockFundemental = lookUpStockFundamentalsDAO.getAllStockFundementals();
        Collections.sort(allStockFundemental);
        StockFundementalVO highestmarketStock = allStockFundemental.get(0);
        return  highestmarketStock.toString() ;
    }

    public String getLookUpCompanyLocationsDAO() throws SQLException {
        List<CompanyLocationsVO> companyLocation1 = lookUpCompanyLocationsDAO.getCompanyLocation();
        return companyLocation1.toString();
    }

    public BigDecimal getCountOfStates() throws SQLException {
        List<BigDecimal> bigdecimal = lookUpDAO.getCountOfStates();
        return bigdecimal.get(0);
    }

    public List<String> getAllHealthSector() throws SQLException {
        List<StockFundementalVO> allStockFundamentals = lookUpStockFundamentalsDAO.getAllStockFundementals();
        List<StockFundementalVO> allHealthSectors = new ArrayList<>();
        allStockFundamentals.forEach(stockFundementalVO -> {
            if (stockFundementalVO.getSectorID()==34){
                allHealthSectors.add(stockFundementalVO);
            }

        });
        List<StockFundementalVO> allHealthCareSectorsFromStreams = allStockFundamentals.stream()
                .filter(x -> x.getSectorID()==34)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect((Collectors.toList()));

        List<String> alltickesymbol = allHealthCareSectorsFromStreams.stream()
                .map(x -> x.getTickerSymbol())
                .collect(Collectors.toList());

        return alltickesymbol;
    }

//    public void getSumOfMKof
//        List<StockFundementalVO> allStocks = lookUpStockFundamentalsDAO.getAllStockFundementals();
//        Optional<BigDecimal> sumOfMCap = allStocks.stream()
//                .map(x-> x.getMarketCap())
//                .reduce((a,b) -> a.add(b));
//        sumO



    public Map<Integer, String> getAllSectorsMap() throws SQLException {

        List<SectorVO> allSectors1 = lookUpDAO.getAllSectors();
        Map<Integer, String> SectorsMap = allSectors1.stream()
                .collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));
        return SectorsMap;
    }

//    public void getMapOfSubSectos() throws SQLException{
//        List<StockFundementalVO> allSFundamentals = lookUpStockFundamentalsDAO.getAllStockFundementals();
//
//        allSFundamentals.stream()
//                .collect()
//     }

    public  List<String> getBlueChipHealthcareMap() throws SQLException {
        List<StockFundementalVO> allStocks1 =  lookUpStockFundamentalsDAO.getAllStockFundementals();
       List<String> blueChipMap = allStocks1.stream()
                .filter(x -> x.getSectorID() == 34)
                .filter(x -> x.getMarketCap() >10000000000L)
                .map(StockFundementalVO::getTickerSymbol)
               .toList();
        return blueChipMap;
    }



    public static void getTeslaStockPriceHistory(String tesla, LocalDate now) throws SQLException {
        LookUpStockPriceHistoryDAO lookUpStockPriceHistoryDAO1 = new LookUpStockPriceHistoryDAO();
        System.out.println(lookUpStockPriceHistoryDAO1.getStockPriceHistory(tesla,now));

    }

    //get the avg market cap for each sector

}
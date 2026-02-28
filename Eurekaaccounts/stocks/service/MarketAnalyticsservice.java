package Eurekaaccounts.stocks.service;

import Eurekaaccounts.stocks.dao.*;
import Eurekaaccounts.stocks.vo.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MarketAnalyticsservice {
    LookupDAO lookup = new LookupDAO();
    LookupsubsectorDAO lookupsubsectorDAO = new LookupsubsectorDAO();
    CompanylocationDao companylocationDao=new CompanylocationDao();
    LookStockPriceDao lookStockPriceDao=new LookStockPriceDao();
    LookupStockfundamentalsDAO lookupStockfundamentalsDAO = new LookupStockfundamentalsDAO();
    public MarketAnalyticsservice() throws SQLException {
    }
    public String getAllsectorservices() throws SQLException{
//        List<SectorVO> AllSectors=lookup.getAllSectors(34);
        List<SectorVO> AllSectors1=lookup.getAllSectors();
       // Collections.sort(AllSectors);
        // comparable is like natural order
        Collections.sort(AllSectors1);//here we r putting the sectors in desc order by implementing comparable interface
;        return AllSectors1.toString();
    }

    public String tostring() {
//        List<SectorVO> allSectors =lookup.getAllSectors(30);
//        return allSectors.toString();
        List<SectorVO> allSectors1=lookup.getAllSectors();
        return allSectors1.toString();
    }

    public String getAllsubsectorservices() {
        List<SubsectorVO> AllSubSectors=lookupsubsectorDAO.getAllSubsectors();
//       Collections.sort(AllSubSectors);
//getAllsubsectorservices()
//        AllSubSectors.sort(sub);
//        Collections.sort(AllSubSectors,new SubsectorsnameComparator().thenComparing(SubsectorVO ::getSubsector_name));
        //Collections.sort(AllSubSectors, new SubsectorsnameComparator().thenComparing(SubsectorVO::getSubsector_name).thenComparing(SubsectorVO::getSector_id));
        AllSubSectors.sort(Comparator.comparing(SubsectorVO::getSector_id).thenComparing(SubsectorVO::getSubsector_name));
        return AllSubSectors.toString();
    }
//    public List<stockfundamentalVO> getstockfundamental() throws SQLException{
////        List<stockfundamentalVO> stockfundamental= lookupsubsectorDAO.
////        Collections.sort(stockfundamental);
//        List<stockfundamentalVO> topfive=new ArrayList<>();
//       Collections.sort(stockfundamental,new stockfundamentalcomparator());
//       for(int i=0;i<=5;i++){
//           topfive.add(stockfundamental.get(i));
//       }
//        return topfive;
//    }
    public String getspecifclocation() throws SQLException {
        List<CompanylocationVO> companylocation=CompanylocationDao.getspecifclocation();
        return companylocation.toString();
    }
    public List<String>  getallhealthsector() throws SQLException {
        List<StockfundamentalVO> fundamentalists = lookupStockfundamentalsDAO.getAllstockfundamentals();
        List<StockfundamentalVO> allhealthcaresectors =new ArrayList<>();
        fundamentalists.forEach(stockfundamentalVO->{
            if(stockfundamentalVO.getSector_id() ==34){
                allhealthcaresectors .add(stockfundamentalVO);
            }
        });
      List<StockfundamentalVO> allhealthcarestocks1=  allhealthcaresectors.stream()
              .filter(x->x.getSector_id()==34)
              .sorted(Comparator.comparing(StockfundamentalVO::getMarket_cap).reversed())
              .limit(5)
                .collect(Collectors.toList());
//        System.out.println(allhealthcarestocks1);
//        //now only want to ticker symbol
//
        List<String> collect = allhealthcarestocks1.stream()
                .map(x -> x.getTicker_symbol())
                .collect(Collectors.toList());
        return collect;
    }
    //sum of marketcap
    public Optional<BigDecimal> getsumofmarketcapofhealthcarestocks() throws SQLException {
        List<StockfundamentalVO>  allstockfundamentals  =lookupStockfundamentalsDAO.getAllstockfundamentals();
        Optional<BigDecimal> sumofmarkt= allstockfundamentals.stream()
                .map(x ->x.getMarket_cap())
                .reduce((a,b)->a.add(b));
        sumofmarkt.ifPresent(x -> System.out.println(x));
        sumofmarkt.ifPresent(System.out::println);
        allstockfundamentals.parallelStream().map(x->x.getMarket_cap())
                .reduce((a,b)->a.add(b));
        return sumofmarkt;
    }
//Convert a list of Sector objects into a Map where sector_id is the key and sector_name is the value.”
    public Map<Integer, String> getallsectorMap(){
    List<SectorVO> allsectors=lookup.getAllSectors();
       Map<Integer, String> Allsectormap= allsectors.stream()
                .collect(Collectors.toMap(SectorVO::getSector_id,SectorVO::getSector_name));
    return Allsectormap;
}
////get list of bluechip tickersymbols for healthcare sector
//    public Map<Integer, List<String>> gettickersymbolMap() throws SQLException {
//        BigDecimal tenBillion=new BigDecimal("10000000000");
//        List<StockfundamentalVO> allstockfundamentals = lookupStockfundamentalsDAO.getAllstockfundamentals();
//        Map<Integer, String> collect = allstockfundamentals.stream()
//                .filter(x ->x.getSector_id()==34)
//                .filter(x->x.getMarket_cap().compareTo())
//                .collect(Collectors.toMap(StockfundamentalVO::getSubsector_id, StockfundamentalVO::getTicker_symbol));
//        return Map.of();
    public List<String> getbluechiphealthcaresector() throws SQLException {
        List<StockfundamentalVO> allstockfundamentals = lookupStockfundamentalsDAO.getAllstockfundamentals();
        List<String> stringStream = allstockfundamentals.stream().filter(x -> x.getSector_id() == 34)
                .filter(x -> x.getMarket_cap().compareTo(new BigDecimal("10000000000")) > 0)
                .map(StockfundamentalVO::getTicker_symbol).toList();
        return stringStream;
    }
public List<StockpricehistoryVO> getallstockpricehistoryy() throws SQLException {
        List<StockpricehistoryVO> stockpricehistoryVOList=lookStockPriceDao.getstockpricehistory("TSLA", LocalDate.now());
        return stockpricehistoryVOList;
}

    }




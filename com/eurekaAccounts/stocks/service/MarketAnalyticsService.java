package com.eurekaAccounts.stocks.service;

import com.eurekaAccounts.stocks.dao.*;
//import com.eurekaAccounts.stocks.dao.LookUpStockFundamnetalsDAO;
import com.eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import com.eurekaAccounts.stocks.vo.*;
//import com.eurekaAccounts.stocks.vo.StockFundamentalsDAO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class MarketAnalyticsService {

    private final LookUpDAO lookUpDAO = new LookUpDAO();
    private final LookUPSubDAO lookUpSubDAO = new LookUPSubDAO();

    private final StockDAO stockDAO = new StockDAO();


    public MarketAnalyticsService() throws SQLException {
    }

    public List<SectorVO> getAllSectorsService() throws SQLException {

        return lookUpDAO.getAllSectorsDAO();
    }

    public List<SubSectorVO> getAllSubSectorsService() {

        List<SubSectorVO> allSubSectorsVO = lookUpSubDAO.getAllSubSectorVO();
        Collections.sort(allSubSectorsVO, new SubSectorNameComparator());
        return allSubSectorsVO;
    }

    public List<StockVO> getAStockWithReq() throws SQLException{

        StockDAO stockDAO1 = new StockDAO();
        List<StockVO>  aStockWithReq = stockDAO1.getAStockWithReq();

        List<StockVO> filtered =
                aStockWithReq.stream()
                        .filter(stock -> stock.getSector_id() == 34)
                        .toList();

        System.out.println(filtered);


        return  aStockWithReq;




    }


    private final LookUpStockFundamentalsDAO stockFundamentalsDAO = new LookUpStockFundamentalsDAO();

    public List<StockFundamentalsVO> getAllStockFundamentalsService() throws SQLException {
        List<StockFundamentalsVO> stocks = stockFundamentalsDAO.getAllStockFundamentals();
        Collections.sort(stocks);
        return
                stocks;
    }

    public List<String> getAllHealthCareSectors() throws SQLException{
        String getAllHealthStocks = stockFundamentalsDAO.getAllStockFundamentals()
                .stream()
                .map(x->x.getTickerSymbol())
                .toString();

        return Collections.singletonList(getAllHealthStocks);

    }
//    List<StockFundamentalsVO> getAllHealthStocks = stockFundamentalsDAO.getAllStockFundamentals().

//    public List<StockFundamentalsVO> getAllHealthCareSectors() throws SQLException {
//        List<StockFundamentalsVO> stockFundamentals = stockFundamentalsDAO.getAllStockFundamentals();
//        stockFundamentals.forEach(stockFundamentalsVO -> {
//        stockFundamentalsVO.getSectorId().equals(new BigDecimal(34));{
//            stockFundamentals.add(stockFundamentalsVO);
//        }
//        });
//        return stockFundamentals;
//
//    }


    public Map<Integer, String> getAllSectorsMap() throws SQLException {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO() ;
        Map<Integer, String> collect = allSectors.stream().collect(Collectors.toMap(SectorVO::getSectorId, SectorVO::getSectorName));

        return collect;

    }

    public Map<Integer, List<String>> getAllSubSectorsMap() throws SQLException{
        List<SubSectorVO> allSubSectors = lookUpSubDAO.getAllSubSectorVO();

//        allSubSectors.stream().collect(Collectors.toMap(SubSectorVO::getSubSectorId, )).collect(Collectors.toMap(SubSectorVO::getSubSectorId, ))


        Map<Integer, List<String>> result =
                allSubSectors.stream()
                        .collect(Collectors.groupingBy(
                                SubSectorVO::getSubSectorId,
                                Collectors.mapping(
                                        SubSectorVO::getTicker_name,
                                        Collectors.toList()
                                )));

        return result;


    }

    public void getAllStocksBlue() throws SQLException {

        StockDAO stockDAO1 = new StockDAO();
        List<StockVO> allblueStocks = stockDAO1.getAllBlueChipStoks();

        System.out.println(allblueStocks);
        System.out.println(allblueStocks.size());



    }

    public void getStockPriceHistoryStocks(String ticker_name, LocalDate now ) throws SQLException {
        LookUpStockPriceHistoryDAO dao1 = new LookUpStockPriceHistoryDAO();


        List<StockPriceHistoryVO> sphmarket = dao1.getStockPriceHistory("TSLA", now);

        System.out.println(sphmarket);
    }









}
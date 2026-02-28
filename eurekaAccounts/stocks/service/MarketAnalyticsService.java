package eurekaAccounts.stocks.service;

//import eurekaAccounts.stocks.dao.CompanyLocationDAO;

import eurekaAccounts.stocks.dao.LookUpDAO;
import eurekaAccounts.stocks.dao.LookUpStockFundamentalsDAO;
import eurekaAccounts.stocks.dao.LookUpStockPriceHistoryDAO;
import eurekaAccounts.stocks.dao.LookupAllSubSectorsDAO;
import eurekaAccounts.stocks.sorting.SubSectorNameComparator;
import eurekaAccounts.stocks.vo.SectorVO;
import eurekaAccounts.stocks.vo.StockfundamentalVO;
import eurekaAccounts.stocks.vo.StockpricehistoryVO;
import eurekaAccounts.stocks.vo.SubsectorVO;

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



    public String getAllSectorsService() {
        List<SectorVO> allSectors = lookUpDAO.getAllSectorsDAO();
        //Collections.sort(allSectors);
        Collections.sort(allSectors);
        return allSectors.toString();

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
        Collections.sort(allStockFundamentals);
        StockfundamentalVO highestStock = allStockFundamentals.get(0);
        return highestStock.toString();

    }
    public List<StockfundamentalVO> getAllStockFundamentals() throws SQLException {
        List<StockfundamentalVO> allStockFundamentalsVO = lookUpStockFundamentals.getAllStockFundamentals();
        List<StockfundamentalVO> allHealthCareStocks = new ArrayList<>();
        //using traditional way
        allStockFundamentalsVO.forEach(stockfundamentalVO -> {
            if (stockfundamentalVO.getSectorId()) {
                allHealthCareStocks.add(stockfundamentalVO);
            }
        });

        List<StockfundamentalVO> allHealthCareStocksFromStream = getAllStockFundamentals().stream()
                .filter(x -> x.getSectorId().equals(new BigDecimal(34)))
                .sorted(Comparator.comparing(StockfundamentalVO::getMarketCap).reversed())
                .limit(5)//to see top 5 only
                .collect(Collectors.toList());

        //now only want to see TICKER_SYMBOL

        allHealthCareStocksFromStream.stream()
                .map(x -> x.getTickerSymbol().equals(new BigDecimal(34)))
                .collect(Collectors.joining(","));


        return allHealthCareStocksFromStream;
    }
        public void getSumOfMarketCapOfHealthCareStocks() throws SQLException{
            List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
            Optional<StockfundamentalVO> sumOfMarketCap = allStockFundamentals.stream()
                    .map(x->x.getMarketCap())
                    .reduce((a,b)->a.add(b));

            sumOfMarketCap.ifPresent(x-> System.out.println(x));
            sumOfMarketCap.ifPresent(System.out::println);


            allStockFundamentals.parallelStream().map(x->x.getMarketCap())
                    .reduce((a,b)->a.add(b));
        }

        public Map<Integer,String> getAllSectorsMap(){
            List<SectorVO> allSectorDAO = lookUpDAO.getAllSectorsDAO();
            Map<Integer,String> allSectorsMap =allSectorDAO.stream()
                    .collect(Collectors.toMap(SectorVO::getSectorId,
                                            SectorVO::getSectorName));

            return allSectorsMap;
        }

        public Map<Integer,String> getAllSubSectorsMap(){
        List<SubsectorVO> allSubSubSectorDAO = lookupAllSubSectorsDAO.getAllSubSectorsDAO();
        Map<Integer,String> allSubSectorMap = allSubSubSectorDAO.stream()
                .collect(Collectors.toMap(SubsectorVO::getSubSectorId,
                                        SubsectorVO::getSubSectorName));

            return allSubSectorMap;
        }


        public void getMapOfSubSectors() throws SQLException{
          List<StockfundamentalVO> allStockFundamentals = lookUpStockFundamentals.getAllStockFundamentals();
          allStockFundamentals.stream()
                  .sorted(Collectors.comparing(StockfundamentalVO::getSubSectorId)
                          .then(StockfundamentalVO::getTickerSymbol))
                  .collect(Collectors.toList());

            System.out.println(listBySubSectorIdAndTickerSymbol);
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






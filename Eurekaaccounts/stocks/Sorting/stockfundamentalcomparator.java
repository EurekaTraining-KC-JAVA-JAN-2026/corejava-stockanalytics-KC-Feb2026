package Eurekaaccounts.stocks.Sorting;

import Eurekaaccounts.stocks.vo.StockfundamentalVO;

import java.util.Comparator;

public class stockfundamentalcomparator implements Comparator<StockfundamentalVO> {
    @Override
    public int compare(StockfundamentalVO o1, StockfundamentalVO o2) {
        return o2.market_cap.compareTo(o1.market_cap);
    }
}

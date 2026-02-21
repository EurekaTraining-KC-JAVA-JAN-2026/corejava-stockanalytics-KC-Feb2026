package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;
import java.util.function.Function;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {
    public SubSectorNameComparator() {
    }



//    @Override
//    public <U> Comparator<SubSectorVO> thenComparing(Function<? super SubSectorVO, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
//        return Comparator.super.thenComparing(keyExtractor, keyComparator);
//    }

    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        return Integer.compare(o1.sectorId,o2.sectorId);
    }
}

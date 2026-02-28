package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.util.Comparator;
import java.util.function.Function;

public class SubSectorNameComparator implements Comparator<SubsectorVO> {

    public SubSectorNameComparator() {
    }


    @Override
    public <U> Comparator<SubsectorVO> thenComparing(Function<? super SubsectorVO, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public int compare(SubsectorVO o1, SubsectorVO o2) {
       return o1.sectorId - o2.sectorId;


    }
}

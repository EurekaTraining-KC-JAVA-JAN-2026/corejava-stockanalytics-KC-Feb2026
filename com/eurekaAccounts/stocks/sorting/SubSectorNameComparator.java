package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;
import java.util.function.Function;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {
    public SubSectorNameComparator() {

    }
    @Override
    public <U extends Comparable<? super U>> Comparator<SubSectorVO> thenComparing(Function<? super SubSectorVO, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }
    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
       if(o1.sector_id > o2.sector_id){
           return 1;//
       } else if (o1.sector_id < o2.sector_id) {
           return -1;//
       }
       return 0;
    }
}

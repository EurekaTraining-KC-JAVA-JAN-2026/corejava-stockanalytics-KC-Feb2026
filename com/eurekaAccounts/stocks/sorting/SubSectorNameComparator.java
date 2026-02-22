package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {

    public SubSectorNameComparator() {
    }



    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if (o1.sectorid > o2.sectorid) return -1;
        else if (o1.sectorid < o2.sectorid) return 1;
        else return 0;
    }

}

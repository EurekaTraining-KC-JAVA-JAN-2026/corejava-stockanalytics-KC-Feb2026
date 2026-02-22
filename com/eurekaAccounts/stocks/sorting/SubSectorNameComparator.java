package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;
import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {

    public SubSectorNameComparator() {
    }
//    @Override
//    public int compare(SubsectorVO o1, SubsectorVO o2) {
//        return o1.subSectorName.compareTo(o2.getSubSectorName());
//    }

    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if (o1.sectorId > o2.sectorId) {
            return 1;
        } else if (o1.sectorId < o2.sectorId) {
            return -1;
        } else {
            return 0;
        }
    }
}
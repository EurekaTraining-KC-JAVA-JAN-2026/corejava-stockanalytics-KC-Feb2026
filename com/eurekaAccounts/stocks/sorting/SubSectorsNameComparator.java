package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubsectorVO;

import java.util.Comparator;

public class SubSectorsNameComparator implements Comparator<SubsectorVO> {

    public SubSectorsNameComparator() {
    }
//    @Override
//    public int compare(SubsectorVO o1, SubsectorVO o2) {
//        return o1.subSectorName.compareTo(o2.getSubSectorName());
//    }

    @Override
    public int compare(SubsectorVO o1, SubsectorVO o2) {
        if (o1.sectorId > o2.sectorId) {
            return 1;
        } else if (o1.sectorId < o2.sectorId) {
            return -1;
        } else {
            return 0;
        }
    }
}

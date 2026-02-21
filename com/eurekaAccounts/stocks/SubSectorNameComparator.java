package com.eurekaAccounts.stocks;

import com.eurekaAccounts.stocksVO.SubSectorVO;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {

    public SubSectorNameComparator() {
    }

    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if(o1.sectorId> o2.sectorId)
            return 1;
        else if (o1.sectorId< o2.sectorId)
            return -1;
        else
            return 0;
    }
}

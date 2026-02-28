package com.EurekaAccounts.stocks.sorting;

import com.EurekaAccounts.stocks.vo.SubSectorVo;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVo> {
    public SubSectorNameComparator() {
    }



    @Override
    public int compare(SubSectorVo o1, SubSectorVo o2) {
        if (o1.sectorId>o2.sectorId) return 1;
        else if (o1.sectorId<o2.sectorId) return -1;
        return 0;
    }

}

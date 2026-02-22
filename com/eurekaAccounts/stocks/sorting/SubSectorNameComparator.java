package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {


    public SubSectorNameComparator() {
    }

    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if (o1.sector_id > o2.sector_id) return 1;
        else if (o1.sector_id < o2.sector_id) return -1;
        else return 0;
    }
}

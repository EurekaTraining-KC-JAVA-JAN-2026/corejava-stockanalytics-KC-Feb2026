package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {

    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        return o1.subsectorName.compareTo(o2.subsectorName);
    }
}

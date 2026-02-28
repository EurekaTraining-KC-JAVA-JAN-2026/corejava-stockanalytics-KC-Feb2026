package com.eurekaAccounts.stocks.sorting;

import com.eurekaAccounts.stocks.vo.SectorVVo;

import java.util.Comparator;

public class SectorsComparator implements Comparator<SectorVVo> {

    public SectorsComparator() {
    }

    @Override
    public int compare(SectorVVo o1, SectorVVo o2) {
        return o2.sector_id - o1.sector_id;
    }
}

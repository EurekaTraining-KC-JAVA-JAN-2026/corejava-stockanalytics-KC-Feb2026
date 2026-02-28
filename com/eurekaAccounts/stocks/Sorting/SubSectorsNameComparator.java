package com.eurekaAccounts.stocks.Sorting;

import com.eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;

public class SubSectorsNameComparator implements Comparator<SubSectorVO> {
    public SubSectorsNameComparator(){

    }



    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if(o1.sectorid>o2.sectorId)
            return 1;
        else if(o1.sectorId<o2.sectorId)
            return -1;
        else
            return 0;
        //return o1.subsectorname.compareTo(o2.subsectorname);
    }
}
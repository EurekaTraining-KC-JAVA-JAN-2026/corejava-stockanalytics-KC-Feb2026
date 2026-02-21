package eurekaAccounts.stocks.sorting;

import eurekaAccounts.stocks.vo.SubSectorVO;

import java.util.Comparator;
import java.util.function.Function;

public class SubSectorNameComparator implements Comparator<SubSectorVO> {


    @Override
    public int compare(SubSectorVO o1, SubSectorVO o2) {
        if(o1.subsector_id>o2.subsector_id){
            return 1;
        } else if (o1.subsector_id< o2.subsector_id) {
            return -1;
        }
        else{
            return 0;
        }
    }



}

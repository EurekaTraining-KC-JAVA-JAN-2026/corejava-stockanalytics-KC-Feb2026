package Eurekaaccounts.stocks.Sorting;

import Eurekaaccounts.stocks.vo.SubsectorVO;

import java.util.Comparator;
import java.util.function.Function;

public class SubsectorsnameComparator implements Comparator<SubsectorVO> {
    @Override
    public int compare(SubsectorVO o1, SubsectorVO o2) {
//        return o1.subsector_name.compareTo(o2.subsector_name);
        if(o1.subsector_id>o2.subsector_id){
            return -1;
        }else if (o1.subsector_id<o2.subsector_id){
            return 1;
        }else{
            return 0;
        }
    }
}

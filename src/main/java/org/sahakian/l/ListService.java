package org.sahakian.l;

import java.util.List;

public class ListService {

    public List<String> merge(List<String> list1,List<String> list2){
        list1.addAll(list2);
        return list1;
    }
}

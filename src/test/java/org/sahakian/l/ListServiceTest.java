package org.sahakian.l;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListServiceTest {

    @Test
    void merge() {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        List<String> list2 = Arrays.asList("3","4");

        ListService listService = new ListService();
        List<String> merge = listService.merge(list1, list2);

        assertEquals(merge.size(),4);
    }
}